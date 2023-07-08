(ns self-testing-code.core)

(defn delivery-fee-calculator
  [purchase]
  (let [delivery-fee-fifteen 15
        delivery-fee-five 5
        delivery-fee-zero 0]
  (if (<= purchase 100)
    delivery-fee-fifteen
    (if (<= purchase 200)
      delivery-fee-five
      delivery-fee-zero))))