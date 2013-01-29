/* Kotlin language
http://kotlin.jetbrains.org */

fun main(args: Array<String>) {
    val testsCount = readLine()!!.toInt();

    for (case in 1..testsCount) {
        print("Case #${case}: ")

        var string = readLine() ?: "";

        var smile = false;
        var min = 0;
        var max = 0;

        for (char in string) {
            when (char) {
                '(' -> {
                    max++;
                    if (!smile) {
                        min++;
                    }
                }
                ')' -> {
                    min--;
                    if (min<0) min=0;
                    if (!smile) {
                        max--;
                        if (max<0) {
                            break;
                        }
                    }
                }
                else -> {
                }
            }
            smile = char == ':';
        }

        println(if (min == 0 && max>=0) "YES" else "NO");
    }

}