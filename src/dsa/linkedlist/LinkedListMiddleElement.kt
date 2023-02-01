package dsa.linkedlist

internal class LinkedListKoltin {
    var head: Node? = null

    internal class Node(var data: Int) {
        var next: Node? = null
    }

    fun insert(data: Int) {
        val new_node = Node(data)
        new_node.next = null
        if (head == null) {
            head = new_node
        } else {
            var last = head
            while (last!!.next != null) {
                last = last.next
            }
            last.next = new_node
        }

    }

    fun reverseLinkedList() {
        var current = head
        var prev: Node? = null
        var next: Node? = null
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
    }

    fun printList() {
        var currNode = head
        while (currNode != null) {
            print(currNode.data.toString() + " ")
            currNode = currNode.next
        }
    }

    fun middleNode(): Node? {

        var current: Node? = head
        var fast: Node? = head
        if (fast == null || current == null) {
            return null
        } else {
            while (fast?.next != null) {
                current = current?.next
                fast = fast?.next?.next
            }
            return current
        }
    }

    fun deleteDuplicates() {
        var current = head

        while (current != null) {

            var temp = current

            while (temp != null && temp.data == current.data) {
                temp = temp.next
            }

            current.next = temp
            current = current.next

        }

    }

    fun hasCycle() {

        var slow = head
        var fast = head
        var cycleFoundFast: Node? = null

        while(slow?.next != null){
            fast = fast?.next
            slow = slow?.next
            fast = fast?.next
            if(fast == slow) {
                cycleFoundFast = fast
                removeCycle(cycleFoundFast)
            }
        }

        println("No Cycle")

    }

    fun removeCycle(cycleFoundFast: Node?) {
        var slow = head
        var fast = cycleFoundFast

        while (slow?.next != fast?.next){
            slow = slow?.next
            fast = fast?.next
        }

        fast?.next = null

    }

}

fun main(args: Array<String>) {
    var list = LinkedListKoltin()
    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.insert(4)
    //println(list.middleNode()?.data ?: "Empty")
    list.deleteDuplicates()
    list.printList()
}

