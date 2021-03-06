var url = base + "user/all";
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
            $("#userList").append(
                "<tr>\n" +
                "        <th scope=\"row\">" + data[i].id + "</th>\n" +
                "        <td>" + data[i].nickname + "</td>\n" +
                "        <td><img style='height: 30px;width: 60px;' src=" + data[i].idCardFront + "/></td>\n" +
                "        <td><img style='height: 30px;width: 60px;' src=" + data[i].visitingCard + "/></td>\n" +
                "        <td>" + data[i].phone + "</td>\n" +
                "        <td>" +
                "<button type=\"button\" class=\"btn btn-success\">查看</button>" +
                "<button type=\"button\" class=\"btn btn-danger\" onclick=\"deleteUser(" + data[i].id + ")\">删除</button>" +
                "</td>\n" +
                "    </tr>"
            )
        }
    },
    error: function () {
        console.log("error")
    }
});

function deleteUser(currentUserId) {
    var deleteUrl = "http://localhost:8080/user?userId=" + currentUserId;
    $.ajax({
        url: deleteUrl,
        type: "delete",
        contentType: "application/json;charset=utf-8",
        dataType: "json",
        timeout: 10000,
        async: false,
        success: function () {
            window.location.reload();
        },
        error: function () {
            alert("删除用户信息失败！")
        }
    });
}