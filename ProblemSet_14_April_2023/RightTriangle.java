package ProblemSet_14_April_2023;
/*
this is for right triangle using for loop for length of 5 start, here we initialize two variable for row amd column as i(row) and j(column)
e.g
         *
       * *
     * * *
   * * * *
 * * * * *

 */
public class RightTriangle {
    public static void main(String[] args) {
        int n=5;
        //outer loop run for count of row, it will run till row count
        for (int row = 0; row<n ; row++) {
            int spaces=n-1-row;                               //it will count how many spaces has to print in each column
            //this loop print spaces
            for (int space = 0; space < spaces; space++) {
                System.out.print("  ");                       // always remember you have to add two spaces
            }
            //this loop print the actual start for each column
            for (int column = 0; column <=row; column++) {
                System.out.print(" *");
            }
            //to move cursor in next line
            System.out.println();
        }
    }
}
