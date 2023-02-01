package dsa.queue.general

import java.util.*

//Queue using stack
fun main() {

    var array = intArrayOf(1,2,3)
    var queueDSS = QueueDSS()

    for(i in array){
        queueDSS.push(i)
    }

    queueDSS.pop()
    queueDSS.printQueue()


}

internal class QueueDSS{
    var stack1 = Stack<Int>()
    var stack2 = Stack<Int>()

    fun pop(){

        while(stack1.isEmpty().not()){
            stack2.push(stack1.peek())
            stack1.pop()
        }

        stack2.pop()
        while(stack1.isEmpty().not()){
            stack1.push(stack2.peek())
            stack2.pop()
        }

    }

    fun push(element: Int){
        stack1.push(element)
    }

    fun printQueue(){

        while(stack1.isEmpty().not()){
            stack2.push(stack1.peek())
            stack1.pop()
        }

        while(stack2.isNotEmpty()){
            println(stack2.peek())
            stack1.push(stack2.peek())
            stack2.pop()
        }

    }
}