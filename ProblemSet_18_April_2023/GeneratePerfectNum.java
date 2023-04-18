package ProblemSet_18_April_2023;
/*
This is same problem with problem set of 17 april, it just programmed using do while loop
 */
public class GeneratePerfectNum {
    public static void main(String[] args) {
        int num=2;
        int count=4,counter=0;
        //loop for counting how many numbers are printed
        do {
            int originalNum=num;
            int div=1;
            int sum=0;
            //loop for adding all divider into sum
            do {
                if (num % div == 0) {
                    sum += div;
                }
                div++;
            } while (div < num);
            //checking for if the given num and sum is equal or not
            if (originalNum==sum){
                System.out.print(originalNum+" ");
                counter++;
            }
            num++;

        }while (counter<count);
    }
}
