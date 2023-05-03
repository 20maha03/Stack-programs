//Write a java program to implement a stack with push and pop operations.find the top most element of stack and check if the stack is empty or not?
import java.util.Scanner;
public class FindTopElement{
    public static void main(String args[]){
       System.out.println("initialize a stack");
       Stack stack= new Stack(5);
       System.out.println("is the stack empty?"+stack.isEmpty());
       System.out.println("print the stack elements:");
       stack.push(1);
       stack.push(2);
       stack.push(3);
       stack.push(4);
       stack.push(5);
       stack.display();
       System.out.println("top element on the stack"+stack.peek());
       System.out.println("remove the first element on the stack");
       stack.pop();
       stack.display();
       System.out.println("top element after poping on the stack"+stack.peek());
       System.out.println("is the stack empty?"+stack.isEmpty());
    }
}
