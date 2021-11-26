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
}
