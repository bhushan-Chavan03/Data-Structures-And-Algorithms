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
    public static int size;

    public void addFirst(int data){
        node newNode=new node(data);
        if(head==null){
            head=tail=newNode;
            size=1;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }

    public  void addLast(int data){
        node newNode=new node(data);

        if(head==null){
            head=tail=newNode;
            size=1;
            return;
        }

        tail.next=newNode;
        tail=newNode;
        size++;
    }


   

    public void removeFirst(){
        if(head==null){
            System.out.println("LinkedList is empty");
            size=0;
            return;
        }

        head=head.next;
        size--;
    }

    public void removeLast(){
        node temp=head;
        if(head==null){
            System.out.println("LinkedList is empty");
            size=0;
            return;
        }
        else if(head==tail){
            head=tail=null;
            size=1;
            return;
        }

        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    public void display(){
        node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"--> ");
            temp=temp.next;

        }

        System.out.println("null");
    }

    private node getMid(node head){
        node slow=head;
        node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public node merge(node head1,node head2){
        node mergedll=new node(-1);
        node temp=mergedll;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }

            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;

        }

        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergedll.next;
    }


    public node mergeSort(node head){
        if(head==null && head.next==null){
            return head;
        }
        //finf mid
        node mid=getMid(head);

        // left and right MS
        node rightHead=mid.next;
        mid.next=null;
        node newLeft=mergeSort(head);
        node newRight=mergeSort(rightHead);


        //merge
        return merge (newLeft,newRight);

    }


    public static void main(String [] args){
        LinkedList ll =new LinkedList();

        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        

        ll.display();
       ll.mergeSort(head);
       ll.display();
       
    }


}