package task.generics;

import java.util.ArrayList;
import java.util.List;


public class Producer<T> {
    private List<T> boxes;
    public Producer() {
        this.boxes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Producer{" +
                "boxes=" + boxes +
                '}';
    }

    public Producer(List<T> boxes) {
        this.boxes = boxes;

    }

    public List<T> getBoxes() {
        return boxes;
    }
    public void addBox(T box) {
        boxes.add(box);
    }

    public boolean checkBoxInList(T box) {
        return boxes.contains(box);
    }

    public static void main(String[] args) {
        Producer<String> box1 = new Producer<>();
        box1.addBox("Box 1");
        box1.addBox("Box 2");
        System.out.println(box1.checkBoxInList("Box 3"));

        Producer<Integer> box2 = new Producer<>();
        box2.addBox(10);
        box2.addBox(20);
        box2.addBox(30);
        System.out.println(box2.checkBoxInList(20));


    }

}
