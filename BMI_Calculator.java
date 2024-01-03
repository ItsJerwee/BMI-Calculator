import java.util.Scanner;

public class BMI_Calculator {
    public static void main (String [] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Enter your height (feet): ");
        double height = input.nextDouble();
        System.out.print("Enter your height (inches): ");
        double height2 = input.nextDouble();
        System.out.print("Enteryour weight (pounds): ");
        double weight = input.nextDouble();
        double kg = weight * 0.453592;
        double inches = (height * 12) + height2;
        double m =  inches * 0.0254;
        double mSquared = Math.pow(m, 2);
        double BMI =  kg / mSquared;
        double roundedBMI = Math.round(BMI * 10.0) / 10.0;
        System.out.println("Your BMI: " +roundedBMI);
        if (roundedBMI < 18.5) {
            System.out.println("You are underweight");
        } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
            System.out.println("You are normal weight");
        } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
            System.out.println("You are overweight");
        } else {
            System.out.println("You are obese");
        }

        input.close();
        
    }
}