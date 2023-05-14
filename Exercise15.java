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
        Stack tempStack = new Stack(name.arr.length);
        for(int i=0;i<=name.top;i++){
           int currentEle=name.arr[i];
           for(int j=0;j<=name1.top;j++){
             if(currentEle==name1.arr[j]){
               tempStack.push(currentEle);
               break;
             }
           }
        }
        tempStack.display();
      }
}