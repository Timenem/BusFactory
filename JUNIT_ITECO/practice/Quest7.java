package practice;

import java.util.*;

public class Quest7 {

    public static void main(String[] args) {
        Map<String, List<Integer>> students = new HashMap<>();
        students.put("bella", List.of(5, 5, 4));
        students.put("tina", List.of(4, 3, 5, 2));
        students.put("mila", List.of(2, 3, 3, 4, 3));
        students.put("vila", List.of());


        Iterator<Map.Entry<String, List<Integer>>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,List<Integer>> itr = iterator.next();
            System.out.println(itr.getKey()+"="+itr.getValue().stream().mapToInt(x ->Integer.parseInt(String.valueOf(x))).average());
        }
    }
}