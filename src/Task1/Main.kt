package Task1
/**Дано целое число n (>0).
 * Найти сумму 1+1/2+1/3+…+1/n (вещественное число).*/
fun main (){
    var num = 5.00;
    var b = 1.00
    var c = 0.00
while (--num > 0){
    c += b/num
}
    println(c)
}