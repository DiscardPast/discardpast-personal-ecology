var fromPage = getQueryVariable("fromPage");
if (fromPage == "addStaff") {
    $("#contentIframe").attr("src", base + "staff.html");
} else if (fromPage == "addProject") {
    $("#contentIframe").attr("src", base + "project.html");
}
else {
    $("#contentIframe").attr("src", base + "house.html");
}

function getHouseList() {
    $("#contentIframe").attr("src", base + "house.html");
}
function getProjectList() {
    $("#contentIframe").attr("src", base + "project.html");
}
function getUserList() {
    $("#contentIframe").attr("src", base + "user.html");
}
function getStaffList() {
    $("#contentIframe").attr("src", base + "staff.html");
}
function toAddHouse() {
    window.location.href = base + "addHouse.html"
}
function toAddStaff() {
    window.location.href = base + "addStaff.html"
}
function toAddProject() {
    window.location.href = base + "addProject.html"
}