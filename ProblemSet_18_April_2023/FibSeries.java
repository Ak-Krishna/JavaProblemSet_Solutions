package ProblemSet_18_April_2023;
/*
This is same problem with problem set of 17 april, it just programmed using do while loop
 */

public class FibSeries {
    public static void main(String[] args) {
        int a=0,b=1,sum;
        int count=0,n=10;

        //printing the series till the nth number
        do {
            System.out.print(a+" ");
            sum=a+b;
            //swap numbers
            a=b;
            b=sum;
            count++;
        }while (count<n);

    }
}
