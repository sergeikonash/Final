import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        ChristmasTree tree = new ChristmasTree();
        ChristmasTreeToy redToy1 = new ChristmasTreeToy("red", 2);
        ChristmasTreeToy blueToy1 = new ChristmasTreeToy("blue", 2);
        ChristmasTreeToy redToy2 = new ChristmasTreeToy("red", 1);
        ChristmasTreeToy greenToy1 = new ChristmasTreeToy("green", 3);
        ChristmasTreeToy redToy3 = new ChristmasTreeToy("red", 3);


        tree.decoratingTheChristmasTree(redToy1);
        tree.decoratingTheChristmasTree(blueToy1);
        tree.decoratingTheChristmasTree(redToy2);
        tree.decoratingTheChristmasTree(greenToy1);
        tree.decoratingTheChristmasTree(redToy3);

        Comparator<ChristmasTreeToy> christmasTreeToyComparator = new Comparator<ChristmasTreeToy>() {
            @Override
            public int compare(ChristmasTreeToy o1, ChristmasTreeToy o2) {
                return o1.color.compareTo(o2.color);
            }
        };
    }

    public static void sortBySize(ChristmasTree tree) {
        Collections.sort(tree.toys);
        System.out.println("Сортировка по размеру, Comparable(по убыванию):");
        System.out.println(tree.toString());

        System.out.println(ChristmasTree.countOfRedToys);
        System.out.println();


    }
}
