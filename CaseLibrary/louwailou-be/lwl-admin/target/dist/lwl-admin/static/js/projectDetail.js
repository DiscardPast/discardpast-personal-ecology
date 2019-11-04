$(".form-control-chosen").chosen();
var projectId = getQueryVariable("projectId");
var url = base + "project?projectId=" + projectId;

$.ajax({
    url: url,
    type: "get",
    contentType: "application/json;charset=utf-8",
    dataType: "json",
    timeout: 10000,
    async: false,
    success: function (response) {
        var data = response.data;
        $("#houseTitle").val(data.title);
        $("#houseConsultantTitle").val(data.consultantTitle);
        $("#houseArea").val(data.area);
        $("#housePrice").val(data.price);
        $("#houseAddress").val(data.address);
        $("#houseBeat").val(data.beat);
        $("#houseContent").val(data.content);
        $("#houseBonus").val(data.bonus);
        $("#houseOpenTime").val(data.openTime);
    },
    error: function () {
        alert("获取房屋信息失败！")
    }
});