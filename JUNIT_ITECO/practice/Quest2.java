package practice;

public class Quest2 {
    public static void main(String[] args) {
        Quest2 si = new Quest2();
        si.simpleNums(100);
    }
    void simpleNums(int x){
        int i;
        boolean isPrime = true;

        String simpleNumber = "";

        for (i = 1; i <= x; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                simpleNumber = simpleNumber + i + " ";
            }
        }
        System.out.println(simpleNumber);
    }
    public static boolean CheckPrime(int x) {
        int remainder;
        for (int i = 2; i <= x / 2; i++) {
            remainder = x % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
    }
}

