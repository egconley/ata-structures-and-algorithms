package code401challenges.utilities;

import java.util.HashMap;
import java.util.LinkedList;

public class MultiBracketValidation {

    // https://github.com/codefellows/seattle-java-401d9/blob/master/class-14/brackets/Brackets.java
    private static HashMap<Character, Character> bracketMap;
    static {
        bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');
        bracketMap.put('<', '>');
    }

    public static boolean validate(String brackets) {

        boolean isBalanced = false;
        LinkedList<Character> bracketStack = new LinkedList<>();

        for(int i = 0; i < brackets.length(); i++) {

            char current = brackets.charAt(i);

            // handle opening brackets
            if (bracketMap.containsKey(current)) {

                bracketStack.push(current);

            // handle closing brackets
            } else if (bracketMap.containsValue(current)) {

                if (!bracketStack.isEmpty()) {

                    char openBracket = bracketStack.pop();

                    if (current == bracketMap.get(openBracket).charValue()) {
                        isBalanced = true;
                    } else {
                        isBalanced = false;
                    }
                }
            }
        }
        return isBalanced;
    }
}
