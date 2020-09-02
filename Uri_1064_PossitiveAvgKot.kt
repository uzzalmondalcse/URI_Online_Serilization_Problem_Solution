package August_Intersting_Uri

import java.util.*

fun main(args: Array<String>) {

    var count = 0.0F;
    var tNum = 0.0F;
    var sc = Scanner(System.`in`)

    for (x in 1..6) {
       var  n1 = sc.nextFloat();
        if (n1 > 0) {
            count += 1;
            tNum += n1;
        }
    }
   var avg = tNum / count;
    println( "%.0f valores positivos".format(count));
    println("%.1f".format(avg))

}