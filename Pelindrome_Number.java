public class Pelindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    static public boolean isPalindrome(int x) {
        int temp=0;
        int num=x;
        while(x>0){
            int rem=x%10;
            temp=(temp*10)+rem;
            x=x/10;
        }
        return temp==num;
    }
}
