(ns self-testing-code.core-test
  (:require [clojure.test :refer :all]
            [self-testing-code.core :refer :all]))


(deftest delivery-fee-test
  (testing "Given a purchase lesser or equal than $100, the delivery fee must be $15"
    (is (= 15 (delivery-fee-calculator 1)))
    (is (= 15 (delivery-fee-calculator 100))))

  (testing "Give a purchase between $100 and $200, the delivery fee must be $5"
    (is (= 5 (delivery-fee-calculator 100.01)))
    (is (= 5 (delivery-fee-calculator 200))))

  (testing "Give a purchase greater than $200, the delivery fee must be $0"
    (is (= 0 (delivery-fee-calculator 200.01)))
    (is (= 0 (delivery-fee-calculator 300)))))

