

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 In a given text you need to sum the numbers while excluding any digits that form part of a word.
 The text consists of numbers, spaces and letters from the English alphabet.
 Input: A string.
 Output: An int.

 Example:
 sumNumbers('hi') == 0
 sumNumbers('who is 1st here') == 0
 sumNumbers('my numbers is 2') == 2
 sumNumbers('This picture is an oil on canvas '
 'painting by Danish artist Anna '
 'Petersen between 1845 and 1910 year') == 3755
 sumNumbers('5 plus 6 is') == 11
 sumNumbers('') == 0
 */


public class SumNum{
    public int  extractDigits(String src) {
        List<String> stringList = List.of(src.split(" "));
        String [] str = src.split("\\D+");
        List<String> ob = new ArrayList<>(Arrays.asList(str));
        int sum =0;
        for (int i = ob.size()-1; i >0;i--){
            sum +=Integer.parseInt(ob.get(i));
        }
        System.out.println(sum);
        return sum;
    }
}


