(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [x]
  (if (< x 0)
    (* x (- 1))
    x))

(defn divides? [divisor n]
  (= (mod n divisor) 0))

(defn teen? [age]
  (<= 13 age 19))

(defn fizzbuzz [n]
  ":(")

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'
