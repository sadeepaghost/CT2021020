package Q_01;
import java.util.Scanner;
public class A {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter value for A=");
        double A=scanner.nextDouble();

        System.out.println("Enter value for B=");
        double B=scanner.nextDouble();
        System.out.println("Enter value for C=");
        double C=scanner.nextDouble();

        double result=Math.sqrt(B*B+ 4*A*C);
        System.out.println(result);
        scanner.close();

    }
}
