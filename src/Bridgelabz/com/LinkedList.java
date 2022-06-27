package Bridgelabz.com;

public class LinkedList<K> {

    Node<K> head;
    Node<K> tail;

    public void push(K key) {
        Node<K> newNode = new Node<>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void print() {
        Node<K> temp = head;
        while(temp!=null){
            System.out.print(temp.key+"->");
            temp = temp.next;
        }
    }
}
