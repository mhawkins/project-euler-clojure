#!/usr/bin/env clj

(defn fib
  "Fibbonacci sequence for numbers greater than 2"
  [n]
  ((fn
    [max, sequence]    
    (let [sequenceCount (count sequence) firstIndex (- sequenceCount 1) secondIndex (- sequenceCount 2) newFibNumber (+ (sequence firstIndex) (sequence secondIndex))]
    (if (> newFibNumber max)
      sequence
      (recur max (conj sequence newFibNumber))))) 
      n [1 1]))
  
(println (reduce + (filter #(= (rem % 2) 0) (fib 4000000))))
