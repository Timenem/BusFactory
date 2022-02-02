package practice;

import java.util.Arrays;
import java.util.List;

public class Quest3 {
    boolean showLenArray(int x, List<List<Integer>> arrayLists) {

        StringBuilder s = new StringBuilder(new String());
        for (int i = 0; i < arrayLists.size(); i++) {
            s.append(arrayLists.get(i).size());
        }
        int listLen = Integer.parseInt(s.toString());
        if (x == listLen){
            System.out.println(x + "==" + listLen);
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> myList = Arrays.asList(
                Arrays.asList(1,1,1, 2, 3),
                Arrays.asList(5, 6, 8, 2, 8));
        Quest3 q = new Quest3();
        q.showLenArray(55,myList);
    }
}