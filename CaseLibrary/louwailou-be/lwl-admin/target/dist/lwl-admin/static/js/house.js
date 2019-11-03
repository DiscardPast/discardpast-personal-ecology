var url="http://39.98.231.50:8082/house/all";
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
        for(var i = 0;i < data.length;i++)
        {
            var houseType = "";
            if(data[i].types == 0)
            {
                houseType = "未定义";
            }
            if(data[i].types == 1)
            {
                houseType = "公寓";
            }
            if(data[i].types == 2)
            {
                houseType = "住宅";
            }
            if(data[i].types == 3)
            {
                houseType = "商铺";
            }
            console.log("dataasdaw" + response.data[i]);
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
                "    </tr>"
            )
        }

    },
    error: function () {
        console.log("error")
    }
});