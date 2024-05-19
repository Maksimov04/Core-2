package task.generics;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {

        List<Boxes1<Integer>> sourceBoxesList = new ArrayList<>();
        sourceBoxesList.add( new Boxes1<>(15));
        sourceBoxesList.add( new Boxes1<>(11));
        sourceBoxesList.add( new Boxes1<>(10));
        sourceBoxesList.add( new Boxes1<>(12));


        List<Boxes1<Integer>> targetBoxesList = new ArrayList<>();
        targetBoxesList.add(new Boxes1<>(122));
        targetBoxesList.add(new Boxes1<>(121));
        targetBoxesList.add(new Boxes1<>(132));

        copyBoxes(sourceBoxesList, targetBoxesList);
        printBoxes(targetBoxesList);
    }

    public static <T> void copyBoxes(List<Boxes1<Integer>> sourceList, List<Boxes1<Integer>> targetList) {
        for (Boxes1<Integer> box : sourceList) {
            targetList.add(new Boxes1<>(box.getCapacity()));
        }
    }

    public static <T> void printBoxes(List<Boxes1<Integer>> boxes) {
        for (Boxes1 box : boxes) {
            System.out.println("Копирование коробки : " + box.getCapacity());
        }
    }
}

class Boxes1<T> {
    private T capacity;

    public Boxes1(T capacity) {
        this.capacity = capacity;
    }

    public T getCapacity() {
        return capacity;
    }
}


