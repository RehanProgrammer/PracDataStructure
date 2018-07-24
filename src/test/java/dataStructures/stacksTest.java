package dataStructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class stacksTest {

    Stacks stack;

    @Before
    public void SetUp() throws Exception{
        stack = new Stacks();
    }
    @Test
    public void testPush(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3, stack.peek());
    }

    @Test
    public void testPop(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Assert.assertEquals(3,stack.pop());
    }
}
