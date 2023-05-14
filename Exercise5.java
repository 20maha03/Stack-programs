//Write a Java program to find the maximum and minimum elements in a stack.
public class Exercise5{
    public static void main(String args[]){
        Stack m=new Stack(5);
        m.push(1);
        m.push(5);
        m.push(4);
        m.push(9);
        m.push(3);
        m.display();
        int min=m.arr[0];
        for(int i=0;i<=m.top;i++){
           if(m.arr[i]<min){
             min=m.arr[i];
          }
        }
        System.out.println("minimum value is:"+min);
        int max=m.arr[0];
        for(int i=0;i<=m.top;i++){
           if(m.arr[i]>max){
             max=m.arr[i];
           }
        }
        System.out.println("maximum value is:"+max);
    }
}