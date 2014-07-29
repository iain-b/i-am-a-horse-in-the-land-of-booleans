(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (nil? x)
    false
    (if (= x false)
      false
      true)  ))

(defn abs [x]
  (if (< x 0)
    (* x -1)
    x))

(defn divides? [divisor n]
  (if (== 0 (mod n divisor))
    true
    false
  )
)

(defn fizzbuzz [n]
  (if (divides? 15 n)
    "gotcha!"
    (if (divides? 5 n)
      "buzz"
      (if (divides? 3 n)
        "fizz"
        ""
        )
      )
    )
  )

(defn teen? [age]
  (and (>= age 13 ) (< age 20))
)

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (if (number? x)
    (* x 2)
    (if (empty? x)
      nil
      (if (list? x)
        (* 2 (count x))
        (if (vector? x)
          (* 2 (count x))
          true
          )
        )
      )
  )
)

(defn leap-year? [year]
  (if (divides? 400 year)
    true
    (if (divides? 100 year)
      false
      (if (divides? 4 year)
        true
        false
        )
      )
    )
  )

; '_______'
