var fromPage = getQueryVariable("fromPage");
if(fromPage == "addStaff")
{
    $("#contentIframe").attr("src","http://localhost:8080/staff.html");
}else
{
    $("#contentIframe").attr("src","http://localhost:8080/house.html");
}

function getHouseList() {
    $("#contentIframe").attr("src","http://localhost:8080/house.html");
}
function getUserList() {
    $("#contentIframe").attr("src","http://localhost:8080/user.html");
}
function getStaffList() {
    $("#contentIframe").attr("src","http://localhost:8080/staff.html");
}
function toAddHouse() {
    window.location.href = "http://localhost:8080/addHouse.html"
}
function toAddStaff() {
    window.location.href = "http://localhost:8080/addStaff.html"
}