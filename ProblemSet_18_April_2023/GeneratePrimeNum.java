package ProblemSet_18_April_2023;
/*
This is same problem with problem set of 17 april, it just programmed using dowhile loop
 */
public class GeneratePrimeNum {
    public static void main(String[] args) {
        int n=2;
        int count=10;
        int counter=0;// which increase only if the element is printed
        //loop for counting how many Numbers are printed
        do {
            int div=2;
            boolean flag=false;
            //loop for checking the number is divided by div or not
            do {
                if (div < n)
                    if (n % div == 0) {
                        flag = true;
                        break;
                    }
                div++;
            } while (div < n);
            //if the number is totally divided by div then flag become true and if condition do satisfy
            if (!flag){
                System.out.print(n+" ");
                counter++;
            }
            n++;
        }while (counter<count);
    }
}
