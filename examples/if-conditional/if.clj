(defn calc-salary 
  [salary]
  (if (<= salary 1000)
    0
    (if (< salary 2000)
      (* salary 0.1)
      
