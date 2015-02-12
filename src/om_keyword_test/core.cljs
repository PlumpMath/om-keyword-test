(ns om-keyword-test.core
  (:require [om.core :as om]
            [om.dom :as dom]))

(enable-console-print!)

(defmulti greeter :field/name)

(defmethod greeter :david
  [data owner]
  (om/component
   (dom/p nil "Hey David")))

(defmethod greeter :viktor
  [data owner]
  (om/component
   (dom/p nil "Hey Viktor")))

(def app-state (atom {:person {:field/name :david}}))

(om/root
 (fn [app owner]
   (reify om/IRender
     (render [_]
       (om/build greeter (:person data) {:fn identity}))))
 app-state
 {:target (. js/document (getElementById "app"))})
