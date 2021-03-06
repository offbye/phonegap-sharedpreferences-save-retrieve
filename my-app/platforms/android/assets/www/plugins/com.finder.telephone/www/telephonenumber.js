cordova.define("com.finder.telephone.telephonenumber", function(require, exports, module) { (function( cordova ) {

    function TelephoneNumber() {}

    TelephoneNumber.prototype.line1Number = function(win, fail) {
        return cordova.exec(
                function (args) { if(win !== undefined) { win(args); } },
                function (args) { if(fail !== undefined) { fail(args); } },
                "TelephoneNumber", "line1Number", []);
    };

    if(!window.plugins) {
        window.plugins = {};
    }

    if (!window.plugins.TelephoneNumber) {
        window.plugins.TelephoneNumber = new TelephoneNumber();
    }

})( window.cordova );

});
