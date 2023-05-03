//Write a Java program to merge two stacks into one.
public class Exercise14{
    public static void main(String args[]){
        Stack stack1=new Stack(4);
        stack1.push(3);
        stack1.push(4);
        stack1.push(6);
        stack1.push(7);
        stack1.display();
        Stack stack2=new Stack(4);
        stack2.push(4);
        stack2.push(3);
        stack2.push(2);
        stack2.push(1);
        stack2.display();
        stack2.mergeTwoStack(stack1,stack2);
        stack2.display();
    }
}
