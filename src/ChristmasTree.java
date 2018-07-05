import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChristmasTree {

    static int countOfRedToys = 0;
    List<ChristmasTreeToy> toys = new ArrayList<>();

    public void decoratingTheChristmasTree(ChristmasTreeToy toy) {
        if (toy.getColor().equals("red")) {
            countOfRedToys++;
        }
        toys.add(toy);
    }



        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (!(o instanceof ChristmasTree)) return false;

            ChristmasTree tree = (ChristmasTree) o;

            return toys != null ? toys.equals(tree.toys) : tree.toys == null;
        }

        @Override
        public String toString () {
            final StringBuilder sb = new StringBuilder("ChristmasTree{");
            sb.append("toys=").append(toys);
            sb.append('}');
            return sb.toString();
        }


    }
