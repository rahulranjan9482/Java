// Q:- Write a java program to print odd numbers from 1 to 99 .Prints one number per line.
public class Question82 {
    public static void main(String[] args) {
        for(int i=1 ;i<=99;i++){
            if(i%2 != 0){
                 System.out.print(i);
                 System.out.print(" ");
            }
        }
    }
}
