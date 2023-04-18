package ProblemSet_14_April_2023;
/*
Printing the square start pattern with the length of 5 start in while loop and for loop
eg. * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 */
public class SquarePattern {
    public static void main(String[] args) {
        int n=5;
        int i=0;
        //loop for row printing, outer loop run for 5 row
        while (i<5){
            int j=0;
            //loop for column printing, inner loop also run with 5 column and each column contain star
            while (j<n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }

        //printing extra line for gap between two pattern either you can run upper or lower loop
        System.out.println("top pattern is for while loop and bottom pattern for for loop");

        //same pattern with for loop
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
