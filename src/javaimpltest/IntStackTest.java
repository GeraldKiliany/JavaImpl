package javaimpltest;

import javaimpl.IntStack;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class IntStackTest {

    IntStack myStack;
    int myVal;

    @Before
    public void setUp() {
        myStack = new IntStack();
        int myVal = 1;
    }


    @Test
    public void TestIsEmptyAndPush(){
        assert(myStack.isEmpty());
        myStack.push(myVal);
        assert(!myStack.isEmpty());
    }

    @Test
    public void TestPeek(){
        myStack.push(myVal);
        assert(myStack.peek() == myVal);
    }

    @Test
    public void TestPop(){
        myStack.push(myVal);
        myStack.pop();
        assert(myStack.isEmpty());
    }

    @Test
    public void TestLifo(){
        myStack.push(myVal);
        int newVal = 2;
        myStack.push(newVal);
        assert(myStack.peek() == newVal);

    }

    @After
    public void tearDown(){
        myStack = null;
    }
}
