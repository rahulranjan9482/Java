// Q:- Write a program t0 print V alphabet pattern programming logic.
public class Question30{
    public static void main(String[] args) {
        int n=7;
        for (int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if (i+j ==n-1 && j>n-5 || i==j && j<(n-1)/2) {
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


