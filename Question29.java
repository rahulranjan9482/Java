// Q:- Write a program t0 print U alphabet pattern programming logic.
public class Question29{
    public static void main(String[] args) {
        int n=7;
        for (int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if (j==0 && i<n-1 || i==n-1 && j>0 && j<n-1 || j==n-1 && i<n-1) {
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


