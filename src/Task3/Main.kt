package Task3
/**Даны целые числа A и B (A<B). Вывести все целые числа от A до B
 * включительно; при этом число A должно выводиться 1 раз, число A+1 должно
 * выводиться 2 раза и т. д. (допустим a = 3, b = 5 à 3,4,4,5,5,5)*/
fun main () {
    var a = 1
    var b = 5
    var c = 0
    for (i in a..b){
        c+=1
        repeat(c){
            println(i)
        }
    }
}