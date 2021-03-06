import java.util.ArrayList;
import java.util.List;

public class ListOp {
    public void Ex1(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public void Ex2(List<Integer> list, int number) {
        System.out.println(list);
        list.add(number);
        System.out.println(list);
    }

    public void Ex3(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= number)
                System.out.println(list.get(i));
        }
    }

    public void Ex4(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public void Ex5(List<String> list, String text, int index) {
        System.out.println(list);
        list.add(index, text);
        System.out.println(list);
    }

    public void Ex6(List<Integer> list, int number) {
        System.out.println(list);
        list.add(0, number);
        System.out.println(list);
    }

    public void Ex7(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Pe pozitia " + i + " valoare este " + list.get(i));
        }
    }

    public int Ex8(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) >= max)
                max = list.get(i);
        }
        return max;
    }

    public void ExOptional1(List<Integer> list, int start, int to) {
        System.out.println(list);
        int temp = list.get(start);
        list.set(start, list.get(to));
        list.set(to, temp);
        System.out.println(list);
    }
    public List<Integer> ExOptional2(List<Integer> list) {
        List<Integer> pairs = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0)
               pairs.add(list.get(i));
        }
        return pairs;
    }
    public List<Integer>  ExOptional3(List<Integer> list) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    sorted = false;
                }
            }
        }
        return list;
    }
}
