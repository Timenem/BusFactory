package practice;

public class Quest4 {
/**
 *на вход в функцию подается массив и число N.
 *Вернуть true, если в массиве есть любые 2 числа, сумма которых дает N.
 *В противном случае вернуть false [1, 2, 3], 5 ⇒ true[2, 3, 3], 4 ⇒ false
 *
 * @return*/

boolean sumRandomNum(int x , int [] arr){
    int i =0;
    int j = arr.length-1;
    while (i<j){
        if (arr[i]+arr[j]>x){
            j--;
            continue;
        }
        else if (arr[i]+arr[j]<x){
            i++;
            continue;
        }
        else { // arr[i]+arr[j]==x
            System.out.println(true);
            return true;
        }
    }
    System.out.println(false);
    return false;
}

    public static void main(String[] args) {

     Quest4 q = new Quest4();
     int [] arr = {1,2,3};
     q.sumRandomNum(5,arr);

    }

}
