(ns vectors.core)

(defn print-first-name
  "prefer use get instead of [list] [index] to avoid errors"
  [names]
  (get names 0 "Not Found"))

(print-first-name [])

(defn replace-first-name
  "assoc is used to replace an item"
  [names new-first]
  (assoc names 0 new-first))

(replace-first-name ["Fist", "Second", "Third"] "First One")

(defn replace-last
  "-1 index cannot refer to last item, so an error will occur"
  [names new-last]
  (assoc names -1 new-last))

(replace-last ["Fist", "Second", "Third"] "First One")