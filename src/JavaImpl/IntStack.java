package JavaImpl;

// Stack implemented with integer data

public class IntStack {

    // Underlying node class that stack will use for int data.
    private class IntNode{
        private int data;
        private IntNode next;

        IntNode(int nData){
            data = nData;
        }
    }

    private IntNode top;

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        return top.data;
    }

    public int pop(){
        int popVal = top.data; //Check if null, throw exception
        top = top.next;
        return popVal;
    }

    public void push(int pushVal){
        IntNode newTop = new IntNode(pushVal);
        newTop.next = top;
        top = newTop;
    }
}
