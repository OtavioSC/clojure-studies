; Example not using a description
(defn traffic-ticket
  [value]
  (let [percentage 0.1]
    (* value percentage)))

; Example using a description
(defn total-traffic-ticket
  "Calculate the traffic ticket"
  [value]
  (let [percentage 0.1
        traffic-ticket-value (* value percentage)]
    (+ value traffic-ticket-value)))


