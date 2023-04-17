package ProblemSet_17_April_2023;
/*
The number sequence where the difference between two number is increase by the index or increase by 10,
initial diff is 2.
e.g --> 1,3,15,37,69,111,163
 */
public class NumberSequence1 {
    public static void main(String[] args) {
        int a=1;
        int diff=2;
        int n=7,i=0;

        while ( i<n){
            System.out.print(a+" ");
            a+=diff;
            diff+=10;
            i++;
        }
    }
}
