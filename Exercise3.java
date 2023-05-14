//Write a Java program to sort the elements of the stack in descending order.
public class Exercise3{
    public static void main(String args[]){
        Stack s=new Stack(6);
        s.push(8);
        s.push(2);
        s.push(9);
        s.push(12);
        s.push(4);
        s.push(18);
        s.display();
        System.out.println("after sorting in descending order");
        s.display();
        if (s.top==-1){
           System.out.println("stack is empty");
           return;
        }
        Stack tempStack=new Stack(s.arr.length);
        while(!s.isEmpty()){
           int temp=s.pop();
           while(!tempStack.isEmpty() && tempStack.peek() < temp){
             s.push(tempStack.pop());
           }
           tempStack.push(temp);
        }
        while(!tempStack.isEmpty()){
           int temp=tempStack.pop();
           s.push(temp);
        }
        s.display();
    }
}