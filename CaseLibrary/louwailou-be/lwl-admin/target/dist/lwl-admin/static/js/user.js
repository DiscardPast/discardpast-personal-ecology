var url="http://39.98.231.50:8082/user/all";
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
            console.log("dataasdaw" + response.data[i]);
            $("#userList").append(
                "<tr>\n" +
                "        <th scope=\"row\">" + data[i].id + "</th>\n" +
                "        <td>" + data[i].nickname + "</td>\n" +
                "        <td><img style='height: 30px;width: 60px;' src=" + data[i].idCardFront + "/></td>\n" +
                "        <td><img style='height: 30px;width: 60px;' src=" + data[i].visitingCard + "/></td>\n" +
                "        <td>" + data[i].phone + "</td>\n" +
                "    </tr>"
            )
        }

    },
    error: function () {
        console.log("error")
    }
});