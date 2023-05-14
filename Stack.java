public class Stack{
        public int[] arr;
        public int top;
        public Stack(int size){
          arr=new int[size];
          top=-1;
        }
    public void push(int num){
       if(top==arr.length-1){
         System.out.println("stack is full");
       }
       else{
         top++;
         arr[top]=num;
       }
    }
    public int pop(){
        if(top==-1){
          System.out.println("istack underflow");
          return -1;
        }
        else{
          int poppedElement=arr[top];
          top--;
          return poppedElement;
        }
    } 
    public int peek(){
       if(top==-1){
         System.out.println("stack is empty");
         return -1;
       }
       else{
         return arr[top];
       }
    }
    public boolean isEmpty(){
       return top==-1;
    }
    public void display(){
       if(top==-1){
          System.out.println("stack is empty");
       }
       else{
          System.out.println("stack elements:");
          for(int i=top;i>=0;i--){
             System.out.println(arr[i]+" ");
          }
          System.out.println(" ");
        }
    }
}



