public class LinkedList3 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public void printList(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public void insertAfter(Node prev_node,int new_data){
        if(prev_node==null){
            System.out.println("The given previous node cannot be null");
        }
        Node new_node=new Node(new_data);
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }

    public static void main(String[] args) {
        LinkedList3 list3=new LinkedList3();
        list3.push(1);
        list3.push(3);
        list3.insertAfter(list3.head.next,2);
        list3.printList();
    }
}
