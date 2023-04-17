package ProblemSet_17_April_2023;

/*
if the sum of all diviser of the given number is equal to the number then the number is perfect number
e.g -->
num=28;
28 is divide by 1,2,4,7,14 then
1+2+4+7+14==num i.e 28
 */

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 12, sum = 0;
        int i = 1;
        int originalNum = num;
        //loop for calculating the sum of all diviser
        while (i < num) {
            if (num % i == 0) {
                sum += i;
            }
            i++;
        }
        //condition for checking the number is equal to originalNum or not
        if (originalNum == sum) {
            System.out.println(sum + " is perfect Number");
        } else System.out.println("Number is not perfect number");
    }
}
