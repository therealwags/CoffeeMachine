package machine;

import java.util.Scanner;

public class CoffeeMachine {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Greet();
        var cupsNeeded = scanner.nextInt();
        ShowIngredients(cupsNeeded);
    }

    private static void Greet() {
        System.out.println("Write how many cups of coffee you will need:");
    }

    private static void ShowIngredients(int cupsNeeded) {
        System.out.println("For " + cupsNeeded + " cups of coffee you will need:");
        System.out.println(CalculateWater(cupsNeeded) + " ml of water");
        System.out.println(CalculateMilk(cupsNeeded) + " ml of milk");
        System.out.println(CalculateBeans(cupsNeeded) + " g of coffee beans");
    }

    private static int CalculateWater(int cups) {
        return cups * 200;
    }

    private static int CalculateMilk(int cups) {
        return cups * 50;
    }

    private static int CalculateBeans(int cups) {
        return cups * 15;
    }
}
