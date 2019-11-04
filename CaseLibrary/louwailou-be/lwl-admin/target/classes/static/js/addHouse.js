$(".form-control-chosen").chosen();

function addHouse(){

    var url = base + "house";
    var houseTitle = $("#houseTitle").val();
    var houseConsultantTitle = $("#houseConsultantTitle").val();
    var houseArea = $("#houseArea").val();
    var housePrice = $("#housePrice").val();
    var houseAddress = $("#houseAddress").val();
    var houseBeat = $("#houseBeat").val();
    var houseContent = $("#houseContent").val();
    var houseBonus = $("#houseBonus").val();
    var houseOpenTime = $("#houseOpenTime").val();
    var houseType = $("#houseType").val();
    var houseTips = $("#houseTips").val();
    var houseStructure = $("#houseStructure").val();
    var houseProject = $("#houseProject").val();

    var tips = "";
    for (var i = 0;i < houseTips.length;i++)
    {
        tips += houseTips[i] + ",";
    }

    var data = {
        "title": houseTitle,
        "consultantTitle": houseConsultantTitle,
        "area": houseArea,
        "price": housePrice,
        "address": houseAddress,
        "beat": houseBeat,
        "content": houseContent,
        "bonus": houseBonus,
        "types": houseType,
        "tips": tips,
        "structure": houseStructure,
        "projectId": houseProject,
        "openTime": houseOpenTime
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
            window.location.href = base + "index.html?fromPage=addHouse"
        },
        error: function () {

        }
    });

}