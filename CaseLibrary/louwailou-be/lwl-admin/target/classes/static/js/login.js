function login() {
    var url = "http://localhost:8080/staff/login";

    var username = $("#UserName").val();
    var password = $("#Password").val();

    var data = {
        "username": username,
        "password": password
    };

    $.ajax({
        url: url,
        type: "post",
        contentType: "application/json;charset=utf-8",
        dataType: "json",
        timeout: 10000,
        async: false,
        data: JSON.stringify(data),
        success: function (response) {
            var data = response.data;
            if(data)
            {
                window.location.href = "http://localhost:8080/index.html"
            }
            else
            {
                alert("账号密码错误！请重新输入！")
            }
        },
        error: function () {
            alert("获取房屋信息失败！")
        }
    });

}