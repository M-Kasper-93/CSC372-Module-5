/*Purpose of ProductCalc class: to establish a recursive method that calculates the product of 5 numbers
 * Created by Megan Kasper, 16 December 2024
*/

import java.util.Scanner;
import java.util.ArrayList;

public class ProductCalc {
    public static void values(ArrayList<Integer> numbers) {
        int i;

        if (i == numbers.size()) {
            return 1;
        }
        else {
            return numbers.get(i) * values(numbers, i + 1);
        }
    }
public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Scanner scnr = new Scanner();
    int result;

    System.out.println("Enter first number: ");
    numbers.add(scnr.nextInt());
    System.out.println("Enter second number: ");
    numbers.add(scnr.nextInt);
    System.out.println("Enter third number: ");
    numbers.add(scnr.nextInt);
    System.out.println("Enter fourth number: ");
    numbers.add(scnr.nextInt);
    System.out.println("Enter fifth number: ");
    numbers.add(scnr.nextInt);
    
    result = values(numbers, 0);
    System.out.println("Product of these numbers = " + result);
}
}