public class LogicalOperation {
    public static void printLogicalTest(String text) {
        if (text.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        } else {
            System.out.println("Got to try some more");
        }
    }

    public static void exercise3(int number) {
        if (number >= 2 && number <= 8) {
            System.out.println(number);
        }
    }

    public static void exercise5(int number) {
        if (number >= 8 || number == 6) {
            System.out.println("The amount of snow this winter was(cm):" + number);
        } else {
            System.out.println("The forecast snow is(cm)" + number);
        }

    }

    public static void PareNumber(int number) {
        if (number % 2 == 0)
            System.out.println("PareNumber");
        else {
            System.out.println("NotPareNumber");
        }
    }
    public static void NegativeNumber(int number){
        if (number < 0)
        System.out.println("NegativeNumber");
        else {
            System.out.println("PositiveNumber");
        }

    }
    public static void CompareNumber(int a, int b){
        if (a > b)
            System.out.println(a);
        else {
            System.out.println(b);
        }
    }

    public static void PowNumber(int number){
        int a = number*number;
        System.out.println(a);
    }

    public static void KisebbEgyenlo(int number){
        if (number < 100)
            System.out.println("kisebb "+number);
        else {
            System.out.println("nagyobb "+number);
        }



    }

}
