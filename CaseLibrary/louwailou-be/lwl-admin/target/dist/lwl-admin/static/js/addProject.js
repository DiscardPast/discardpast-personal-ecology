$(".form-control-chosen").chosen();

function addProject() {

    var url = base + "project";
    var projectDeveloper = $("#projectDeveloper").val();
    var projectRegion = $("#projectRegion").val();
    var projectSaleStatus = $("#projectSaleStatus").val();
    var projectPropertyYears = $("#projectPropertyYears").val();
    var projectPropertyType = $("#projectPropertyType").val();
    var projectVolumeRate = $("#projectVolumeRate").val();
    var projectGreeningRate = $("#projectGreeningRate").val();
    var projectHouseholdsNum = $("#projectHouseholdsNum").val();
    var projectPropertyCosts = $("#projectPropertyCosts").val();
    var projectDecorationStatus = $("#projectDecorationStatus").val();
    var projectHandingHouseTime = $("#projectHandingHouseTime").val();
    var projectParkingSpace = $("#projectParkingSpace").val();

    var data = {
        "developer": projectDeveloper,
        "region": projectRegion,
        "saleStatus": projectSaleStatus,
        "propertyYears": projectPropertyYears,
        "propertyType": projectPropertyType,
        "volumeRate": projectVolumeRate,
        "greeningRate": projectGreeningRate,
        "householdsNum": projectHouseholdsNum,
        "propertyCosts": projectPropertyCosts,
        "decorationStatus": projectDecorationStatus,
        "handingHouseTime": projectHandingHouseTime,
        "parkingSpace": projectParkingSpace
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
            window.location.href = base + "index.html?fromPage=addProject"
        },
        error: function () {

        }
    });

}