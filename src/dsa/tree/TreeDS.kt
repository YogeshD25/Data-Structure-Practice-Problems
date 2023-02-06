package dsa.tree

 class Node(var value: Int) {
    var left: Node? = null
    var right: Node? = null
}


 class BinaryTree {
    var root: Node? = null
    fun printInorder(node: Node? = root) {
        if (node == null) return
        printInorder(node.left)
        print(node.value.toString() + " ")
        printInorder(node.right)
    }

    fun printPreorder(node: Node? = root) {
        if (node == null) return
        print(node.value.toString() + " ")
        printPreorder(node.left)
        printPreorder(node.right)
    }

    fun printPostorder(node: Node? = root) {
        if (node == null) return
        printPostorder(node.left)
        printPostorder(node.right)
        print(node.value.toString() + " ")
    }
}

fun main(){


//    //Using Binary Node

//    var zero = BinaryNode(0)
//    var one = BinaryNode(1)
//    var two = BinaryNode(2)
//    var three = BinaryNode(3)
//    var four = BinaryNode(4)
//    var five = BinaryNode(5)
//    var six = BinaryNode(6)
//
//    zero.left = one
//    zero.right = two
//    one.left = three
//    one.right = four
//    two.right = six
//    two.left = five
//
//    zero.preOrderTraversal()
//    println()
//    zero.inOrderTraversal()
//    println()
//    zero.postOrderTraversal()


    //Normal Different class of Binary tree

//    val tree = BinaryTree()
//    tree.root = Node(1)
//    tree.root?.left = Node(2)
//    tree.root?.right = Node(3)
//    tree.root?.left?.left = Node(4)
//    tree.root?.left?.right = Node(5)
//
//    // Function call
//    println(
//        "\nInorder traversal of binary tree is "
//    )
//    tree.printInorder()
//
//    println(
//        "\nPreorder traversal of binary tree is "
//    )
//    tree.printPreorder()
//
//    println(
//        "\nPostorder traversal of binary tree is "
//    )
//    tree.printPostorder()


    // Binary Search Tree Insertion

    var arr = intArrayOf(7,6,8,1,3)

    var binarySearchTree = BinarySearchTree()

    constructBinarySearchTreeRec(arr, binarySearchTree)
    binarySearchTree.printPreorder()




}


class BinarySearchTree {
    var root: Node? = null

    fun insertDataBinaryTreeRec(node: Node?, element: Int): Node? {
        var node = node
        if (node == null) {
            root = Node(element)
            return root
        } else if (element< node.value ){
            node.left = insertDataBinaryTreeRec(node.left, element)
        } else if(element> node.value) {
            node.right = insertDataBinaryTreeRec(node.right, element)
        }

        return node

    }
    fun findNode(root:  Node?,element: Int): Node?{

        if(root == null || element == root?.value){
            return root
        }

        if(root.value < element){
            return findNode(root.right, element)
        }

        return findNode(root.left, element)

    }

    fun printInorder(node: Node? = root) {
        if (node == null) return
        printInorder(node.left)
        print(node.value.toString() + " ")
        printInorder(node.right)
    }

    fun printPreorder(node: Node? = root) {
        if (node == null) return
        print(node.value.toString() + " ")
        printPreorder(node.left)
        printPreorder(node.right)
    }

    fun printPostorder(node: Node? = root) {
        if (node == null) return
        printPostorder(node.left)
        printPostorder(node.right)
        print(node.value.toString() + " ")
    }

    fun insert(key: Int) {
        root = insertDataBinaryTreeRec(root, key)
    }
}

fun constructBinarySearchTreeRec(arr: IntArray, binaryTree: BinarySearchTree) {

    for(i in 0..arr.size-1) {
        binaryTree.insert(arr[i])
    }
}





// Optional Tree format
internal class BinaryNode(
    var value: Int,
    var left: BinaryNode? = null,
    var right: BinaryNode? = null
){


    fun performPrintAction(){
        println("Node is ${value}")
    }

    fun preOrderTraversal(){
        performPrintAction()
        left?.preOrderTraversal()
        right?.preOrderTraversal()
    }

    fun inOrderTraversal(){

        left?.preOrderTraversal()
        performPrintAction()
        right?.preOrderTraversal()
    }

    fun postOrderTraversal(){
        left?.preOrderTraversal()
        right?.preOrderTraversal()
        performPrintAction()
    }
}

//fun constructBinarySearchTree(arr: IntArray, tree: BinaryTree) {
//    tree.root = Node(7)
//    for(i in 1..arr.size-1){
//        var temp = tree.root
//        while(temp?.left !=null || temp?.right!=null){
//            if(temp.left != null && arr[i] < temp.value){
//                temp = temp.left
//            } else{
//                break
//            }
//
//            if(temp?.right != null && arr[i] > temp.value){
//                temp = temp.right
//            } else {
//                break
//            }
//        }
//
//        if(arr[i] >  temp!!.value){
//            temp.right = Node(arr[i])
//        } else {
//            temp.left = Node(arr[i])
//        }
//
//    }
//    tree.printPreorder(tree.root)
//}
