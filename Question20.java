// Q:- Write a program to print L alphabets pattern programming.
public class Question20 {
    public static void main(String[] args) {
        int n = 7;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j==0 || i==n-1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


