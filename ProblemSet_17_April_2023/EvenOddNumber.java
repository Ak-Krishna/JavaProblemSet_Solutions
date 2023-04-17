package ProblemSet_17_April_2023;
/*
number which divided by 2 then the number is called even number
vise varsa
 */
public class EvenOddNumber {
    public static void main(String[] args) {
        int n=10;
        int evenCount=0,oddCount=0;
        int num=1;
        //loop for calculating how many even and odd numbers are printed
        while (evenCount<n){
            if (num%2==0){
                System.out.print(num+" ");
                evenCount++;
            }
//            System.out.println();
//            if (num%2!=0) {
//                System.out.print(num + " ");
//                oddCount++;
//            }
            num++;
        }
    }
}
