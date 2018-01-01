/**
 * Name: toast
 * Annotation:
 * Version Number: 1.00
 * Language: javascript
 * Date: 2017-12-31
 * Author: shiyu.feng
 * Email: shiyu.feng@qunar.com
 */
var showToast = function () {
    var x = document.getElementById("toast")
    x.className = "show";
    setTimeout(function () {
        x.className = x.className.replace("show", "");
    }, 3000);
};