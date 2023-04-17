package ProblemSet_17_April_2023;

public class GeneratingPerfectNum {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        int num=2;
        //loop for checking how many numbers are printed
        while (count<n){
            //loop for calculating the sum of all diviser
            int originalNum=num;
            int div=1,sum=0;
            while (div<num){
                if (num%div==0){
                    sum+=div;
                }
                div++;
            }
            //condition for checking the num and sum is equal or not and increase count
            if (originalNum==sum){
                System.out.print(originalNum+" ");
                count++;
            }
            //increasing the number by 1
            num++;
        }
    }
}
