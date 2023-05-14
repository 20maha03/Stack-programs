//Write a Java program to remove a specific element from a stack.
public class Exercise12{
    public static void main(String args[]){
        Stack se=new Stack(5);
        se.push(9);
        se.push(13);
        se.push(1);
        se.push(1);
        se.push(1);
        int count;
        for(int i=0;i<=se.top;i++){
           count=0;
           for(int j=0;j<=se.top;j++){
             if(se.arr[i]==se.arr[j]){
               count++;
             }
           }
           if(count!=1){
              System.out.println(se.arr[i]);
           }
        
        }
    }
}