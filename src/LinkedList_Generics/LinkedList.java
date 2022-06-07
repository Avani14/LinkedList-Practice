package LinkedList_Generics;
class Node<E>{
    E data;
    Node<E> next;
    public Node(E data)
    {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList<E> {
    Node<E> head;
    public <E> void insertData(E data)
    {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }
    public  <E> void printList()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }

    }
    public void removeAll()
    {
        head = null;
    }

}
