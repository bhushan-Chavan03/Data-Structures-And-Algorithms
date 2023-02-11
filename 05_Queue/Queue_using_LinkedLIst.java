public class Queue_using_LinkedLIst {
    public static class Queue{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

        
    }
    public static Node front;
    public static Node rear;

    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        return false;
    }

    public void add(int data){
        Node newNONode=new Node(data);
        if(isEmpty()){
            front=rear=newNONode;
            return;
        }
        rear.next=newNONode;
        rear=newNONode;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=front.data;
        front=front.next;
        return value;
    }
}


    public static void main(String []args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
         q.add(3);
        q.add(4);
        q.add(5);

        while(! q.isEmpty()){
            System.out.println(q.remove());
        }

        

    }
    
}
