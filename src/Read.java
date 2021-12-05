import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    public int getInt() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value!");
            } catch (Exception ex) {
                System.out.println("Unhandled exception!");
            }
        } while (true);
    }

    public float getFloat() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Enter a float number: ");
                return scan.nextFloat();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value!");
            } catch (Exception ex) {
                System.out.println("Unhandled exception!");
            }
        } while (true);
    }

    public double getDouble() {
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Enter a double number: ");
                return scan.nextDouble();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value!");
            } catch (Exception ex) {
                System.out.println("Unhandled exception!");
            }
        } while (true);
    }

    public int[] try_catch_ex3(int count) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = getInt();
        }
        return array;
    }

    public List<Integer> try_catch_ex4() {
        List<Integer> items = new ArrayList<>();
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Enter a number: ");
                items.add(scan.nextInt());
            } catch (InputMismatchException error) {
                return items;
            } catch (Exception ex) {
                return items;
            }
        } while (true);
    }
}
