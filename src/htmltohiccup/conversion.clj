(ns htmltohiccup.conversion
  (:require [hiccup-bridge.core :as hicv]
            [clojure.pprint :as pp]))

(defn to-hiccup [hcp]
  (-> (hicv/html->hiccup hcp)
      (pp/pprint)
      (with-out-str)))

