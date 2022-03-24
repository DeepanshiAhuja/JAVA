import java.util.Scanner;
import java.lang.Math;

public class quadratic {

    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a:");
        float a= sc.nextFloat();
       
       
        System.out.println("Enter b:");
        float b= sc.nextFloat();
        
        
        System.out.println("Enter c:");
        float c= sc.nextFloat();

        sc.close();
        
        double D = b * b - 4 * a * c;
        double Dsqrt ,x1 ,x2 ;
        Dsqrt = Math.sqrt(D);

        if (D>0){
            x1=(-b+Dsqrt)/2*a;
            x2=(-b-Dsqrt)/2*a;
            System.out.println("roots x1 and x2 are:" + x1 + x2);


        }

        else if(D==0){
            x1=-b/2*a;
            x2=-b/2*a;

            System.out.println("roots x1 and x2 are: " + x1 + x2);

        }
        else{
            System.out.println("equation has no real roots");

        }




    }
    
}
