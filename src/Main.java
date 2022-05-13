import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        System.out.println("Введите 5 символов");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }
        System.out.println(listA);
        ArrayList<String> listB = new ArrayList<>();
        System.out.println("Введите 5 символов");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println(listB);
        ArrayList<String> listC = new ArrayList<>();
        Iterator<String> iteratorA = listA.iterator();
        Iterator<String> iteratorB = listB.iterator();
        Collections.reverse(listB);
        for (String i: listA) {
            listC.add(iteratorA.next());
            listC.add(iteratorB.next());
        }
        System.out.println(listC);
        Collections.sort(listC, new LengthFirstComparator());
        System.out.println(listC);
    }
}