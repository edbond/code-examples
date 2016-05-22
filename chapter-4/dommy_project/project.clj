(defproject dommy-project "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.8.51"]
                 [prismatic/dommy "1.1.0"]]
  :plugins [[lein-figwheel "0.5.3-2"]]
  :clean-targets [:target-path "out"]
  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel true
              :compiler {:main "dommy-project.core"} 
             }]
   })
