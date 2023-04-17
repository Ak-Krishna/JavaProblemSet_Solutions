package ProblemSet_17_April_2023;
/*
if the given number is equal to the sum of power of digit then the number is armstrong number
e.g -->
num=153 --> (1^3+5^3+3^3)=num i.e 153
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=370;
        int originalNum=num;
        int count=0;
        //if the number is less than 0 then break the program
        if (num<0){
            System.out.println("Enter positive number");
            return;
        }
        //loop for counting the length of given number
        while (num>0){
            count++;
            num/=10;
        }
        num=originalNum;
        int total=0;
        //loop for adding the digit power
        while (num>0){
            int rem=num%10;
            int sum=1;
            //loop for power of digit(rem)
            for (int i = 0; i < count; i++) {
                sum=sum*rem;
            }
            //adding sum into total
            total=total+sum;
            num=num/10;
        }
        //checking for the condition
        if(originalNum==total){
            System.out.println(total+ " is armstrong number");
        }else System.out.println("Number is not armstrong number");
    }
}
