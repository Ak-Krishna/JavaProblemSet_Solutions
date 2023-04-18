package ProblemSet_18_April_2023;
/*
This is same problem with problem set of 17 april, it just programmed using dowhile loop
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int n=5;
        int div=2;
        boolean flag=false;
        //loop for checking the number is divided by div or not
        do {
            if (div<n)
            if (n%div==0){
                flag=true;
                break;
            }
            div++;
        }while (div<n);
        //if the number is totally divided by div then flag become true;
        if (flag) System.out.println("Number is not prime number");
        else System.out.println("Number is prime number");
    }
}
