// Q:- Write a java program to swap two variables.
public class Question49 {
    public static void main(String[] args) {
        int a = 24;
        int b = 42;
        int swap ;
        swap = a;
        a=b;
        b=swap;
        System.out.println("before swaping first number : "+a);
        System.out.println("before swaping second number : "+b);
         swap = a;
        a=b;
        b=swap;
        System.out.println("after swaping first numner : "+a);
        System.out.println("after swaping second numbers: "+b);
    }
}
