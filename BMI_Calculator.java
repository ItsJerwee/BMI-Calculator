import java.util.Scanner;

public class BMI_Calculator {
    public static void main (String [] args) {

        try (Scanner input = new Scanner(System.in)) {
            // Asks user for units in height & weight
            System.out.println("Enter option 1, 2, or 3");
            System.out.println("(1) Height in feet & inches\n(2) Height in inches\n(3) Height in centimeters");
            int heightOption = input.nextInt();

            // Validate weight option
            if (heightOption != 1 && heightOption != 2 && heightOption != 3) {
                System.out.println("Invalid option");
                return;
            }

            System.out.println("Enter option 1 or 2");
            System.out.println("(1) Weight in pounds\n(2) Weight in kilograms");
            int weightOption = input.nextInt();

            // Validate weight option
            if (weightOption != 1 && weightOption != 2) {
                System.out.println("Invalid option");
                return;
            }

            double heightFt, heightIn, heightInSquared, heightCm, weightLb, weightKg, BMI, roundedBMI;

            // Converting height to inches and weight to pounds
            switch (heightOption) {
                case 1:
                    System.out.print("Enter your height (ft): ");
                    heightFt = input.nextDouble();
                    System.out.print("Enter your height (in): ");
                    heightIn = input.nextDouble();
                    heightIn = heightFt * 12 + heightIn;
                    
                    switch (weightOption) {
                        case 1:
                            System.out.print("Enter your weight (lb): ");
                            weightLb = input.nextDouble();
                            heightInSquared = Math.pow(heightIn, 2);
                            break;
                        case 2:
                            System.out.print("Enter your weight (kg): ");
                            weightKg = input.nextDouble();
                            weightLb = weightKg * 2.20462;
                            heightInSquared = Math.pow(heightIn, 2);
                            break;
                        default:
                            return;
                        }
                    break;
                case 2:
                    System.out.print("Enter your height (in): ");
                    heightIn = input.nextDouble();
                    
                    switch (weightOption) {
                        case 1:
                            System.out.print("Enter your weight (lb): ");
                            weightLb = input.nextDouble();
                            heightInSquared = Math.pow(heightIn, 2);
                            break;
                        case 2: 
                            System.out.print("Enter your weight (kg): ");
                            weightKg = input.nextDouble();
                            weightLb = weightKg * 2.20462;
                            heightInSquared = Math.pow(heightIn, 2);
                            break;
                        default:
                            return;
                        }
                    break;
                case 3:
                    System.out.print("Enter your height (cm): ");
                    heightCm = input.nextDouble();
                    heightIn = heightCm / 2.54;

                    switch (weightOption) {
                        case 1:
                            System.out.print("Enter your weight (lb): ");
                            weightLb = input.nextDouble();
                            heightInSquared = Math.pow(heightIn, 2);
                            break;
                        case 2: 
                            System.out.print("Enter your weight (kg): ");
                            weightKg = input.nextDouble();
                            weightLb = weightKg * 2.20462;
                            heightInSquared = Math.pow(heightIn, 2);
                            break;
                        default:
                            return;
                        }
                    break;
                default:
                    return;
            }

            // Calculate and round BMI to one decimal place
            BMI = 703 * weightLb / heightInSquared; // BMI formula
            roundedBMI = Math.round(BMI * 10.0) / 10.0;

            // Output BMI and interpretation
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

        // Closes the scanner 
        } catch (Exception e) {
            
        }

    }
}