package dataStructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTree_test {

    BinarySearchTree bst;

    @Before
    public void Setup(){
        bst = new BinarySearchTree();
    }

    @Test
    public void insert(){
        bst.insert(5,"e");
        bst.insert(3,"a");
        bst.insert(2,"c");
        bst.insert(4,"t");
        bst.insert(7,"w");
        bst.insert(6,"p");
        bst.insert(8,"m");

        //Assert.assertEquals("e" , bst.find(5));
        //Assert.assertEquals("a" , bst.find(3));
       // Assert.assertEquals("c" , bst.find(2));
        //Assert.assertEquals("t" , bst.find(4));
        //Assert.assertEquals("w" , bst.find(7));
        Assert.assertEquals("m" , bst.find(8));

    }

}
