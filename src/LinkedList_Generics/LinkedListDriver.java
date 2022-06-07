package LinkedList_Generics;

import java.util.Scanner;

public class LinkedListDriver {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println("---Linked list---");
        Node<Integer> node;
        System.out.println("Enter the number of data you want in the list(Integer) :");
        int data = sc.nextInt();
        int list;
        while(data>0) {
            System.out.println("Enter the data");
            list = sc.nextInt();
            ll.insertData(list);
            data--;
        }
        ll.printList();
        System.out.println();
        LinkedList<String> llS = new LinkedList<>();
        System.out.println("Enter the number of data you want in the list(String) :");
        int dataString = sc.nextInt();
        String listString;
        while(dataString>0) {
            System.out.println("Enter the data");
            listString = sc.next();
            llS.insertData(listString);
            dataString--;
        }
        llS.printList();
    }

}
