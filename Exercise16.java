//Write a Java program that implements a stack and checks if two stacks are equal. 
public class Exercise16{
    public static void main(String args[]){
        Stack c=new Stack(4);
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        c.display();
        Stack c1=new Stack(4);
        c1.push(1);
        c1.push(12);
        c1.push(3);
        c1.push(4);
        c1.display();
        for(int i=0;i<=c1.top;i++){
          if(c.arr[i]==c1.arr[i]){
             System.out.println("two stacks are equal");
             break;
          }
        }
        
   }
}