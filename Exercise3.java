//Write a Java program to sort the elements of the stack in descending order.
public class Exercise3{
    public static void main(String args[]){
        Stack s=new Stack(6);
        s.push(8);
        s.push(2);
        s.push(9);
        s.push(12);
        s.push(4);
        s.push(18);
        s.display();
        System.out.println("after sorting in descending order");
        s.descendingSort();
        s.display();
        

    }
}