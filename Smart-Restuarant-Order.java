import java.util.Scanner;

public class Smart_Restaurant_Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double DRINK_PRICE = 15.50;[span_0](start_span)[span_0](end_span)

        System.out.print("Enter customer's name: ");[span_1](start_span)[span_1](end_span)
        String customerName = scanner.nextLine();

        System.out.print("Enter customer's age: ");[span_2](start_span)[span_2](end_span)
        int age = scanner.nextInt();

        System.out.print("Enter price of the meal: ");[span_3](start_span)[span_3](end_span)
        double mealPrice = scanner.nextDouble();

        System.out.print("Enter number of drinks ordered: ");[span_4](start_span)[span_4](end_span)
        int numberOfDrinks = scanner.nextInt();

        System.out.print("Is the customer a student? (true/false): ");[span_5](start_span)[span_5](end_span)
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Enter service rating from 1 to 5: ");[span_6](start_span)[span_6](end_span)
        int serviceRating = scanner.nextInt();

        if (serviceRating < 1 || serviceRating > 5) {
            System.out.println("Error: Service rating must be between 1 and 5!");[span_7](start_span)[span_7](end_span)
            scanner.close();
            return;
        }

        double drinksCost = numberOfDrinks * DRINK_PRICE;[span_8](start_span)[span_8](end_span)
        double subtotal = mealPrice + drinksCost;[span_9](start_span)[span_9](end_span)

        double discountPercentage = 0.0;
        
        boolean studentDiscountApplies = isStudent;[span_10](start_span)[span_10](end_span)
        boolean seniorDiscountApplies = (age >= 60);[span_11](start_span)[span_11](end_span)

        if (studentDiscountApplies && seniorDiscountApplies) {
            discountPercentage = 0.10;[span_12](start_span)[span_12](end_span)
        } else if (studentDiscountApplies) {
            discountPercentage = 0.10;[span_13](start_span)[span_13](end_span)
        } else if (seniorDiscountApplies) {
            discountPercentage = 0.05;[span_14](start_span)[span_14](end_span)
        }

        double discountAmount = subtotal * discountPercentage;[span_15](start_span)[span_15](end_span)
        double priceAfterDiscount = subtotal - discountAmount;

        double tipAmount = 0.0;
        if (serviceRating == 4 || serviceRating == 5) {
            tipAmount = priceAfterDiscount * 0.10;[span_16](start_span)[span_16](end_span)
        }

        double finalBill = priceAfterDiscount + tipAmount;[span_17](start_span)[span_17](end_span)

        int wholeAmount = (int) finalBill;[span_18](start_span)[span_18](end_span)

        System.out.println("\n================================");
        System.out.println("        SMART RESTAURANT        ");[span_19](start_span)[span_19](end_span)
        System.out.println("================================");
        System.out.println("Customer: " + customerName);[span_20](start_span)[span_20](end_span)
        System.out.println("Meal: $" + mealPrice);[span_21](start_span)[span_21](end_span)
        System.out.println("Drinks: $" + drinksCost);[span_22](start_span)[span_22](end_span)
        System.out.println("Discount: $" + discountAmount);[span_23](start_span)[span_23](end_span)
        System.out.println("Tip: $" + tipAmount);[span_24](start_span)[span_24](end_span)
        System.out.println("Final bill: $" + finalBill);[span_25](start_span)[span_25](end_span)
        System.out.println("Whole amount: $" + wholeAmount);[span_26](start_span)[span_26](end_span)
        System.out.println("================================");

        scanner.close();
    }
}