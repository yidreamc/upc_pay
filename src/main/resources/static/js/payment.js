$(function () {

    $(".weui-dialog__btn").click(function () {
        $('#dialog_1').fadeOut(200);
        $('#dialog_e').fadeOut(200);
    });
    $('#dialog_2 .weui-dialog__btn').click(function () {
        $('#dialog_2').fadeOut(200);
    });

    $('#reset').click(function () {
        window.location.href = window.location.href
    });


    $('#sub').click(function () {
            var reg = /(^[1-9]([0-9]+)?(\.[0-9]{1,2})?$)|(^(0){1}$)|(^[0-9]\.[0-9]([0-9])?$)/;
            var amt = $('#amt').val();
            if (!reg.test(amt)) {
                $("#dialog_1").fadeIn(200);
            } else {
                $.ajax({
                    // url: 'http://localhost:8088/getPaymentData',
                    url: 'http://wxsportscard.upc.edu.cn:8088/getPaymentData',
                    type: 'GET',
                    data: {
                        amt: $('#amt').val(),
                        uid: $('#p2').val(),
                        uname: $('#p1').val(),
                        pid: $('#id').val(),
                        mark: $('#mark').val(),
                        taxCode: $('#taxCode').val(),
                        zzAddress: $('#zzAddress').val(),
                        zzBank: $('#zzBank').val(),
                        zzBnkName: $('#zzBnkName').val(),
                        zzTel: $('#zzTel').val(),
                        zzUnit: $('#zzUnit').val(),

                    },
                    success: function (result) {
                        result = JSON.parse(result);
                        if (result.result !== 'success') {
                            return;
                        }
                        if (result.data.code == 0) {
                            $("#dialog_err").html(result.data.info);
                            $("#dialog_e").fadeIn(200);

                        } else {
                            var nic_form = $('#nic_form');
                            $('#sign').val(result.data.sign);
                            $('#sysid').val(result.data.sysid);
                            $('#subsysid').val(result.data.subsysid);
                            $('#data').val(result.data.data);
                            nic_form.attr('action', "http://jf.finance.upc.edu.cn/payment/pay/mobileAppPay.action");
                            nic_form.submit();
                        }

                    }
                })
            }
        }
    );
});

function changeType(opt) {
    var index = opt.selectedIndex;
    $('#amt').val(opt[index].dataset.money);
    $('#amt').attr("disabled", true);

    //备注
    $('#mark').val(opt[index].dataset.type);

}


function changeBill(opt) {
    var index = opt.selectedIndex;
    $('#taxCode').val(opt[index].dataset.taxcode);
    $('#taxCode').attr("disabled", true);

    $('#zzAddress').val(opt[index].dataset.zzaddress);
    $('#zzAddress').attr("disabled", true);

    $('#zzBank').val(opt[index].dataset.zzbank);
    $('#zzBank').attr("disabled", true);

    $('#zzBnkName').val(opt[index].dataset.zzbnkname);
    $('#zzBnkName').attr("disabled", true);

    $('#zzTel').val(opt[index].dataset.zztel);
    $('#zzTel').attr("disabled", true);


    $('#zzUnit').val(opt[index].dataset.zzunit);
    $('#zzUnit').attr("disabled", true);

}
