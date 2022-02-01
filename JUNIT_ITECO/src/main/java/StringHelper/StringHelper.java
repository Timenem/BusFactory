package StringHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringHelper {
    private String string;

    public StringHelper(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringHelper{" +
                "string='" + string + '\'' +
                '}';
    }

    public int getWordsCount() {
        String withoutNums = string.replaceAll("\\d", "");
        List<String> strings = Arrays.asList(withoutNums.split(" "));
        System.out.println(strings.size());
        System.out.println(strings);
    return strings.size();
    }

   public String cut() {
    /**обрезает строку*/
        String str;
            String stripString = string.substring(0, 97);
            char[] characters = stripString.toCharArray();
            int len = characters.length;
            while (len != 0) {
                len -= 1;
                if (characters[len] == ' ') {
                    break;
                }
            }
            str = stripString.substring(0, len) + "...";
            return str;
    }


    public String find(int index , String str){
    /**Ищет подстроку str начиная с index.
     * Если str найдена после index, то вернуть строку начиная от позиции вхождения str.
     * Если нет то вернется исходная строка.
     * */
        int startWithStrIndex ;
        int findStringIndex = string.indexOf(str);
        if (index < findStringIndex){
           startWithStrIndex = string.indexOf(str);
            System.out.println(string.substring(startWithStrIndex));
           return string.substring(startWithStrIndex);
        } else {
            System.out.println(string);
            return string;
        }
    }

    public int getFirstNumber() {
        List<Character> characters = new ArrayList<>();
        char[] chars = string.toCharArray();
        for (char aChar : chars) {
            if (aChar >= 48 && aChar <= 57)
                characters.add(aChar);
        }
        if (characters.size() != 0){
            System.out.println(Integer.parseInt(String.valueOf(characters.get(0))));
            return Integer.parseInt(String.valueOf(characters.get(0)));
        }else {
            throw new RuntimeException("невозможно найти число в строке");
        }
    }

}



