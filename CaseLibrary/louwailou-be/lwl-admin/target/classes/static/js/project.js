var url = base + "project/all";
$.ajax({
    url: url,
    type: "get",
    contentType: "application/json;charset=utf-8",
    dataType: "json",
    timeout: 10000,
    async: false,
    success: function (response) {
        var data = response.data;
        console.log("data" + data);
        for (var i = 0; i < data.length; i++) {
            $("#projectList").append(
                "<tr>\n" +
                "        <th scope=\"row\">" + data[i].id + "</th>\n" +
                "        <td>" + data[i].developer + "</td>\n" +
                "        <td>" + data[i].propertyCompany + "</td>\n" +
                "        <td>" + data[i].handingHouseTime + "</td>\n" +
                "        <td>" + data[i].propertyYears + "</td>\n" +
                "        <td>" + data[i].region + "</td>\n" +
                "        <td>" +
                "<button type=\"button\" class=\"btn btn-success\">查看</button>" +
                "<button type=\"button\" class=\"btn btn-primary\">添加动态</button>" +
                "<button type=\"button\" class=\"btn btn-danger\">删除</button>" +
                "</td>\n" +
                "    </tr>"
            )
        }

    },
    error: function () {
        console.log("error")
    }
});