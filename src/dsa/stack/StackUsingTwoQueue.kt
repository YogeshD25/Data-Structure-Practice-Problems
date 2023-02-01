package dsa.stack



import java.util.*

//Queue using stack
fun main() {

    var array = intArrayOf(1,2,3)
    var stackDSS = StackDSS()

    for(i in array){
        stackDSS.push(i)
    }

    stackDSS.pop()
    stackDSS.printQueue()


}

internal class StackDSS{
    var queue1: Queue<Int> = LinkedList<Int>()
    var queue2: Queue<Int> = LinkedList<Int>()

    fun pop(){
        queue1.remove()
    }

    fun push(element: Int){

        while(queue1.isNotEmpty()){
            queue2.add(queue1.peek())
            queue1.remove()
        }

        queue2.add(element)

        while(queue2.isNotEmpty()){
            queue1.add(queue2.peek())
            queue2.remove()
        }

    }

    fun printQueue(){

        while(queue1.isNotEmpty()){
            queue2.add(queue1.peek())
            queue1.remove()
        }

        while(queue2.isNotEmpty()){
            println(queue2.peek())
            queue1.add(queue2.peek())
            queue2.remove()
        }

    }
}