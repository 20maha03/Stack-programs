//Write a Java program to implement a stack that checks if a given element is present or not in the stack.
import java.util.Scanner;
public class Exercise8{
    public static void main(String args[]){
        Stack p=new Stack(5);
        p.push(8);
        p.push(3);
        p.push(2);
        p.push(5);
        p.push(2);
        Scanner input=new Scanner(System.in);
        System.out.println("enter num");
        int num=input.nextInt();
        for(int i=0;i<=p.top;i++){
           if(p.arr[i]==num){
             System.out.println("a given element "+num+ " is present");
             break;
           }
         }
        System.out.println("a given element "+num+ " is not present");
    }
}