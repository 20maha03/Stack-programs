//Write a Java program to sort the elements of a given stack in ascending order.
public class SortingElements{
    public static void main(String[] args){
        System.out.println("initialize Stack");
        Stack stack=new Stack(7);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(1);
        stack.push(12);
        stack.push(6);
        stack.display();
        System.out.println("after sorting stack elements is");
        if(stack.top==-1){
           System.out.println("stack is empty");
           return;
        }
        Stack tempStack=new Stack(stack.arr.length);
        while(!stack.isEmpty()){
           int temp=stack.pop();
           while(!tempStack.isEmpty() && tempStack.peek()>temp){
             stack.push(tempStack.pop());
           }
           tempStack.push(temp);
        }
        while(!tempStack.isEmpty()){
          stack.push(tempStack.pop());
        }
        stack.display();
    }

}
