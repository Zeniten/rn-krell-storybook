(ns aproject.core
  (:require [reagent.core :as r]
            [react-native :as rn]))

(def component (r/adapt-react-class (.-default (js/require "../js/Component.js"))))
(def welcome (r/adapt-react-class (.-default (js/require "../js/Welcome.js"))))

(def view (r/adapt-react-class rn/View))
(def text (r/adapt-react-class rn/Text))

(defn app-root
  []
  [view {:style {:flex 1 :align-items "center" :justify-content "center"}}
   [welcome]])

(defn ^:export -main
  []
  (r/as-element [app-root]))
