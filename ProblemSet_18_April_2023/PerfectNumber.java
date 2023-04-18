package ProblemSet_18_April_2023;
/*
This is same problem with problem set of 17 april, it just programmed using do while loop
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int n=28;
        int originalNum=n;
        int div=1;
        int sum=0;
        //loop for adding all diviser into sum
        do {
            if (n%div==0){
                sum+=div;
            }
            div++;
        }while (div<n);
        if (sum==originalNum) System.out.println(sum+" is perfect number");
        else System.out.println("The given number is not perfect number");
    }
}
