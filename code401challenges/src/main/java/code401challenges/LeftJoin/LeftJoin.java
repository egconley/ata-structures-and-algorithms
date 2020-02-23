package code401challenges.LeftJoin;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class LeftJoin {

    public String[][] leftJoin(Hashtable ht1, Hashtable ht2) {

        Set keySet1 = ht1.keySet();
        String[][] answer = new String[keySet1.size()][3];
        int i=0;
        for (Object key : keySet1) {
            answer[i][0] = key.toString();
            answer[i][1] = ht1.get(key).toString();
            if ( ht2.containsKey(key) ) {
                answer[i][2] = ht2.get(key).toString();
            } else {
                answer[i][2] = null;
            }
            i++;
        }
        return answer;
    }
}
