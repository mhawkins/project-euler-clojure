#!/usr/bin/env clj

(defn euler1 [n]
  (let [factor #(or (= (rem % 3) 0) (= (rem % 5) 0) )
        factors (filter factor (range 1 (+ n 1)))]
        (reduce + (take n factors))))
        
        
(println (euler1 1000))