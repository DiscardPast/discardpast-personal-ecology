var url = base + "staff/byPage";
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
                "        <td>" + data[i].name + "</td>\n" +
                "        <td>" + data[i].gender + "</td>\n" +
                "        <td>" + data[i].code + "</td>\n" +
                "        <td>" + data[i].phone + "</td>\n" +
                "        <td>" + data[i].username + "</td>\n" +
                "        <td>" + data[i].password + "</td>\n" +
                "        <td>" +
                "<button type=\"button\" class=\"btn btn-success\">修改</button>" +
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
    var deleteUrl = base + "user?userId=" + currentUserId;
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