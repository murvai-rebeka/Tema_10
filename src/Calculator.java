public class Calculator {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double divide(int a, double b) {
        return a / b;
    }

    public static double avg(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static double modulus(int a, int b) {
        return a % b;
    }

    public static double convertCelsiusFromFahrenheit(int f) {
        return 5 / 9.0 * (f - 32);
    }

    public static double convertMeterFromInch(double inch) {
        return inch / 39.37;
    }

    public static void calculateSpeed(int meter, int hour, int minutes, int seconds) {
        double sms = meter / seconds;
        System.out.println("M/s " + sms);
        double kmh = (meter / 1000.0) / hour;
        System.out.println("km/h " + kmh);
        double mh = (meter / 1609.0) / hour;
        System.out.println("m/h " + mh);

    }
}
