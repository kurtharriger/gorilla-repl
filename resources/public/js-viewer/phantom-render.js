/*
 * This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
 *
 * gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.
 */

var page = require('webpage').create();

page.onConsoleMessage = function (msg) {
    console.log(msg);
};

page.open("http://localhost:8990/view.html?source=test", function (status) {
    if (status === "success") {
        window.setTimeout(function () {
            page.evaluate(function () {
                console.log(document.documentElement.outerHTML);
            });
        }, 5000);
//        phantom.exit();
    }
});