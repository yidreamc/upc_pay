let login = new Vue({
    el: '#admin',
    data() {
        return {
            pays: [],
            activeName: 'first',
            errdialog: false,
            errmes: '',
            qrcode: false,
            qrcodeurl: '',
            editFormVisible: false,
            form: {
                options: [
                    {
                        name: '',
                        value: '',
                        key: Date.now()
                    }
                ],
                isIndefine: '2',
                type: '2',
                p1code: '0',
                p2code: '0',
                isBill: '2'
            },
            sadmin: false,
            editform1: {
                options: []
            },
            noschool: true,
            isIndefine: false,
            editIsIndefine: false,
            isBill:false,
            editIsBill: false,
            rules: {
                name: [
                    {required: true, message: '名字不能为空', trigger: 'blur'},
                ],
                type: [
                    {required: true, message: '类型不能为空', trigger: 'change'},
                ],
                op: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
                subsysid: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
                sysid: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
                feeitemid: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
                cert: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
            },
            adminid: '',
            adminname: '',
            admins: [],
            bills: []
        }
    },
    mounted() {
        var self = this;

        axios.get('/getpays').then((res) => {
            self.pays = res.data;
        })

        axios.get('/getadmin').then((res) => {

            if(res.data.sadmin == 1){
                self.sadmin = true;
            }
        })

        axios.get('/getBill').then((res) => {
            self.bills = res.data
        })

        this.getAdmin()

    },
    methods: {
        changeType(index) {
            if (index == 1) {
                this.noschool = false;
            } else {
                this.noschool = true;
            }
        },
        changeIndefine(index) {
            if (index == 1) {
                this.isIndefine = true;
            } else {
                this.isIndefine = false;
            }
        },
        changeIsBill(index) {
            if (index == 1) {
                this.isBill = true;
            } else {
                this.isBill = false;
            }
        },
        changeEditIndefine(index){
            if (index == 1) {
                this.editIsIndefine = true;
            } else {
                this.editIsIndefine = false;
            }

        },
        addOpt() {

            this.form.options.push({
                key: Date.now(),
                value: '',
                name: ''
            })
        },
        addEditOpt() {
            this.editform1.options.push( { type: "", money: "",key: Date.now()})
        },
        removeOpt(item) {
            var index = this.form.options.indexOf(item)
            if (index !== -1) {
                this.form.options.splice(index, 1)
            }
        },
        removeOptEdit(item){
            var index = this.editform1.options.indexOf(item)
            if (index !== -1) {
                this.editform1.options.splice(index, 1)
            }
        },
        create(formName) {
            let self = this;
            this.$refs[formName].validate((valid) => {

                var f = this.form.options;
                this.form.stringify = JSON.stringify(f);


                if (valid) {
                    axios.post('/create', this.form).then((res) => {
                        console.log(res)
                        if (res.data.code == 0) {
                            self.errmes = res.data.message;
                            self.errdialog = true;
                        }

                        if (res.data.code == 1) {
                            self.qrcode = true;
                            self.qrcodeurl = res.data.qrcodeurl;
                        }

                        axios.get('/getpays').then((res) => {
                            this.pays = res.data;
                        })

                    })

                } else {
                    return false;
                }
            });
        },

        edit(formName) {
            let self = this;
            this.$refs[formName].validate((valid) => {

                var f = this.editform1.options;
                this.editform1.stringify = JSON.stringify(f);
                if (valid) {
                    axios.post('/edit', this.editform1).then((res) => {

                        if (res.data.code == 0) {
                            self.errmes = res.data.message;
                            self.errdialog = true;
                        }

                        if (res.data.code == 1) {
                            this.editFormVisible = false;
                            let self = this;
                            axios.get('/getpays').then((res) => {
                                self.pays = res.data;
                                self.$message({
                                    message: '修改成功',
                                    type: 'success'
                                });
                            })

                        }
                    })

                } else {
                    return false;
                }
            });
        },

        deletPayment(index, row){
            var f = Object.assign({}, row);
            var id = row.id;
            var postdata = {
                id: id
            }
            axios.post('/delete',postdata).then((res)=>{
                if(res.data == 1){
                    axios.get('/getpays').then((res) => {
                        this.pays = res.data;
                    })
                }
            })
        },

        deletBill(index, row){
            var f = Object.assign({}, row);
            var id = row.taxCode;
            var postdata = {
                id: id
            }
            axios.post('/deleteBill',postdata).then((res)=>{
                if(res.data == 1){
                    axios.get('/getBill').then((res) => {
                        this.bills = res.data;
                    })
                }
            })
        },


        handleEdit: function (index, row) {


            var f = Object.assign({}, row);
            f.p1code = f.p1code.toString();
            f.p2code = f.p2code.toString();
            f.editUrl = "http://qr.liantu.com/api.php?&w=200&text=http://wxsportscard.upc.edu.cn:8088/pay?id=" + f.id;
            f.type = f.type.toString();


            if (f.type == 1) {
                this.noschool = false;
            } else {
                this.noschool = true;
            }
            axios.get('/getType?id=' + f.id).then((res) => {

                f.options = []
                for(var i = 0;i<res.data.length; i++){
                    f.options = res.data
                }
                // this.editform1.options =  res.data


                this.editIsIndefine = true
                if(f.indefine == true){
                    f.isIndefine = '1'
                    this.editIsIndefine = true
                }else {
                    f.isIndefine = '2'
                    this.editIsIndefine = false
                }

                if(f.bill == true){
                    f.isBill = '1'
                    this.editIsBill = true
                }else {
                    f.isBill = '2'
                    this.editIsBill = false
                }

                this.editform1 = f;
            });
            this.editFormVisible = true;

        },
        fileUpload(response, file, fileList){
            var self = this;
            if(response.code == 0){
                this.$message({
                    message: '添加成功',
                    type: 'success'
                });
                axios.get('/getBill').then((res) => {
                    self.bills = res.data
                })
            }else {
                this.$message({
                    message: '上传失败，请检查文件格式',
                    type: 'warning'
                });
            }
        },
        getAdmin(){
            axios.get('/allAdmin').then((res) => {
                this.admins = res.data;
                // console.log(res)
            })
        },
        addAdmin(){
            var postData = {
                adminid: this.adminid,
                adminname: this.adminname
            };
            var self = this;
            axios.post('/addAdmin',postData).then((res) => {
                //this.admins = res.data;
                console.log(res)

                //success
                if(res.data.code == 0){
                    self.$message({
                        message: '创建成功！',
                        type: 'success'
                    });
                    self.getAdmin();
                    self.adminid = '';
                    self.adminname = '';
                }else {
                    self.$message({
                        message: res.data.msg,
                        type: 'warning'
                    });
                }
            })
        },
        deletAdmin(index, row){
            var self = this;
            var id = row.id;
            var postdata = {
                id: id
            }
            axios.post('/deleteAdmin',postdata).then((res)=>{
                if(res.data.code == 0){
                    self.$message({
                        message: '删除成功！',
                        type: 'success'
                    });
                    self.getAdmin();
                }else {
                    self.$message({
                        message: res.data.msg,
                        type: 'warning'
                    });
                }
            })
        },

    }

});

