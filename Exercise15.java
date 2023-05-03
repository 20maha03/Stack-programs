//Write a Java program that implements a stack and finds common elements between two stacks.
public class Exercise15{
    public static void main(String args[]){
        Stack name=new Stack(4);
        name.push(1);
        name.push(3);
        name.push(2);
        name.push(5);
        name.display();
        Stack name1=new Stack(4);
        name1.push(4);
        name1.push(2);
        name1.push(3);
        name1.push(6);
        name1.display();
        name.commonElement(name1);

    }
}