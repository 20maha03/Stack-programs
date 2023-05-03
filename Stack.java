public class Stack{
        private int[] arr;
        private int top;
        public Stack(int size){
          arr=new int[size];
          top=-1;
        }
    public void push(int num){
       if(top==arr.length-1){
         System.out.println("stack is full");
       }
       else{
         top++;
         arr[top]=num;
       }
    }
    public int pop(){
        if(top==-1){
          System.out.println("istack underflow");
          return -1;
        }
        else{
          int poppedElement=arr[top];
          top--;
          return poppedElement;
        }
    } 
    public int peek(){
       if(top==-1){
         System.out.println("stack is empty");
         return -1;
       }
       else{
         return arr[top];
       }
    }
    public boolean isEmpty(){
       return top==-1;
    }
    public void display(){
       if(top==-1){
          System.out.println("stack is empty");
       }
       else{
          System.out.println("stack elements:");
          for(int i=top;i>=0;i--){
             System.out.println(arr[i]+" ");
          }
          System.out.println(" ");
        }
    }
    public void sort(){
      if(top==-1){
        System.out.println("stack is empty");
        return;
      }
      Stack tempStack=new Stack(arr.length);
      while(!isEmpty()){
        int temp=pop();
        while(!tempStack.isEmpty() && tempStack.peek()>temp){
          push(tempStack.pop());
        }
        tempStack.push(temp);
      }
      while(!tempStack.isEmpty()){
        push(tempStack.pop());
      }
    }
    public void descendingSort(){
      if(top==-1){
        System.out.println("stack is empty");
        return;
      }
      Stack tempStack=new Stack(arr.length);
      while(!isEmpty()){
        int temp=pop();
        while(!tempStack.isEmpty() && tempStack.peek() < temp){
          push(tempStack.pop());
        }
        tempStack.push(temp);
      }
       while(!tempStack.isEmpty()){
        int temp=tempStack.pop();
        push(temp);
      }
    }
    public void reverse(){
      int[] tempStack=new int[arr.length];
      int index=0;
      while(!isEmpty()){
        int temp=pop();
        tempStack[index++]=temp;
      }
      for(int i=0;i<index;i++){
        push(tempStack[i]);
      }
    }
    public int getMin(){
       int min=arr[0];
      for(int i=0;i<=top;i++){

        if(arr[i]<min){
          min=arr[i];
        }
      
    
      }
      return min;
    }
    public int getMax(){
       int max=arr[0];
      for(int i=0;i<=top;i++){

        if(arr[i]>max){
          max=arr[i];
        }
      
    
      }
      return max;
    }
    public void removeAll(){
      top=-1;
    }
    public int countElement(){
      int count=top+1;
      return count;
    }
    public void checkElement(int num){
      for(int i=0;i<=top;i++){
        if(arr[i]==num){
           System.out.println("a given element "+num+ " is present");
           break;
        }
        
      }
       System.out.println("a given element "+num+ " is not present");
    }
    public void dublicateElement(){
      int count;
      for(int i=0;i<top;i++){
         count=0;
        for(int j=0;j<=top;j++){
          if(arr[i]==arr[j]){
            count++;
          }
        }
        if(count==1){
          System.out.println(" "+arr[i]);
        }
      }
    }
    public void topAndBottom(){
      System.out.println("top element of a stack is:"+peek());
      for(int i=0;i<=top;i++){
         System.out.println("bottom element of a stack is:"+arr[0]);
         break;
      }
    }
    public void rightRotate(){
      int temp=arr[0];
      int j=0;
      while(j<top-1){
          arr[j]=arr[j+1];
          j=j+1;
      }
      arr[j]=temp;
      for(int i=0;i<top;i++){
        System.out.println(arr[i]);
      }
    }
    public void removeSpecificElement(){
      int count;
      for(int i=0;i<=top;i++){
        count=0;
        for(int j=0;j<=top;j++){
          if(arr[i]==arr[j]){
            count++;
          }
        }
        if(count!=1){
          System.out.println(arr[i]);
        }
        
      }
    }
    public void swapTwoElements(){
      if(top<1){
        System.out.println("stack has less than rwo elements");
      }
      else{
        int temp=arr[top];
        arr[top]=arr[top-1];
        arr[top-1]=temp;
      }
    }
    public static Stack mergeTwoStack(Stack stack1,Stack stack2){
       int size1=stack1.top+1;
       int size2=stack2.top+1;
       Stack mergestack =new Stack(size1+size2);
       for(int i=0;i<size1;i++){
        mergestack.push(stack1.pop());
       }
       for(int i=0;i<size2;i++){
        mergestack.push(stack2.pop());
       }
       return mergestack;
    }
    public boolean equals(Stack otherStack){
      if(this.top!=otherStack.top){
         return false;
      }
      for(int i=0;i<=top;i++){
        if(this.arr[i]!=otherStack.arr[i]){
           return false;
        }
      }
      return true;
    }
    public void commonElement(Stack name1){
        Stack tempStack = new Stack(arr.length);
        for(int i=0;i<=top;i++){
          int currentEle=arr[i];
          for(int j=0;j<=name1.top;j++){
            if(currentEle==name1.arr[j]){
              tempStack.push(currentEle);
              break;
            }
          }
        }
        tempStack.display();
    }
    public void shifting(Stack stack){
      int temp=stack.pop();
      Stack tempStack=new Stack(arr.length);
      for(int i=top;i>=0;i--){
        tempStack.push(stack.pop());
      }
      tempStack.push(temp);
      for(int i=top;i>=0;i--){
        System.out.print(arr[i]+" ");
      }

    }


}



