$(".form-control-chosen").chosen();
var staffId = getQueryVariable("staffId");
var url = base + "staff?staffId=" + staffId;

$.ajax({
    url: url,
    type: "get",
    contentType: "application/json;charset=utf-8",
    dataType: "json",
    timeout: 10000,
    async: false,
    success: function (response) {
        var data = response.data;
        $("#staffName").val(data.name);
        $("#staffGender").val(data.gender);
        $("#staffUserName").val(data.username);
        $("#staffPassword").val(data.password);
        $("#staffPhone").val(data.phone);
    },
    error: function () {
        alert("获取员工信息失败！")
    }
});