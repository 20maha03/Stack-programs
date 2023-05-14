//Write a Java program to count all stack elements.
public class Exercise7{
    public static void main(String args[]){
        Stack c=new Stack(6);
        c.push(9);
        c.push(8);
        c.push(3);
        c.push(2);
        c.push(5);
        c.push(2);
        int count=c.top+1;
        System.out.println("number of elements in a stack is:"+count);
    }
}