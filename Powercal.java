import java.util.*;
public class Powercal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter value for base: ");
            double base=sc.nextDouble();
            System.out.println("Enter value for power: ");
            double power=sc.nextDouble();
            double result=Math.pow(base, power);
      System.out.println("The exponentiation for given values is: "+result);
            sc.close();
        }
    }
}

