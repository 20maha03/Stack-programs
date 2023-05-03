//Write a Java program to find the maximum and minimum elements in a stack.
public class Exercise5{
    public static void main(String args[]){
        Stack m=new Stack(5);
        m.push(1);
        m.push(5);
        m.push(4);
        m.push(9);
        m.push(3);
        m.display();
        System.out.println("minimum element is:"+m.getMin());
        System.out.println("maximum element is:"+m.getMax());
        

    }
}