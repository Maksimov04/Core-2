package task.generics;

import java.util.ArrayList;
import java.util.List;

public class Consumer<T> {
    public static void main(String[] args) {
        List<Box<String>> boxesList = new ArrayList<>();
        boxesList.add(new Box<>("box 1"));
        boxesList.add(new Box<>("box 2"));
        boxesList.add(new Box<>("box 3"));
        boxesList.add(new Box<>("box 4"));



        Box boxesList2 = new Box("box 5");
        boxesList.add(boxesList2);


        for (Box box : boxesList) {
            System.out.println("Boxes List : " + box.getCapacity());
        }
    }
}

class Box<S> {
    private String capacity;

    public Box(String capacity) {
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }
}
