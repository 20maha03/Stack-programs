//Write a Java program to sort the elements of a given stack in ascending order.
public class SortingElements{
    public static void main(String[] args){
        System.out.println("initialize Stack");
        Stack stack=new Stack(7);
        stack.push(5);
        stack.push(7);
        stack.push(2);
        stack.push(1);
        stack.push(12);
        stack.push(6);
        stack.display();
        System.out.println("after sorting stack elements is");
        stack.sort();
        stack.display();

    }
}