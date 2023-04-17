package ProblemSet_17_April_2023;
/*
if the number is divided by the 1 and number itself only the the number is prime number
e.g 2,3,5,7,9,11,13,17,19 --> the given numbers are only divided by 1 and itself

 */
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 22, div = 2;
        int count = 0;
        while (div < num) {
            if (num % div == 0) {
                //if num is totally divide by div then it will increase count by 1 and break the loop
                count++;
                break;
            }
            //increase div by 1
            div++;
        }
        //if count is zero then it will go in if condition
        if (count == 0) {
            System.out.println(num + " is prime number");
        } else System.out.println("Number is not prime number");
    }
}
