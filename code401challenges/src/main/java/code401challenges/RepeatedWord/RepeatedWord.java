package code401challenges.RepeatedWord;

import java.util.HashSet;

public class RepeatedWord {
    public String firstRepeatedWord(String book) {
        if (book.equals("") || book==null) {
            return book;
        } else {

            HashSet<String> wordSet = new HashSet<>();
            HashSet<Character> charsNotInWordsSet = new HashSet<>();
            charsNotInWordsSet.add(' ');
            charsNotInWordsSet.add('.');
            charsNotInWordsSet.add(',');
            charsNotInWordsSet.add(':');
            charsNotInWordsSet.add(';');
            charsNotInWordsSet.add('?');
            charsNotInWordsSet.add('!');
            charsNotInWordsSet.add('-');

            StringBuilder word = new StringBuilder();

            for (int i=0; i<book.length(); i++) {
                // if the current character is a character that belongs in a word, append it to word
                if (!charsNotInWordsSet.contains(book.charAt(i))) {
                    word.append(book.charAt(i));
                    // else check to see if the word is already in wordSet or add it, and reset word
                } else {
                    String lowCaseWord = word.toString().toLowerCase();
                    if ( wordSet.contains(lowCaseWord)) {
                        return lowCaseWord;
                        // make sure that empty words don't get added to wordSet
                    } else if (!lowCaseWord.equals("")) {
                        wordSet.add(lowCaseWord);
                        word.setLength(0);
                    }
                }
            }
        }
        return null;
    }
}
