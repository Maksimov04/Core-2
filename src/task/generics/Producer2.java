package task.generics;

import java.util.ArrayList;
import java.util.List;

public class Producer2 {

    public static void main(String[] args) {
        List<Boxes<String>> boxesList = new ArrayList<>();
        boxesList.add(new Boxes<>("box 1"));
        boxesList.add(new Boxes<>("box 2"));
        boxesList.add(new Boxes<>("box 3"));
        boxesList.add(new Boxes<>("box 4"));


        printBoxList(boxesList);
    }

        public static <T> void printBoxList(List<Boxes<String>> boxes) {
            for (Boxes<String> box : boxes) {
                System.out.println("Печать коробок  : " + box.getCapacity());
            }
        }
    }


class Boxes<S> {
    private String capacity;

    public Boxes(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }
}


