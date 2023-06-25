// Q:- Write a java program to check whether java is installed on your computer.
public class Question65{
    public static void main(String[] args) {
        System.out.println("Java version : "+System.getProperty("java.version"));
        System.out.println("Java Runtime Version : "+System.getProperty("java.runtime.version"));
        System.out.println("Java Home : "+System.getProperty("java.home"));
        System.out.println("Java vendor : "+System.getProperty("java.vendor"));
        System.out.println("Java vendor URL: "+System.getProperty("java.vendor.url"));
    }
}