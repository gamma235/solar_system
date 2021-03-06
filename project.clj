(defproject solar_system "1.0.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://solar_system.herokuapp.com"
  :license {:name "FIXME: choose"
            :url "https://fierce-island-4087.herokuapp.com/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [environ "0.2.1"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :uberjar-name "solar_system-standalone.jar"
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}})
