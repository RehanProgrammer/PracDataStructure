package dataStructures;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {
    private linkedList linkedList;

    @Before
    public void SetUp() throws Exception{
        linkedList = new linkedList();
    }

    @Test
    public void addFront(){
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(3, linkedList.getFirst());
        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void GetFirst(){
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(3, linkedList.getFirst());
    }

    @Test
    public void GetLast(){
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void addBack(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assert.assertEquals(1 , linkedList.getFirst());
        Assert.assertEquals(3,linkedList.getLast());
    }

    @Test
    public void size(){
        Assert.assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        Assert.assertEquals(1,linkedList.size());
        linkedList.addBack(2);
        Assert.assertEquals(2,linkedList.size());

    }

    @Test
    public void clear(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.clear();
        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void deleteValue(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.deleteValue(2);
        Assert.assertEquals(2,linkedList.size());
        Assert.assertEquals(1,linkedList.getFirst());
        Assert.assertEquals(3,linkedList.getLast());
    }
}
