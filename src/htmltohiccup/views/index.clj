(ns htmltohiccup.views.index
  (:use [hiccup.core :only (html)]
        [hiccup.page :only (html5 include-css)]))

(defn index []
  (html 
    "<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\"> <![endif]-->"
    "<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\"> <![endif]-->"
    "<!--[if IE 8]>         <html class=\"no-js lt-ie9\"> <![endif]-->"
    "<!--[if gt IE 8]><!-->"
    [:html.no-js
    " "
    "<!--<![endif]-->"
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:content "IE=edge,chrome=1", :http-equiv "X-UA-Compatible"}]
     [:title "HTML To Hiccup"]
     [:meta {:content "", :name "description"}]
     [:meta {:content "width=device-width", :name "viewport"}]
     [:link {:href "css/bootstrap.min.css", :rel "stylesheet"}]
     [:style
      "\n            body {\n                padding-top: 60px;\n                padding-bottom: 40px;\n            }\n        "]
     [:link
      {:href "css/bootstrap-responsive.min.css", :rel "stylesheet"}]
     [:link {:href "css/main.css", :rel "stylesheet"}]
     [:script {:src "js/vendor/modernizr-2.6.2-respond-1.1.0.min.js"}]]
    [:body
     "<!--[if lt IE 7]>\n            <p class=\"chromeframe\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> or <a href=\"http://www.google.com/chromeframe/?redirect=true\">activate Google Chrome Frame</a> to improve your experience.</p>\n        <![endif]-->"
     "<!-- This code is taken from http://twitter.github.com/bootstrap/examples/hero.html -->"
     [:div.container
      [:div.row [:div.span12 [:h2 "HTML To Hiccup"]]]
      [:div.row
       [:div.span6 [:h3 "HTML"] [:div#in_html.span6 {}]]
       [:div.span6
        [:h3 "Hiccup"]
        [:div#out_hiccup.span6 {}]]]
      [:hr]
      [:footer [:p "© Sean Brewer 2013"]]]
     " "
     "<!-- /container -->"
     [:script
      {:src
       "//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"}]
     [:script
      "window.jQuery || document.write('<script src=\"js/vendor/jquery-1.10.1.min.js\"><\\/script>')"]
     [:script {:src "js/vendor/bootstrap.min.js"}]
     [:script {:src "js/vendor/ace/ace.js" :type "text/javascript" :charset "utf-8"}]
     [:script {:src "js/main.js"}]
     [:script
       "\n  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');\n\n  ga('create', 'UA-5393331-3', 'herokuapp.com');\n  ga('send', 'pageview');\n\n"]]]))
