/* Kotlin language
http://kotlin.jetbrains.org */

import java.util.Arrays

fun main(args: Array<String>) {
    val testsCount = readLine()!!.toInt();

    for (case in 1..testsCount) {
        print("Case #${case}: ")

        var string = readLine() ?: "";

        val counter = Array<Int>(26,{0});

        for (char in string) {
            when (char) {
                in 'a'..'z' -> {
                    counter[char.toInt() - 'a'.toInt()]++;
                }
                in 'A'..'Z' -> {
                    counter[char.toInt() - 'A'.toInt()]++;
                }
                else -> {
                    // do nothing
                }
            }
        }

        Arrays.sort(counter);

        var sum = 0;
        for (i in 0..25) {
            sum+= (i+1)*counter[i];
        }

        println(sum);
    }
}