function addStaff() {

    var url = base + "staff";

    var staffName = $("#staffName").val();
    var staffGender = $("#staffGender").val();
    var staffUserName = $("#staffUserName").val();
    var staffPassword = $("#staffPassword").val();
    var staffPhone = $("#staffPhone").val();

    var data = {
        "name": staffName,
        "gender": staffGender,
        "username": staffUserName,
        "password": staffPassword,
        "phone": staffPhone
    };

    $.ajax({
        url: url,
        type: "post",
        contentType: "application/json;charset=utf-8",
        dataType: "json",
        timeout: 10000,
        async: false,
        data: JSON.stringify(data),
        success: function () {
            window.location.href = base + "index.html?fromPage=addStaff"
        },
        error: function () {

        }
    });
}