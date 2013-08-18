(defproject htmltohiccup "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :min-lein-version "2.0.0"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.5"]
                 [hiccup-bridge "1.0.0-SNAPSHOT"]
                 [hiccup "1.0.4"]
                 [http-kit "2.1.9"]]
  :plugins [[lein-ring "0.8.5"]]
  :ring {:handler htmltohiccup.handler/app}
  :profiles
  {:dev {:dependencies [[ring-mock "0.1.5"]]}}
  :main htmltohiccup.core)
