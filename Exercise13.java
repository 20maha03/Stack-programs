//Write a Java program to swap the top two elements of a given stack.
public class Exercise13{
    public static void main(String args[]){
        Stack sw=new Stack(5);
        sw.push(7);
        sw.push(9);
        sw.push(5);
        sw.push(4);
        sw.push(3);
        sw.display();
        System.out.println("after swapping");
        if(sw.top<1){
           System.out.println("stack has less than rwo elements");
        }
        else{
           int temp=sw.arr[sw.top];
           sw.arr[sw.top]=sw.arr[sw.top-1];
           sw.arr[sw.top-1]=temp;
        }
        sw.display();
      }
}