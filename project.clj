(defproject clojure-koans "0.5.0-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [log4j/log4j "1.2.17"]
                 [org.clojure/tools.logging "0.2.4"]
                 [org.slf4j/slf4j-log4j12 "1.6.6"]
                 [koan-engine "0.2.3"]]
  :dev-dependencies [[lein-koan "0.1.3"]]
  :profiles {:dev {:dependencies [[lein-koan "0.1.3"]]}}
  :repl-options {:init-ns koan-engine.runner
                 :init (do (use '[koan-engine.core]))}
  :plugins [[lein-koan "0.1.3"]]
  :main koan-engine.runner/exec)
