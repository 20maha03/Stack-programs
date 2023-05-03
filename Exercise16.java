//Write a Java program that implements a stack and checks if two stacks are equal. 
public class Exercise16{
    public static void main(String args[]){
        Stack c=new Stack(4);
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        c.display();
        Stack c1=new Stack(4);
        c1.push(4);
        c1.push(5);
        c1.push(6);
        c1.push(7);
        c1.display();
        System.out.println("is stack1 is equal to stack2:"+c.equals(c1));


    }
}