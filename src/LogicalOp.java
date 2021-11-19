import java.util.Arrays;

public class LogicalOp {
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String exercise4(String text) {
        if (text.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    public String exercise5(String text, int number) {
        if (text.equals("FastTrackIT") && number <= 3) {
            return text + number;
        } else {
            if (text.equals("FastTrackIT") == false && number >= 4)
                return number + text;
        }
        return "";
    }

    public String exercise6(int number) {
        if (number > 8 || number == 6)
            return "The amount of snow this winter was(cm): " + number;
        else {
            return "The forecast snow is(cm):" + number;
        }
    }

    public String exercise7(int number) {
        if (number > 3 && number != 4)
            return "The number is greater than 3 and not equal to 4";
        if (number == 4)
            return "The number is equal to 4";
        if (number < 3)
            return "The number is lower than 3";
        return "The number is equal to 3";
    }

    public void exercise8(int number) {
        switch (number) {
            case 0:
                System.out.println("The number is:  0!");
                break;
            case 1:
                System.out.println("The number is:  1!");
                break;
            case 2:
                System.out.println("The number is:  2!");
                break;
            case 3:
                System.out.println("The number is:  3!");
                break;
            case 4:
                System.out.println("The number is:  4!");
                break;
            case 5:
                System.out.println("The number is:  5!");
                break;
            case 6:
                System.out.println("The number is:  6!");
                break;
            case 7:
                System.out.println("The number is:  7!");
                break;
            case 8:
                System.out.println("The number is:  8!");
                break;
            case 9:
                System.out.println("The number is:  9!");
                break;
            default:
                System.out.println("The number is:" + number);


        }
    }

    public boolean isNumberEven(int number) {
        if (number % 2 == 0)
            return true;
        else {
            return false;
        }
    }

    public boolean isEligibleToVote(int number) {
        if (number >= 18)
            return true;
        else {
            return false;
        }
    }

    public int biggerNumber(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        if (b > a && b > c)
            return b;
        else
            return c;

    }

    public void loopEx1(int number) {
        if (number > 100) {
            System.out.println("The number is bigger than 100");
        } else {
            for (int i = number; i <= 100; i++) {
                System.out.println(i);
            }
        }
    }

    public void loopEx2(int number) {
        if (number < -100) {
            System.out.println("The number is less than 100");
        } else {
            for (int i = number; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }

    public void loopEx3(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void loopEx4(int x, int y) {
        if (x > y) {
            loopEx3(y, x);

        } else {
            loopEx3(x, y);
        }
    }

    public void loopEx5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void loopEx6() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int loopEx7(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;

    }

    public double loopEx8(int x) {
        int sum = 0;
        double counter = 0.0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
            counter++;
        }
        double result = sum / counter;
        return result;
    }

    public void loopEx9(int number) {
        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void whileEx1(int number) {
        if (number > 100) {
            System.out.println("The number is bigger than 100");
        } else {
            int i = number;
            while (i <= 100) {
                System.out.println(i);
                i++;
            }
        }
    }

    public void whileEx2(int number) {
        if (number < -100) {
            System.out.println("The number is less than 100");
        } else {
            int i = number;
            while (i >= -100) {
                System.out.println(i);
                i--;
            }
        }
    }

    public void whileEx3(int x, int y) {
        int i = x;
        while (i <= y) {
            System.out.println(i);
            i++;
        }
    }

    public void whileEx4(int x, int y) {
        if (x > y) {
            whileEx4(y, x);

        } else {
            whileEx3(x, y);
        }
    }

    public void whileEx5() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
            i++;
        }
    }

    public void whileEx6() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void whileEx7() {
        int i = 111;
        int count = 0;
        while (i <= 8899) {
            count = count + i;
            i++;
        }
        System.out.println(count);
        double avg = count / 8788.0;
        System.out.println(avg);

    }

    public double whileEx8(int x, int y) {
        int i = x;
        int count = 0;
        double counter = 0.0;
        while (i <= y) {
            if (i % 7 == 0) {
                count = count + i;
                counter++;
            }
            i++;
        }
        double avg = count / counter;
        return avg;
    }

    public void whileEx9() {
        int i = 1;
        int f0 = 0;
        int f1 = 1;
        while (i <= 20) {
            System.out.print(f0 + " ");
            int count = f0 + f1;

            f0 = f1;
            f1 = count;
            i++;
        }

    }

    public void CozaLozaWoza() {
        int i = 1;
        String val = "";
        while (i <= 100) {
            val = "";
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                val = "CozaLozaWoza";
                i++;
                continue;
            }
            if (i % 3 == 0 && i % 5 == 0) {
                val = "CozaLoza";
                i++;
                continue;
            }
            if (i % 3 == 0 && i % 7 == 0) {
                val = "CozaWoza";
                i++;
                continue;
            }
            if (i % 5 == 0 && i % 7 == 0) {
                val = "WozaLoza";
                i++;
                continue;
            }
            if (i % 3 == 0)
                val = "Coza";
            if (i % 5 == 0)
                val = "Loza";
            if (i % 7 == 0)
                val = "Woza";
            if (val != "")
                System.out.print(val);
            else
                System.out.print(i);
            System.out.print(" ");
            i++;
        }

    }

    public void arrayEx2() {
        int[] myArr = new int[100];
        for (int i = 0; i < 100; i++) {
            myArr[i] = i + 1;
            System.out.println(myArr[i]);

        }
    }

    public int[] arrayEx3(int[] array) {
        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public double arrayEx4(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter = counter + array[i];

        }
        return counter / (double) array.length;
    }

    public boolean arrayEx5(String[] array, String search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(search)) {
                return true;
            }
        }
        return false;
    }

    public int arrayEx6(int[] array, int search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                return i;
            }
        }
        return -1;
    }

    public void arrayEx7() {
        int n = 10;
        String[] array = new String[10];
        for (int i = 0; i < n; i++) {
            array[i] = "- - - - - - - - - - ";
        }
        printArray(array);
    }

    public int[] arrayEx8(int[] array, int search) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                count++;
            }
        }
        int[] copyArray = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                continue;
            } else {
                copyArray[j] = array[i];
                j++;
            }
        }
        return copyArray;
    }
    public int arrayEx9(int[] array){
        Arrays.sort(array);
        return array[1];
    }
    public int[] arrayEx10(int[] array, int[] empty){
        for(int i = 0; i < array.length; i++ ){
            empty[i] = array[i];
        }
        return empty;
    }

}
