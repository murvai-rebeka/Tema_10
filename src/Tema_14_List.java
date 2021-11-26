import java.util.ArrayList;
import java.util.List;

public class Tema_14_List {
    public static void main(String args[]) {
        ListOp op = new ListOp();
        List<String> list1 = new ArrayList<String>();
        list1.add("Rebeka");
        list1.add("Laura");
        list1.add("Murvai");
        op.Ex1(list1);

        List<Integer> list2 = new ArrayList<>();
        list2.add(8);
        list2.add(10);
        op.Ex2(list2, 2);

        List<Integer> list3 = new ArrayList<>();
        list3.add(7);
        list3.add(8);
        list3.add(9);
        list3.add(10);
        op.Ex3(list3, 8);


        List<Integer> list4 = new ArrayList<>();
        list4.add(7);
        list4.add(8);
        list4.add(9);
        list4.add(10);
        op.Ex4(list4);

        List<String> list5 = new ArrayList<String>();
        list5.add("Rebeka");
        list5.add("Laura");
        list5.add("Murvai");
        op.Ex5(list5, "Idontknow", 1);

        List<Integer> list6 = new ArrayList<>();
        list6.add(8);
        list6.add(10);
        op.Ex6(list6, 2);

        List<String> list7 = new ArrayList<String>();
        list7.add("Rebeka");
        list7.add("Laura");
        list7.add("Murvai");
        op.Ex7(list7);

        List<Integer> list8 = new ArrayList<>();
        list8.add(7);
        list8.add(18);
        list8.add(9);
        list8.add(10);
        System.out.println(op.Ex8(list8));
    }

}
