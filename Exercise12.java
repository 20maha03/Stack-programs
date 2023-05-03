//Write a Java program to remove a specific element from a stack.
public class Exercise12{
    public static void main(String args[]){
        Stack se=new Stack(5);
        se.push(9);
        se.push(13);
        se.push(1);
        se.push(1);
        se.push(1);
        
        se.removeSpecificElement();
        
    }
}