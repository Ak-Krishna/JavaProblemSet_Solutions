package ProblemSet_14_April_2023;
/*
this is for left triangle using for loop for length of 5 start, here we initialize two variable for row amd column as i(row) and j(column)
e.g
    *
    * *
    * * *
    * * * *
    * * * * *
 */
public class LeftTriangle {
    public static void main(String[] args) {
        int n=5;
        //outer loop for row printing i.e outer loop run 5 times cause row count is 5
        for (int row = 0; row < 5; row++) {
            //inner loop for column printing i.e inner loop run till row is less than equal two column for each iteration
            for (int column = 0; column <= row; column++) {
                System.out.print("* ");
            }
            //two bring cursor in next line
            System.out.println();
        }
    }
}
