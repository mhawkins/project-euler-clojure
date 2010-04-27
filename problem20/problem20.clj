(defn add
  [n]
  (if (= n 1)
    1
    (+ n (add (- n 1)))
  )
)

(defn add
  [x]
  ((fn [n so_far]
      (if (<= n 1)
        so_far
        (recur (dec n)  (+ so_far n))
      )
    ) x 1
  )
)