package dsa.linkedlist;


class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public LinkedList insert(LinkedList list, int data){
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public LinkedList reverseLinkedList(LinkedList list){
        Node current = list.head;
        Node prev = null;
        Node next = null;

        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        list.head = prev;
        return list;
    }

    public void printList(LinkedList list)
    {
        Node currNode = list.head;

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

}
public class SimpleLinkedList {

    public static void main(String args[]){

        LinkedList list = new LinkedList();

        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list = list.insert(list, 4);

        list = list.reverseLinkedList(list);

        list.printList(list);


    }
}
