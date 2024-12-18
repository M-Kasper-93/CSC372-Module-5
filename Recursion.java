/*Purpose of ProductCalc class: to establish a recursive method that calculates the product of 5 numbers
 * Created by Megan Kasper, 17 December 2024
*/

import java.util.Scanner;
import java.util.ArrayList;

public class ProductCalc {
    
    public static int values(ArrayList<Integer> numbers, int i) {
        // base case
        if (i == numbers.size()) {
            return 1; 
        } 
        // recursive case
        else {
            return numbers.get(i) * values(numbers, i + 1); 
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scnr = new Scanner(System.in); 
        int result;

        // get numbers from user and add to numbers ArrayList
        System.out.println("Enter first number: ");
        numbers.add(scnr.nextInt());
        System.out.println("Enter second number: ");
        numbers.add(scnr.nextInt());
        System.out.println("Enter third number: ");
        numbers.add(scnr.nextInt());
        System.out.println("Enter fourth number: ");
        numbers.add(scnr.nextInt());
        System.out.println("Enter fifth number: ");
        numbers.add(scnr.nextInt());

        // call recursive method to calculate product
        result = values(numbers, 0);
        System.out.println("Product of these numbers = " + result);
    }
}
