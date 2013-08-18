var in_html = ace.edit("in_html");
in_html.setTheme("ace/theme/xcode");
in_html.getSession().setMode("ace/mode/html");
in_html.setShowPrintMargin(false);

var out_hiccup = ace.edit("out_hiccup");
out_hiccup.setTheme("ace/theme/xcode");
out_hiccup.getSession().setMode("ace/mode/clojure");
out_hiccup.setHighlightActiveLine(false);
out_hiccup.setShowPrintMargin(false);
out_hiccup.setReadOnly(true);

in_html.on("change", function(e){
  var html = in_html.getValue();
  $.post('/html_to_hiccup',{"hiccup":html}, function(data) {
    out_hiccup.setValue(data);
  });

});
