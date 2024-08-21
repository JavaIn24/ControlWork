package Task2

/**Даны два целых числа a и b (a<b).
 Найти сумму квадратов всех целых чисел от a до b включительно.*/
fun main (){
    var a = 1
    var b = 5
    var c = 1
    while (b > a++){
        c += a*a
    }
    println(c)
}