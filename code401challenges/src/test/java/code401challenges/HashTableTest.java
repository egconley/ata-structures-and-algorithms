package code401challenges;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    HashTable testHashTable = new HashTable(10);

    @Before
    public void setup() {

    }

    @Test
    public void put() {
        testHashTable.put("five", 5);
        assertEquals(5,testHashTable.get("five"));
    }

    @Test
    public void get_keyNotInTable() {
        testHashTable.put("six", 6);
        assertEquals(null, testHashTable.get("five"));
    }

    @Test
    public void get_collision() {
        int count = 0;
        testHashTable.put("count", ++count);
        testHashTable.put("count", ++count);
        testHashTable.put("count", ++count);
        assertEquals(3, testHashTable.get("count"));
    }

    @Test
    public void containsKey() {
        testHashTable.put("ellen", 33);
        testHashTable.put("luis", 37);
        assertTrue(testHashTable.containsKey("luis"));
    }

    @Test
    public void hash() {
        testHashTable.put("ellen", 33);
        testHashTable.put("luis", 37);
        testHashTable.put("hanna", 12);
        testHashTable.put("silvia", 12);
        assertTrue(testHashTable.hash("silvia") < 10);
    }
}