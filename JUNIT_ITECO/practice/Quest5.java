package practice;

import java.util.*;
import java.util.stream.Collectors;

public class Quest5 {
    void showBestStudent(Map<String,Double> map){
        List<Map.Entry<String, Double>> x = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());
        System.out.println(x.get(x.size()-1));
    }

    public static void main(String[] args) {
        Quest5 q = new Quest5();
        Map<String,Double> st =new HashMap<>();
        st.put("tom",3.3);
        st.put("don",4.3);
        st.put("mc",5.0);
        st.put("kim",2.4);
        st.put("jilian",3.9);
        st.put("bill",4.2);

        q.showBestStudent(st);
    }
}