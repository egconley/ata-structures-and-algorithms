package code401challenges.linkedlist;

import code401challenges.ArrayShift;
import org.junit.Assert;
import org.junit.Before;
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
        LinkedList test7 = new LinkedList();

        test7.insert("Apples", 1);
        test7.insert("Bananas", 2);
        test7.insert("Cantaloupe", 3);

        // insert() puts new item at the head, so if the head points to the first node,
        // new items get added to the front of the list.
        String expected = "{ Cantaloupe } -> { Bananas } -> { Apples } -> NULL";
        String actual = test7.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_append() {
        LinkedList test8 = new LinkedList();

        test8.insert("Apples", 1);
        test8.insert("Bananas", 2);
        test8.insert("Cantaloupe", 3);

        test8.append("Mangosteen", 4);

        String expected = "{ Cantaloupe } -> { Bananas } -> { Apples } -> { Mangosteen } -> NULL";
        String actual =  test8.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_appendToNULL() {
        LinkedList test8b = new LinkedList();

        test8b.append("Mangosteen", 4);

        String expected = "{ Mangosteen } -> NULL";
        String actual =  test8b.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_insertBefore() {
        LinkedList test8 = new LinkedList();

        test8.insert("Apples", 1);
        test8.insert("Bananas", 2);
        test8.insert("Cantaloupe", 3);
        test8.insert("Peaches", 4);

        test8.insertBefore("Bananas", 5, "Mangosteen");

        String expected = "{ Peaches } -> { Cantaloupe } -> { Mangosteen } -> { Bananas } -> { Apples } -> NULL";
        String actual =  test8.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void test_LinkedList_insertAfter() {
        LinkedList test8 = new LinkedList();

        test8.insert("Apples", 1);
        test8.insert("Bananas", 2);
        test8.insert("Cantaloupe", 3);
        test8.insert("Peaches", 4);

        test8.insertAfter("Bananas", 5, "Mangosteen");

        String expected = "{ Peaches } -> { Cantaloupe } -> { Bananas } -> { Mangosteen } -> { Apples } -> NULL";
        String actual =  test8.toString();

        assertEquals(expected, actual);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_LinkedListKthOutOfBounds1() {
        LinkedList test9 = new LinkedList();

        test9.insert("Apples", 1);
        test9.insert("Bananas", 2);
        test9.insert("Cantaloupe", 3);
        test9.insert("Mangosteen", 4);
        test9.insert("Oranges", 5);
        test9.insert("Pears", 6);

        //System.out.println(test9.toString());

        System.out.println(test9.getKthFromEnd(7));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_LinkedListKthOutOfBounds2() {
        LinkedList test9 = new LinkedList();

        test9.insert("Apples", 1);
        test9.insert("Bananas", 2);
        test9.insert("Cantaloupe", 3);
        test9.insert("Mangosteen", 4);
        test9.insert("Oranges", 5);
        test9.insert("Pears", 6);

        //System.out.println(test9.toString());

        System.out.println(test9.getKthFromEnd(6));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void test_LinkedListKthOutOfBounds3() {
        LinkedList test9 = new LinkedList();

        test9.insert("Apples", 1);
        test9.insert("Bananas", 2);
        test9.insert("Cantaloupe", 3);
        test9.insert("Mangosteen", 4);
        test9.insert("Oranges", 5);
        test9.insert("Pears", 6);

        //System.out.println(test9.toString());

        System.out.println(test9.getKthFromEnd(-3));
    }

    @Test
    public void test_LinkedListKthOfListSize1() {
        LinkedList test9 = new LinkedList();

        test9.insert("Apples", 1);

        //System.out.println(test9.toString());

        System.out.println(test9.getKthFromEnd(0));
    }

    @Test
    public void test_LinkedListKthFromEndHappyPath() {
        LinkedList test9 = new LinkedList();

        test9.insert("Apples", 1);
        test9.insert("Bananas", 2);
        test9.insert("Cantaloupe", 3);
        test9.insert("Mangosteen", 4);
        test9.insert("Oranges", 5);
        test9.insert("Pears", 6);

        //System.out.println(test9.toString());

        System.out.println(test9.getKthFromEnd(3));
    }
}