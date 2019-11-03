var base = "http://localhost:8080/";
//var base = "https://www.cslouwailou.com/"

var Request = {
    /**
     * 获取数据ajax-get请求
     * @author discardpast@yeah.net
     */
    get: function (url, data, async, callback, errorCallback) {
        $.ajax({
            url: url,
            type: "get",
            contentType: "application/json;charset=utf-8",
            dataType: "json",
            timeout: 10000,
            data: JSON.stringify(data),
            async: async,
            success: function (data) {
                callback(data);
            },
            error: function (xhr, textstatus, thrown) {
                if (errorCallback) {
                    errorCallback();
                }
            }
        });
    },

    /**
     * 提交json数据的post请求
     * @author discardpast@yeah.net
     */
    post: function (url, data, async, callback, errorCallback) {
        $.ajax({
            url: url,
            type: "post",
            contentType: "application/json;charset=utf-8",
            dataType: "json",
            data: JSON.stringify(data),
            timeout: 60000,
            async: async,
            success: function (msg) {
                callback(msg);
            },
            error: function (xhr, textstatus, thrown) {
                if (errorCallback) {
                    errorCallback();
                }
            }
        });
    },

    /**
     * 修改数据的ajax-put请求
     * @author discardpast@yeah.net
     */
    put: function (url, data, async, callback, errorCallback) {
        $.ajax({
            url: url,
            type: "put",
            contentType: "application/json;charset=utf-8",
            dataType: "json",
            data: JSON.stringify(data),
            timeout: 20000,
            async: async,
            success: function (msg) {
                callback(msg);
            },
            error: function (xhr, textstatus, thrown) {
                if (errorCallback) {
                    errorCallback();
                }
            }
        });
    },
    /**
     * 删除数据的ajax-delete请求
     * @author discardpast@yeah.net
     */
    delete: function (url, data, async, callback, errorCallback) {
        $.ajax({
            url: url,
            type: "delete",
            contentType: "application/json;charset=utf-8",
            dataType: "json",
            data: JSON.stringify(data),
            timeout: 20000,
            async: async,
            success: function (msg) {
                callback(msg);
            },
            error: function (xhr, textstatus, thrown) {
                if (errorCallback) {
                    errorCallback();
                }
            }
        });
    }
}

function getQueryVariable(variable)
{
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i=0;i<vars.length;i++) {
        var pair = vars[i].split("=");
        if(pair[0] == variable){return pair[1];}
    }
    return(false);
}