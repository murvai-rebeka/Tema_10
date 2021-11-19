public class Tema_13 {
    public static void main(String args[]) {
        LogicalOp op = new LogicalOp();
        /*2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
        Sa se afiseze progresul in consola pe tot parcursul.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 2:");
        op.arrayEx2();
        System.out.println("End result exercise 2");

        /*Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100.
        Apelati metoda in main() pentru a verifica daca functioneaza.
        Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla. */
        System.out.println("The result for exercise 3:");
        int[] a = new int[50];
        op.arrayEx3(a);
        op.printArray(a);
        System.out.println("End result exercise 3");

        /*Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
        Metoda sa calculeze si sa returneze media numerelor din array.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 4:");
        int[] b = new int[]{1, 2, 6};
        System.out.println(op.arrayEx4(b));
        System.out.println("End result exercise 4");

        /*Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
        Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 5:");
        String[] c = new String[]{"blue", "red", "yellow"};
        System.out.println(op.arrayEx5(c, "red"));
        System.out.println("End result exercise 5");

        /*Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
        Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 6:");
        int[] d = new int[]{1, 2, 6, 8, 10};
        System.out.println(op.arrayEx6(d, 8));
        System.out.println("End result exercise 6");

        /*Creati o metoda care sa afiseze urmatoarea grila, folosind un array: */
        System.out.println("The result for exercise 7:");
        op.arrayEx7();
        System.out.println("End result exercise 7");

        /*Creati o metoda care sa primeasca un parametru de tip array de numere,
        populat cu valori, si un parametru de tip numar.
        Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 8:");
        int[] e = new int[]{1, 2, 6, 8, 10, 2};
        op.printArray(op.arrayEx8(e, 2));
        System.out.println("End result exercise 8");

        /*Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 9:");
        int[] f = new int[]{10, 1, 2, 11, 6, 9, 8, 10};
        System.out.println(op.arrayEx9(f));
        System.out.println("End result exercise 9");

        /*Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
        Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
        Apelati metoda in main() pentru a verifica daca functioneaza.*/
        System.out.println("The result for exercise 10:");
        int[] g = new int[]{1, 2, 6, 8, 10, 2};
        int[] h = new int[g.length];
        op.printArray(op.arrayEx10(g, h));
        System.out.println("End result exercise 10");
    }
}
