public class Tema11 {
    public static void main(String args[]) {
        LogicalOp op = new LogicalOp();

        //Exercise 3
        int biggest = op.checkBiggerNumber(2, 3);
        System.out.println("The bigger number is:" + biggest);


        //Exercise 4
        String execise4result = op.exercise4("FastTrackIT");
        System.out.println(execise4result);
        execise4result = op.exercise4("Example");
        System.out.println(execise4result);


        //Exercise 5
        String exercise5 = op.exercise5("FastTrackIT", 2);
        System.out.println(exercise5);
        exercise5 = op.exercise5("Text", 6);
        System.out.println(exercise5);


        //Exercise 6
        String exercise6 = op.exercise6(10);
        System.out.println(exercise6);
        exercise6 = op.exercise6(5);
        System.out.println(exercise6);


        //Execise 7
        String exercise7 = op.exercise7(6);
        System.out.println(exercise7);


        //Exercise 8
        op.exercise8(9);

        //Exercise 9
        boolean exercise9 = op.isNumberEven(4);
        System.out.println("This number is pair: " + exercise9);

        //Exercise 10
        boolean exercise10 = op.isEligibleToVote(18);
        System.out.println("This person has the right to vote: " + exercise10);

        //Exercise 11
        int exercise11 = op.biggerNumber(10, 8, 6);
        System.out.println("The bigger number is: " + exercise11);


    }
}
