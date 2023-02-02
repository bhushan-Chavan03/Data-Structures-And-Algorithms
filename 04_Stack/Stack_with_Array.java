class Stack_with_Array{
    public static class Stack{
       public static int []arr;
       
        
        Stack(int n){
            arr=new int[n];
        }

        public static int top=-1;



        static  boolean isEmpty(){
            if(top==-1){
                return true;
            }
            return false;
            }
        
            public static void push(int n){

                if(top>=5){
                    System.out.println("Stack is full");
                    return;
                }
                top++;
                arr[top]=n;
            }


            public static int pop(){
                if(top==-1){
                    System.out.println("Stack is empty");
                    return -1;
                }
               int peek= arr[top];
               top--;
               return peek;
            }


            public static void peek(){
                if(top==-1){
                    System.out.println("Stack is empty");
                    return ;}
                int peek=arr[top];
                System.out.println(peek);

            
    }
}
    

  

    public static void main(String []args){
        Stack s=new Stack(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while(s.top!=-1){
           // s.peek();
            System.out.println(s.pop());

        }

    }
}
