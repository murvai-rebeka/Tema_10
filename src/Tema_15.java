public class Tema_15 {
    public static void main(String args[]) {
        Read r = new Read();
        LogicalOp op = new LogicalOp();
        //ex1
        System.out.println("The entered int number is " + r.getInt());
        //ex2
        System.out.println("The entered float number is " + r.getFloat());
        System.out.println("The entered double number is " + r.getDouble());
        //ex 3
        int[] result3 = r.try_catch_ex3(3);
        op.printArray(result3);
        //ex 4
        System.out.println(r.try_catch_ex4());
        // ex 5
        int[] array = new int[]{1, 2, 6};
        op.try_catch_ex5(array, 8);
        //ex 6
        op.wait(5);
    }
}
