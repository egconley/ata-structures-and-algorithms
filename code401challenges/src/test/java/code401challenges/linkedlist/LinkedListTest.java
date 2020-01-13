package code401challenges.linkedlist;

import code401challenges.ArrayShift;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test_LinkedList_instantiateEmptyLinkedList() {
        LinkedList test1 = new LinkedList();

        String expected = "NULL";
        String actual = test1.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_insertInToLinkedList() {
        LinkedList test2 = new LinkedList();

        test2.insert("Apples", 1);

        String expected = "{ Apples } -> NULL";
        String actual = test2.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_headPointsToFirstNode() {
        LinkedList test3 = new LinkedList();

        test3.insert("Apples", 1);
        test3.insert("Bananas", 2);

        // insert() puts new item at the head, so if the head points to the first node,
        // new items get added to the front of the list.
        String expected = "{ Bananas } -> { Apples } -> NULL";
        String actual = test3.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_insertMultipleNodes() {
        LinkedList test4 = new LinkedList();

        test4.insert("Apples", 1);
        test4.insert("Bananas", 2);
        test4.insert("Cantaloupe", 3);

        int expectedSize = 3;
        int actualSize = test4.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void test_LinkedList_foundValueReturnsTrue() {
        LinkedList test5 = new LinkedList();

        test5.insert("Apples", 1);
        test5.insert("Bananas", 2);
        test5.insert("Cantaloupe", 3);

        assertTrue(test5.includes("Bananas"));
    }

    @Test
    public void test_LinkedList_NotFoundValueReturnsFalse() {
        LinkedList test6 = new LinkedList();

        test6.insert("Apples", 1);
        test6.insert("Bananas", 2);
        test6.insert("Cantaloupe", 3);

        assertFalse(test6.includes("Peaches"));
    }

    @Test
    public void test_LinkedList_returnCollectionOfValues() {
        LinkedList test4 = new LinkedList();

        test4.insert("Apples", 1);
        test4.insert("Bananas", 2);
        test4.insert("Cantaloupe", 3);

        // insert() puts new item at the head, so if the head points to the first node,
        // new items get added to the front of the list.
        String expected = "{ Cantaloupe } -> { Bananas } -> { Apples } -> NULL";
        String actual = test4.toString();

        assertEquals(expected, actual);
    }
}