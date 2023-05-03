//Write a Java program to reverse the elements of a stack.
public class Exercise4{
    public static void main(String args[]){
        Stack r=new Stack(6);
        r.push(1);
        r.push(2);
        r.push(3);
        r.push(4);
        r.push(5);
        r.push(7);
        r.display();
        System.out.println("after reversing");
        r.reverse();
        r.display();
    }
}