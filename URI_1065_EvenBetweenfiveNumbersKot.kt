package August_Intersting_Uri

import java.util.*

fun main(args:Array<String>) {
    var n:Int;
    var count:Int = 0;
    var sc = Scanner(System.`in`)

    for (x in 0..4){
        n = sc.nextInt();
        if (n % 2 == 0){
            count++;
        }
    }
    println("$count valores pares")

    println("Hello World!")

}