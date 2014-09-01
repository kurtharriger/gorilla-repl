;;;; This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(defproject gorilla-repl "0.3.3-SNAPSHOT"
  :description "A rich REPL for Clojure in the notebook style."
  :url "https://github.com/JonyEpsilon/gorilla-repl"
  :license {:name "MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [http-kit "2.1.16"]
                 [ring/ring-json "0.3.1"]
                 [cheshire "5.0.2"]
                 [compojure "1.1.8"]
                 [org.slf4j/slf4j-api "1.7.5"]
                 [ch.qos.logback/logback-classic "1.0.13"]
                 [clojure-complete "0.2.3"]
                 [gorilla-renderable "1.0.0"]
                 [org.clojure/data.codec "0.1.0"]
                 [javax.servlet/servlet-api "2.5"]
                 [grimradical/clj-semver "0.2.0" :exclusions [org.clojure/clojure]]]
  :plugins [[lein-npm "0.4.0"]]
  :node-dependencies [[gorilla-web "0.0.10"]]
  :resource-paths ["node_modules/gorilla-web", "resources"]
  :aliases {"run" ["do" "npm" "install," "run"]
            "jar" ["do" "npm" "install," "jar"]}
  :main ^:skip-aot gorilla-repl.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
