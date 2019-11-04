var url = base + "house/all";
var houseId;

$.ajax({
    url: url,
    type: "get",
    contentType: "application/json;charset=utf-8",
    dataType: "json",
    timeout: 10000,
    async: false,
    success: function (response) {
        var data = response.data;
        for (var i = 0; i < data.length; i++) {
            var houseType = "";
            if (data[i].types == 0) {
                houseType = "未定义";
            }
            if (data[i].types == 1) {
                houseType = "公寓";
            }
            if (data[i].types == 2) {
                houseType = "住宅";
            }
            if (data[i].types == 3) {
                houseType = "商铺";
            }
            $("#houseList").append(
                "<tr>\n" +
                "        <th scope=\"row\">" + data[i].id + "</th>\n" +
                "        <td>" + data[i].title + "</td>\n" +
                "        <td>" + data[i].consultantTitle + "</td>\n" +
                "        <td>" + houseType + "</td>\n" +
                "        <td>" + data[i].content + "</td>\n" +
                "        <td>" + data[i].apartment + "</td>\n" +
                "        <td>" + data[i].bouns + "</td>\n" +
                "        <td>" + data[i].beat + "</td>\n" +
                "        <td>" + data[i].address + "</td>\n" +
                "        <td>" +
                "<button type=\"button\" class=\"btn btn-success\" onclick=\"toHouseDetail(" + data[i].id + ")\">查看</button>" +
                "<button type=\"button\" onclick=\"toAddHouseApartment(" + data[i].id + ")\" class=\"btn btn-primary\">添加房屋户型</button>" +
                "<button type=\"button\" class=\"btn btn-danger\" onclick=\"deleteHouse(" + data[i].id + ")\">删除</button>" +
                "</td>\n" +
                "    </tr>"
            )
        }

    },
    error: function () {
        console.log("error")
    }
});

function toAddHouseApartment(currentHouseId) {
    window.location.href = base + "addHouseApartment.html?houseId=" + currentHouseId;
}

function toHouseDetail(currentHouseId) {
    window.location.href = base + "houseDetail.html?houseId=" + currentHouseId;
}

function deleteHouse(currentHouseId) {
    var deleteUrl = base + "house?houseId=" + currentHouseId;
    $.ajax({
        url: deleteUrl,
        type: "delete",
        contentType: "application/json;charset=utf-8",
        dataType: "json",
        timeout: 10000,
        async: false,
        success: function () {
            window.location.href = base + "house.html"
        },
        error: function () {
            alert("删除房屋信息失败！")
        }
    });
}