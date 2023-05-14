//Write a Java program to remove duplicates from a given stack.
public class Exercise9{
    public static void main(String args[]){
        Stack d=new Stack(5);
        d.push(8);
        d.push(3);
        d.push(2);
        d.push(5);
        d.push(2);
        int count;
        for(int i=0;i<d.top;i++){
           count=0;
           for(int j=0;j<=d.top;j++){
             if(d.arr[i]==d.arr[j]){
               count++;
             }
           }
           if(count==1){
             System.out.println(" "+d.arr[i]);
           }
        }
    }
}