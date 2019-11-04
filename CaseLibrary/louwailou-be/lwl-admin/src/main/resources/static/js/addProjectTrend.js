$(".form-control-chosen").chosen();

function addProjectTrend(){

    var url = base + "project";
    var projectTrendTitle = $("#projectTrendTitle").val();
    var projectTrendContent = $("#projectTrendContent").val();
    var projectTrendTip = $("#projectTrendTip").val();

    var data = {
        "title": projectTrendTitle,
        "content": projectTrendContent,
        "tip": projectTrendTip
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