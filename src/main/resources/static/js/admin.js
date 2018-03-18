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
                p2code: '0'
            },

            editform1: {
                options: []
            },
            noschool: true,
            isIndefine: false,
            editIsIndefine: false,
            rules: {
                name: [
                    {required: true, message: '名字不能为空', trigger: 'blur'},
                ],
                type: [
                    {required: true, message: '类型不能为空', trigger: 'change'},
                ],
                p1name: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
                p1code: [
                    {required: true, message: '请选择校验规则', trigger: 'change'},
                ],
                p2name: [
                    {required: true, message: '该参数不能为空', trigger: 'blur'},
                ],
                p2code: [
                    {required: true, message: '请选择校验规则', trigger: 'change'},
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
            }
        }
    },
    mounted() {

        axios.get('/getpays').then((res) => {
            this.pays = res.data;
        })

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
                this.editform1 = f;
            });
            this.editFormVisible = true;

        },

    }

});

