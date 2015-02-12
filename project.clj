(defproject om-keyword-test "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2755"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [org.omcljs/om "0.8.8"]]

  :plugins [[lein-cljsbuild "1.0.4"]]

  :source-paths ["src" "target/classes"]

  :clean-targets ["out/om_keyword_test" "out/om_keyword_test.js"]

  :cljsbuild {
    :builds [{:id "om-keyword-test"
              :source-paths ["src"]
              :compiler {
                :output-to "out/om_keyword_test.js"
                :output-dir "out"
                :main om-keyword-test.core
                :optimizations :none
                :cache-analysis true
                :source-map true}}]})
