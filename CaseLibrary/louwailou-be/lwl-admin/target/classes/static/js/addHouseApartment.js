var houseId = getQueryVariable("houseId");

function addHouseApartment() {

    var url = "http://localhost:8080/houseApartment";

    var houseApartmentTitle = $("#houseApartmentTitle").val();
    var houseApartmentContent = $("#houseApartmentContent").val();

    var data = {
        "houseId": houseId,
        "title": houseApartmentTitle,
        "text": houseApartmentContent
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