package Trecias;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
 Your application should read two variables: weight (in kilograms, type float)
  and height (in centimeters, type int).
  BMI should be calculated given following formula: BMI = weight / height * height.
  The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal values.
  Your program should write "BMI optimal" or "BMI not optimal", according to the assumptions above
 */
public class TreciasMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("weight in kg");
        Float weight= scanner.nextFloat();
        System.out.println("height in cm");
        int height = scanner.nextInt();
        Double BMI = weight / ((height*0.01) * (height*0.01));
        System.out.println(BMI);

        if (BMI> 18.5 || BMI < 24.9){
            System.out.println("BMI not optimal");
        } else
            System.out.println("BMI  optimal");

    }
}
