package project.pkg2;
import java.util.Scanner;


public class Project2 {

 
    public static void main(String[] args) {
        System.out.println("Enter minutes = ");
        Scanner sc = new Scanner(System.in);
        double min = sc.nextDouble();
        
        long years = (long) (min/(60*24*365));
        long days = (long) (min/60/24)%365;
        System.out.println(min+"is"+years+"years and "+days+"days");
        
    }
    
           
}
