package Task4

import kotlin.math.sqrt

fun main (){
    println("Введите искомое число для проверки на простоту")
var n = readln().toInt()
    if (n <2){
        println("Ввекденное число равно 1," +
                "еденица не является ни простым ни составным числом")
    } else {
        val sqrtn = sqrt(n.toDouble()).toInt()
        for (i in 2..sqrtn){
            if (n % i == 0){
                println("Введенное число является составным")
                break
            }else {
                println("Ввденное число является простым")
                break
            }
        }

    }


}