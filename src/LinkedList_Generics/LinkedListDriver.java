package LinkedList_Generics;

import java.util.Scanner;

public class LinkedListDriver {
    static Scanner sc;
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("---Linked list---");
        ll.insertData(12);
        ll.insertData(44);
        ll.insertData(98);
        ll.printList();
        System.out.println();
        System.out.println(ll);
        LinkedList<String> llS = new LinkedList<>();
        llS.insertData("Avani");
        llS.insertData("Trivedi");
        llS.printList();
        System.out.println(llS);
        System.out.println();
    }

}
