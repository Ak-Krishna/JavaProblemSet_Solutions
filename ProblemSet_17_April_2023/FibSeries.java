package ProblemSet_17_April_2023;
/*
Fibonacci series is the series where the next number is the sum of previous two number
e.g --> 0,1,1,2,3,5,8,13, .......

 */
public class FibSeries {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10,i=1;
        //if the starting number are less than 0 then break the program
        if (b<0&&a<0){
            System.out.println("Enter positive numbers");
        }
        //calculating the numbers and printing the series
        while(i<=n){
            System.out.print(a+" ");
            //add two numbers
            int c=a+b;
            //swap two numbers
            a=b;
            b=c;
            //increment i by 1
            i++;
        }
    }
}
