package Q_01;

import java.util.Scanner;

public class D {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);

        System.out.println("Enter value for r");
    double r= input.nextDouble();

    double result=Math.PI*Math.pow(r,2);
        System.out.println(result);
        input.close();
}
}
