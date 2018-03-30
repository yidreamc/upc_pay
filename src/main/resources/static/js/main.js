var s = document.getElementById('payment_type');
if (s[2] == undefined) {
    s[1].selected = true;
    $('#amt').val(s[1].dataset.money);
    $('#amt').attr("disabled", true);
}
