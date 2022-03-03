import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList1 {
    public static Node insert(Node head,int data){
    if(head==null)
        return new Node(data);

    head.next=insert(head.next,data);
    return head;
    }
    public static void display(Node head){
        Node start=head;

        while (start!=null){
            System.out.println(start.data);
            start=start.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int N=sc.nextInt();
        Node head=null;
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
       
        while (N-->0){
            int element=sc.nextInt();
            head=insert(head,element);
        }
        display(head);
        sc.close();
    }
}
