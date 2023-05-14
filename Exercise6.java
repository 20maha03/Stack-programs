//Write a Java program to remove all elements from a stack.
public class Exercise6{
    public static void main(String args[]){
        Stack a=new Stack(6);
        a.push(9);
        a.push(8);
        a.push(5);
        a.push(3);
        a.push(4);
        a.push(2);
        a.display();
        System.out.println(a.isEmpty());
        a.top=-1;
        a.display();
    }
}