(ns htmltohiccup.core
  (:use compojure.core)
  (:use org.httpkit.server)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [htmltohiccup.views.index :as index]
            [htmltohiccup.conversion :as conversion]))

(defroutes app-routes
  (GET "/" [] (index/index))
  (POST "/html_to_hiccup" {params :params} (conversion/to-hiccup (get params :hiccup)))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/site app-routes)))

(defn start [port]
    (run-server #'app {:port port :join? false}))

(defn -main []
  (let [port (Integer/parseInt 
               (or (System/getenv "PORT") "8080"))]
  (println (str "Started on port " port "..."))
  (start port)))
