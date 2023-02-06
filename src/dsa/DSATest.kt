package dsa

fun main(){
    val bean1 = Bean("Orange")

    val bean2 = Bean("Orange")

    var bean3 = bean1.copy()
    bean3.color = "Red"

    println(bean1==bean3)
    println(bean1)
    println(bean3)


    var list = mutableListOf<Int>(1,2,3,4,5)
    var list1 = mutableListOf<Int>(1,2,3,4,5)
    var list2 = mutableListOf<Char>('a','b','c')

    var superList = mutableListOf<MutableList<Int>>(list1,list)

    println(superList.flatMap { it })

    println(superList.flatten())

    println(list.zip(list2))

    println(list.filter { it>2 }.map { it.toString() })

    println(list)

    var carTest = object :CarTest{
        override fun demo(a: Int) {
            println(a)

        }
    }
    carTest.demo(23)



}


interface CarTest{
    fun demo(a:Int)
}


data class Bean(var color: String)