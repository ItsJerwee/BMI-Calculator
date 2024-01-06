import java.util.Scanner;

public class BMI_Calculator {
    public static void main (String [] args) {
        
        Scanner inputHeightOption = new Scanner (System.in);
        System.out.println("Enter option 1 2 or 3");
        System.out.println("(1) Height in feet\n" + "(2) Height in inches\n" + "(3) Height in centimeters");
        int heightOption = inputHeightOption.nextInt();
        
        Scanner inputWeightOption = new Scanner (System.in);
        System.out.println("Enter option 1 or 2");
        System.out.println("(1) Weight in kilogram\n" + "(2) Weight in pounds");
        int weightOption = inputWeightOption.nextInt();

        if (heightOption == 1 && weightOption == 1) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your height (ft): ");
            double height = input.nextDouble();
            System.out.print("Enter your height (in): ");
            double height2 = input.nextDouble();
            System.out.print("Enter your weight (kg): ");
            double weight = input.nextDouble();
            double inches = (height * 12) + height2;
            double m =  inches * 0.0254;
            double mSquared = Math.pow(m, 2);
            double BMI =  weight / mSquared;
            double roundedBMI = Math.round(BMI * 10.0) / 10.0;
            System.out.println("Your BMI: " + roundedBMI);
            if (roundedBMI < 18.5) {
                System.out.println("You are underweight");
            } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
                System.out.println("You are normal weight");
            } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }
       
        if (heightOption == 1 && weightOption == 2) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your height (ft): ");
            double height = input.nextDouble();
            System.out.print("Enter your height (in): ");
            double height2 = input.nextDouble();
            System.out.print("Enter your weight (lb): ");
            double weight = input.nextDouble();
            double kg = weight * 0.453592;
            double inches = (height * 12) + height2;
            double m =  inches * 0.0254;
            double mSquared = Math.pow(m, 2);
            double BMI =  kg / mSquared;
            double roundedBMI = Math.round(BMI * 10.0) / 10.0;
            System.out.println("Your BMI: " + roundedBMI);
            if (roundedBMI < 18.5) {
                System.out.println("You are underweight");
            } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
                System.out.println("You are normal weight");
            } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }
        
        if (heightOption == 2 && weightOption == 1) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your height (in): ");
            double height = input.nextDouble();
            System.out.print("Enter your weight (kg): ");
            double weight = input.nextDouble();
            double lb = weight * 2.20462;
            double inSquared = Math.pow(height, 2);
            double BMI = 703 * lb / inSquared;
            double roundedBMI = Math.round(BMI * 10.0) / 10.0;
            System.out.println("Your BMI: " + roundedBMI);
            if (roundedBMI < 18.5) {
                System.out.println("You are underweight");
            } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
                System.out.println("You are normal weight");
            } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }

        if (heightOption == 2 && weightOption == 2) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your height (in): ");
            double height = input.nextDouble();
            System.out.print("Enter your weight (lb): ");
            double weight = input.nextDouble();
            double lb = weight;
            double inSquared = Math.pow(height, 2);
            double BMI = 703 * lb / inSquared;
            double roundedBMI = Math.round(BMI * 10.0) / 10.0;
            System.out.println("Your BMI: " + roundedBMI);
            if (roundedBMI < 18.5) {
                System.out.println("You are underweight");
            } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
                System.out.println("You are normal weight");
            } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }

        if (heightOption == 3 && weightOption == 1) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your height (cm): ");
            double height = input.nextDouble();
            double in = height / 2.54;
            System.out.print("Enter your weight (kg): ");
            double weight = input.nextDouble();
            double lb = weight * 2.20462;
            double inSquared = Math.pow(in, 2);
            double BMI = 703 * lb / inSquared;
            double roundedBMI = Math.round(BMI * 10.0) / 10.0;
            System.out.println("Your BMI: " + roundedBMI);
            if (roundedBMI < 18.5) {
                System.out.println("You are underweight");
            } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
                System.out.println("You are normal weight");
            } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }
        
        if (heightOption == 3 && weightOption == 2) {
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your height (cm): ");
            double height = input.nextDouble();
            double in = height / 2.54;
            System.out.print("Enter your weight (lb): ");
            double weight = input.nextDouble();
            double lb = weight;
            double inSquared = Math.pow(in, 2);
            double BMI = 703 * lb / inSquared;
            double roundedBMI = Math.round(BMI * 10.0) / 10.0;
            System.out.println("Your BMI: " + roundedBMI);
            if (roundedBMI < 18.5) {
                System.out.println("You are underweight");
            } else if (roundedBMI >= 18.5 && roundedBMI <= 24.9) {
                System.out.println("You are normal weight");
            } else if (roundedBMI >= 25 && roundedBMI <= 29.9) {
                System.out.println("You are overweight");
            } else {
                System.out.println("You are obese");
            }
        }
    }
}