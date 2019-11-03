$(".form-control-chosen").chosen();

function addHouse(){

    var url = "http://localhost:8080/house";
    var houseTitle = $("#houseTitle").val();
    var houseConsultantTitle = $("#houseConsultantTitle").val();
    var houseArea = $("#houseArea").val();
    var housePrice = $("#housePrice").val();
    var houseAddress = $("#houseAddress").val();
    var houseBeat = $("#houseBeat").val();
    var houseContent = $("#houseContent").val();
    var houseBonus = $("#houseBonus").val();
    var houseOpenTime = $("#houseOpenTime").val();

    var data = {
        "title": houseTitle,
        "consultantTitle": houseConsultantTitle,
        "area": houseArea,
        "price": housePrice,
        "address": houseAddress,
        "beat": houseBeat,
        "content": houseContent,
        "bonus": houseBonus,
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
            window.location.href = "http://localhost:8080/house.html"
        },
        error: function () {

        }
    });

}