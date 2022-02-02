package practice;

public class Quest1 {
    /**посчитать количество пробелов в строке**/
    int spaceNums(String string){
        int spaceCounter =0;
        for (int i = 0; i < string.length(); i++) {
            if( string.charAt(i) == ' '){
                spaceCounter++;
            }
        }
        System.out.println(spaceCounter);
        return spaceCounter;
    }


    public static void main(String[] args) {
        Quest1 spaces = new Quest1();
        spaces.spaceNums("some str wit лда");
    }
}
