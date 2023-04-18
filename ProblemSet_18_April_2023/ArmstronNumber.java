package ProblemSet_18_April_2023;
/*
This is same problem with problem set of 17 april, it just programmed using dowhile loop
 */
public class ArmstronNumber {
    public static void main(String[] args) {
        int n=407;
        int count1=0;
        int originalNum=n;
        //loop for counting the length of given number
        do {
            count1++;
            n/=10;
        }
        while (n>0);
        //loop exit here and new loop executing from here
        n=originalNum;
        int total=0;
        //loop for calculation the digit value
        do {
            int sum=1;
            int rem=n%10;
            int count=count1;
            //finding sum in do while
            do {
                sum*=rem;
                count--;
            }while (count>0);
            //adding sum into total
            total=sum+total;
            n/=10;
        }while (n>0);
        if (total==originalNum) System.out.println(total+" Is armstrong number");
        else System.out.println("The given number is not armstrong number");
    }
}
