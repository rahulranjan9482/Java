// Q:- Write a program to print M alphabet pattern programming logic.
public class Question21{
    public static void main(String[] args) {
        int n=7;
        for (int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if (j==0 ||j==n-1 || i==j && j<=n-4 || i+j==n-1 && j>=n-4) {
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
