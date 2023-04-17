package ProblemSet_17_April_2023;
/*
generating the prime number till the given range
 */
public class GeneratePrimeNumber {
    public static void main(String[] args) {
        int n=50;
        int count=0;
        int num=2;
        //condition for the range
        if (n<0){
            System.out.println("Enter positive Range");
            return;
        }
        //outer loop for counting how much numbers are printed
        while (count<n){
            int div=2;
            int divCount=0;
            //inner loop for checking the number is prime or not
            while (div<num){
                if (num%div==0){
                    divCount++;break;
                }
                div++;
            }
            //condition for checking the and printing the number
            if (divCount==0){
                System.out.print(num+" ");
                count++;
            }
            //increase number by 1
            num++;
        }
    }
}
