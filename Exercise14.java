//Write a Java program to merge two stacks into one.
public class Exercise14{
    public static void main(String args[]){
        Stack stack1=new Stack(4);
        stack1.push(3);
        stack1.push(4);
        stack1.push(6);
        stack1.push(7);
        stack1.display();
        Stack stack2=new Stack(4);
        stack2.push(4);
        stack2.push(3);
        stack2.push(2);
        stack2.push(1);
        stack2.display();
        int size1=stack1.top+1;
        int size2=stack2.top+1;
        Stack mergestack =new Stack(size1+size2);
        for(int i=0;i<size1;i++){
             mergestack.push(stack1.pop());
        }
        for(int i=0;i<size2;i++){
             mergestack.push(stack2.pop());
        }
        System.out.println(mergestack);
        mergestack.display();
       
    }
}
