//Write a Java program to find the top and bottom elements of a given stack.
public class Exercise10{
    public static void main(String args[]){
        Stack t=new Stack(6);
        t.push(8);
        t.push(7);
        t.push(6);
        t.push(5);
        t.push(2);
        t.push(1);
        t.topAndBottom();
    }
}