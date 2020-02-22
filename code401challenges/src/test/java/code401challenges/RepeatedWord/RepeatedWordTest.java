package code401challenges.RepeatedWord;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    RepeatedWord test = new RepeatedWord();

    String testBook1;
    String testBook2;
    String testBook3;

    @Before
    public void setup() {
        testBook1 = "Once upon a time, there was a brave princess who...";
        testBook2 = "t was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        testBook3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
    }

    @Test
    public void firstRepeatedWord_test1() {
        assertEquals("a", test.firstRepeatedWord(testBook1));
    }

    @Test
    public void firstRepeatedWord_test2() {
        assertEquals("was", test.firstRepeatedWord(testBook2));
    }

    @Test
    public void firstRepeatedWord_test3() {
        assertEquals("summer", test.firstRepeatedWord(testBook3));
    }
}