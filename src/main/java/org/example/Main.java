package org.example;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        for (int i = 1; i <= 10; i++) {
            list.pushFront(i);
        }
        list.print();
        list.reverseList();
        list.print();
    }


}

class List {
    static Node head;
    static class Node {
        int value;
        Node next;
    }

    public static void pushFront(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public static void print() {
        Node node = head;
        while (node != null) {
            System.out.printf("%d ", node.value);
            node = node.next;
        }
        System.out.println();
    }


    // -----Home-Work-----

    public static void reverseList(){

        if (head != null && head.next != null) {
            Node current = head.next;
            head.next = null;
            while (current != null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        } else {head = null;}
    }
}