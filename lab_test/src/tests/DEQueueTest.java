package tests;

import org.junit.*;

import app.*;

public class DEQueueTest {

    DEQueue<Integer> dequeueInt;
    
    Node<Integer> node1Int;
    Node<Integer> node2Int;
    Node<Integer> node3Int;

    @Before
    public void name() {
        dequeueInt = new DEQueue<>(Integer.class);
        node1Int = new Node<Integer>(10);
        node2Int = new Node<Integer>(-10);
        node3Int = new Node<Integer>(0);
    }

    @Test
    public void pushBack_OtherType() {
        DEQueue<String> dequeueStr = new DEQueue<>(String.class);
        Node<String> node1Str;
        Node<String> node2Str;
        Node<String> node3Str;

        node1Str = new Node<String>("1");
        node2Str = new Node<String>("2");
        node3Str = new Node<String>("3");

        dequeueStr.pushBack(node1Str);
        dequeueStr.pushBack(node2Str);
        dequeueStr.pushBack(node3Str);
        Assert.assertEquals(dequeueStr.first, node1Str);
        Assert.assertEquals(dequeueStr.last, node3Str);
        Assert.assertEquals(dequeueStr.size(), 3);
    }

    @Test
    public void pushBack_One() {
        dequeueInt.pushBack(node1Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 1);
    }

    @Test
    public void pushBack_Two() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node2Int);
        Assert.assertEquals(dequeueInt.size(), 2);
    }

    @Test
    public void pushBack_Many() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node3Int);
        Assert.assertEquals(dequeueInt.size(), 3);
    }

    @Test
    public void pushBack_Null() {
        dequeueInt.pushBack(null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void pushFront_One() {
        dequeueInt.pushFront(node1Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 1);
    }

    @Test
    public void pushFront_Two() {
        dequeueInt.pushFront(node1Int);
        dequeueInt.pushFront(node2Int);
        Assert.assertEquals(dequeueInt.first, node2Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 2);
    }

    @Test
    public void pushFront_Many() {
        dequeueInt.pushFront(node1Int);
        dequeueInt.pushFront(node2Int);
        dequeueInt.pushFront(node3Int);
        Assert.assertEquals(dequeueInt.first, node3Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 3);
    }

    @Test
    public void pushFront_Null() {
        dequeueInt.pushFront(null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void popBack_One() {
        dequeueInt.pushBack(node1Int);
        Node<Integer> actual = dequeueInt.popBack();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, null);
        Assert.assertEquals(dequeueInt.last, null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void popBack_Two() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        Node<Integer> actual = dequeueInt.popBack();
        Assert.assertEquals(actual, node2Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 1);
    }

    @Test
    public void popBack_Many() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        Node<Integer> actual = dequeueInt.popBack();
        Assert.assertEquals(actual, node3Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node2Int);
        Assert.assertEquals(dequeueInt.size(), 2);
    }

    @Test
    public void popBack_Null() {
        Node<Integer> actual = dequeueInt.popBack();
        Assert.assertEquals(actual, null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void popFront_One() {
        dequeueInt.pushBack(node1Int);
        Node<Integer> actual = dequeueInt.popFront();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, null);
        Assert.assertEquals(dequeueInt.last, null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void popFront_Two() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        Node<Integer> actual = dequeueInt.popFront();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, node2Int);
        Assert.assertEquals(dequeueInt.last, node2Int);
        Assert.assertEquals(dequeueInt.size(), 1);
    }

    @Test
    public void popFront_Many() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        Node<Integer> actual = dequeueInt.popFront();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, node2Int);
        Assert.assertEquals(dequeueInt.last, node3Int);
        Assert.assertEquals(dequeueInt.size(), 2);
    }

    @Test
    public void popFront_Null() {
        Node<Integer> actual = dequeueInt.popFront();
        Assert.assertEquals(actual, null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void back_One() {
        dequeueInt.pushBack(node1Int);
        Node<Integer> actual = dequeueInt.back();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 1);
    }

    @Test
    public void back_Two() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        Node<Integer> actual = dequeueInt.back();
        Assert.assertEquals(actual, node2Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node2Int);
        Assert.assertEquals(dequeueInt.size(), 2);
    }

    @Test
    public void back_Many() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        Node<Integer> actual = dequeueInt.back();
        Assert.assertEquals(actual, node3Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node3Int);
        Assert.assertEquals(dequeueInt.size(), 3);
    }

    @Test
    public void back_Null() {
        Node<Integer> actual = dequeueInt.back();
        Assert.assertEquals(actual, null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test
    public void front_One() {
        dequeueInt.pushBack(node1Int);
        Node<Integer> actual = dequeueInt.front();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node1Int);
        Assert.assertEquals(dequeueInt.size(), 1);
    }

    @Test
    public void front_Two() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        Node<Integer> actual = dequeueInt.front();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node2Int);
        Assert.assertEquals(dequeueInt.size(), 2);
    }

    @Test
    public void front_Many() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        Node<Integer> actual = dequeueInt.front();
        Assert.assertEquals(actual, node1Int);
        Assert.assertEquals(dequeueInt.first, node1Int);
        Assert.assertEquals(dequeueInt.last, node3Int);
        Assert.assertEquals(dequeueInt.size(), 3);
    }

    @Test
    public void front_Null() {
        Node<Integer> actual = dequeueInt.front();
        Assert.assertEquals(actual, null);
        Assert.assertEquals(dequeueInt.size(), 0);
    }

    @Test 
    public void size() {
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        int actual = dequeueInt.size();
        Assert.assertEquals(actual, 3);
    }

    @Test 
    public void clear() {
        int actual = dequeueInt.size();
        Assert.assertEquals(actual, 0);
        Assert.assertEquals(dequeueInt.first, null);
        Assert.assertEquals(dequeueInt.last, null);
    }

    @Test
    public void toArray() {
        int[] arr = new int[3];
        arr[0] = node1Int.value;
        arr[1] = node1Int.value;
        arr[2] = node1Int.value;
        dequeueInt.pushBack(node1Int);
        dequeueInt.pushBack(node2Int);
        dequeueInt.pushBack(node3Int);
        Integer[] actual = dequeueInt.toArray();
        Assert.assertEquals(actual, arr);
    }
}