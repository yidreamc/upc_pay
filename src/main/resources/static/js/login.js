let login = new Vue({
    el: '#login',
    data() {
        return {
            uname: localStorage.getItem('uname'),
            pwd: localStorage.getItem('pwd'),
            dialogVisible: false
        }
    },
    methods: {
        login() {
            let user = {
                uname: this.uname,
                pwd: this.pwd
            };
            let self = this;
            axios.post('/login', user).then((res) => {
                if (res.data == 1) {
                    localStorage.setItem('uname', user.uname);
                    localStorage.setItem('pwd', user.pwd);
                    window.location.href = 'admin'
                } else {
                    self.dialogVisible = true;
                }

            })
        },
        clean(){
            localStorage.setItem('uname', null);
            localStorage.setItem('pwd', null);
            this.uname = null;
            this.pwd = null;

        }
    }
});

