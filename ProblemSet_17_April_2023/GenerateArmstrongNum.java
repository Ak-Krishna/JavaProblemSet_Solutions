package ProblemSet_17_April_2023;
//TODO:
public class GenerateArmstrongNum {
    public static void main(String[] args) {
        int num=1;
        int n=15;
        int numCount=0;
        int count=0,originalNum=num;
        //loop for counting length of num
        while (num>0){
            count++;
            num/=10;
        }
        num=originalNum;
        //loop for checking the number is armstrong or not
        while (numCount<n){
            int total=0;
            //loop for checking and power of the reminder
            while (num>0){
                int rem=num%10;
                int sum=1;
                //loop for adding rem into sum
                for (int i = 0; i < count; i++) {
                    sum=sum*rem;
                }
                total=total+sum;
                num/=10;
            }
            if (total==originalNum){
                System.out.println(originalNum+" ");
                numCount++;
            }
            num++;
        }
    }
}
