package TestJavaImpl;

import JavaImpl.IntStack;

import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestIntStack {

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

    @After
    public void tearDown(){
        myStack = null;
    }
}
