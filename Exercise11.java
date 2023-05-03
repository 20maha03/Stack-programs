//Write a Java program to rotate the stack elements in the right direction.
public class Exercise11{
    public static void main(String args[]){
        Stack rr=new Stack(6);
        rr.push(1);
        rr.push(2);
        rr.push(3);
        rr.push(4);
        rr.push(5);
        rr.push(6);
        rr.display();
        System.out.println("rotate the stack elements to the right by 1 position");
        rr.rightRotate();
        //rr.display();
        //System.out.println("rotate the stack elements to the right by 2 position");
        //rr.rightRotate(2);
        //rr.display();
    }
}