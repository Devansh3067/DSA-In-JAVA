package StackQueues.Stack.CustomStack;

public class DStack extends StaticStack{

    DStack(){
        super();
    }

    DStack(int size){
        super(size);
    }

    @Override
    public boolean push(int val) {
        if(super.isFull()){
            int[] temp = new int[stack.length * 2];
            int j = 0;
            System.arraycopy(stack,0,temp,0, stack.length);
            stack = temp;
        }
        return super.push(val);
    }
}
