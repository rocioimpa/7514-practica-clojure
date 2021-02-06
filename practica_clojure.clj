;; 1) Definir la función tercer-angulo que reciba los valores de dos de 
;; los ángulos interiores de un triángulo y devuelva el valor del 
;; restante.

(defn tercer-angulo [angulo1 angulo2] (- 180 angulo1 angulo2))
;; (tercer-angulo 90 45) => 90

;; 2) Definir la función segundos que reciba los cuatro valores (días, 
;; horas, minutos y segundos) del tiempo que dura un evento y devuelva 
;; el valor de ese tiempo expresado solamente en segundos.
(defn calcular-segundos-dias [dias] (* 24 60 3600 dias))
(defn calcular-segundos-horas [horas] (* 60 3600 horas))
(defn calcular-segundos-minutos [minutos] (* 3600 minutos))
(defn segundos [dias horas minutos segundos] (+ (calcular-segundos-dias dias) (calcular-segundos-horas horas) (calcular-segundos-minutos minutos) segundos))
;; (segundos 2 4 26 54)

(defn calcular-horas [dias] (* 24 (calcular-minutos dias)))
(defn calcular-minutos [horas] (* 60 (calcular-segundos horas)))
(defn calcular-segundos [minutos] (* 3600 minutos))
(defn segundos [dias horas minutos segundos] (+ (calcular-horas dias) (calcular-minutos horas) (calcular-segundos minutos) segundos))
;; (segundos 2 4 26 54)

;; 3) Definir la función sig-mul-10 que reciba un número entero y 
;; devuelva el primer múltiplo de 10 que lo supere.
(defn round-floor [numero] (int (Math/floor numero)))
(defn sig-mul-10 [numero] (* 10 (+ (round-floor (/ numero 10)) 1)))

;; Tambien puedo hacerlo con ceil y no necesito sumarle 1
(defn round-ceil [numero] (int (Math/ceil numero)))
(defn sig-mul-10 [numero] (* 10 (round-ceil (/ numero 10))))

;; 5) Definir la función capicua? que reciba un número entero no negativo de hasta 5
;; dígitos y devuelva true si el número es capicúa; si no, false.
(defn capicua? [numero] (if (and (integer? numero) (< numero 100000) (>= numero 0)) (if (= (seq (str numero)) (into '() (seq (str numero)))) true false) "invalid number"))

; 17.Definir una función para obtener el elemento central de una lista.
(defn elementoCentral [lista] (get lista(int (Math/floor (/(count lista) 2))) ))

