package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter<Animal> testShelter;
    Cat hannah;
    Dog bruno;
    Dog hulk;
    Cat silvia;
    Cat shakira;

    @Before
    public void setUp() throws Exception {
        testShelter = new AnimalShelter<>();
        hannah = new Cat("Hannah");
        bruno = new Dog("Bruno");
        hulk = new Dog("Hulk");
        silvia = new Cat("Silvia");
        shakira = new Cat("Shakira");
    }

    @Test
    public void shelterEnqueue() {
        testShelter.shelterEnqueue(hannah);
        testShelter.shelterEnqueue(bruno);
        Animal rescue = testShelter.shelterDequeue("cat");
        assertEquals("Hannah", rescue.name);

        rescue = testShelter.shelterDequeue("dog");
        assertEquals("Bruno", rescue.name);
    }

    @Test
    public void shelterDequeue() {
        testShelter.shelterEnqueue(silvia);
        testShelter.shelterEnqueue(shakira);
        testShelter.shelterEnqueue(hulk);

        Animal rescue = testShelter.shelterDequeue("dog");

        assertEquals("Hulk", rescue.name);
    }

    @Test
    public void shelterDequeue_nullPref() {
        testShelter.shelterEnqueue(silvia);
        testShelter.shelterEnqueue(shakira);
        testShelter.shelterEnqueue(hulk);

        Animal rescue = testShelter.shelterDequeue("fish");

        assertEquals(null, rescue);
    }
}