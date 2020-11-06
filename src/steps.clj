(ns steps)

(defn i-have-cukes-in-my-belly
  "Returns an updated `board`."
  {:scene/step "I have {int} cukes in my belly"}
  [board cukes]
  board)

(defn i-wait-hours
  "Returns an updated `board`."
  {:scene/step "I wait {int} hours"}
  [board hours]
  board)

(defn my-belly-should-effect
  "Returns an updated `board`."
  {:scene/step "my belly should {string}"}
  [board effect]
  (println (str "My belly " effect "s"))
  board)
