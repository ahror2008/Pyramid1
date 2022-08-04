fun main(args: Array<String>) {

val a=5
    for (i in 1..a){
        for (j in 1..i){
            Thread.sleep(1000)
            print("1")
        }
        println()
    }
    val b=4
    for (i in b downTo 1){
        for (j in 1 ..i){
            Thread.sleep(1000)
                print("1")
        }
        println()
    }
}