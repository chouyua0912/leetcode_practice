package z.learn;

import org.junit.Test;
import org.junit.Before;

/**
 * MyLinkedList Tester.
 *
 * @author chouyua
 * @version 1.0
 * @since <pre>Oct 3, 2018</pre>
 */
public class Q0707MyLinkedListTest {

    @Before
    public void before() throws Exception {
        example = new Q0707DesignLinkedList();
    }

    /**
     * Method: get(int index)
     */
    @Test
    public void testGet() throws Exception {

    }

    /**
     * Method: addAtHead(int val)
     */
    @Test
    public void testAddAtHead() throws Exception {
        example.addAtHead(0);
        example.addAtHead(1);
    }

    /**
     * Method: addAtTail(int val)
     */
    @Test
    public void testAddAtTail() throws Exception {
        example.addAtTail(0);
        example.addAtTail(1);
    }

    /**
     * Method: addAtIndex(int index, int val)
     */
    @Test
    public void testAddAtIndex() throws Exception {
        example.addAtHead(1);
        example.addAtIndex(1, 2);
        example.get(1);
        example.get(0);
        example.get(2);
    }

    /**
     * Method: deleteAtIndex(int index)
     */
    @Test
    public void testDeleteAtIndex() throws Exception {
        example.addAtTail(0);
        example.addAtTail(1);
        example.deleteAtIndex(0);
    }

    private Q0707DesignLinkedList example;
} 
