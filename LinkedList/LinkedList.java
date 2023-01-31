public class LinkedList{
    public  class node{
        int data;
        node next;

        node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static node head;
    public static node tail;

    public void addFirst(int data){
        node newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public  void addLast(int data){
        node newNode=new node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }

        head=head.next;
    }

    public void removeLast(){
        node temp=head;
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        else if(head==tail){
            head=tail=null;
            return;
        }

        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
    }

    public void display(){
        node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"--> ");
            temp=temp.next;

        }

        System.out.println("null");
    }


    public static void main(String [] args){
        LinkedList ll =new LinkedList();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.removeFirst();
        ll.removeLast();

        ll.display();
       
    }


}