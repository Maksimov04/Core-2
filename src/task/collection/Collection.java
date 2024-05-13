package task.collection;

import java.util.*;


public class Collection {
    public static void main(String[] args) {


    }

    // Реализуйте функциональность согласно описанию

    // TODO: Для каждой задачи сгенерируйте самостоятельно коллекции и карты для тестирования своих методов


    // TODO: Найти наибольший элемент в списке.


    class maxElement {
        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(10);
            arr.add(20);
            arr.add(8);
            arr.add(32);
            arr.add(21);
            arr.add(31);

            int max = arr.get(0);
            int n = arr.size();
            for (int i = 1; i < n; i++) {
                if (arr.get(i) > max) {
                    max = arr.get(i);
                }
            }
            System.out.println("Maximum is : " + max);
        }
    }
}

// TODO: Удалить все дубликаты из списка.
class RemovingDuplicates {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("apple");
        myList.add("orange");

        System.out.println("Список до удаления дубликатов: " + myList);

        HashSet<String> set = new HashSet<>(myList);
        myList.clear();
        myList.addAll(set);

        System.out.println("Список после удаления дубликатов: " + myList);
    }
}


// TODO: Отсортировать список в порядке убывания.

class Spisok {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Ilya");
        list.add("Misha");
        list.add("Masha");
        list.add("Anton");
        list.add("Mila");
        list.add("Dmitrei");

        System.out.println("Unsorted ArrayList: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList " + "in Descending order : " + list);
    }
}

// TODO: Проверить, содержит ли множество определенный элемент.

class bunchOfElement {
    public static void main(String args[]) {

        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("orange");
        mySet.add("Masha");

        String elementToCheck = "apple";
        if (mySet.contains(elementToCheck)) {
            System.out.println("Множество содержит элемент " + elementToCheck);
        } else {
            System.out.println("Множество не содержит элемент " + elementToCheck);
        }
    }
}


// TODO: Найти пересечение двух множеств.

class IntersectionOfTwoSets {
    public static void main(String args[]) {
        ArrayList<String> List1 = new ArrayList<>();
        List1.add("Ananas");
        List1.add("Banan");
        List1.add("Oreng");
        List1.add("Dog");


        ArrayList<String> List2 = new ArrayList<>();
        List2.add("Ananas");
        List2.add("Cat");
        List2.add("Oreng");
        List2.add("Ilya");
        List2.add("Dog");


        List2.retainAll(List1);


        System.out.println("List1 Contains :" + List1);
        System.out.println("List2 Contains :" + List2);
    }
}

// TODO: Удалить все элементы из множества, которые также содержатся в другом множестве.
class deletion {
    public static void main(String args[]) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(2);
        set1.add(7);


        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(8);

        HashSet<Integer> deletion = new HashSet(set1);
        deletion.removeAll(set2);
        System.out.println(deletion);
    }

}

// TODO: Проверить, содержит ли карта определенный ключ.
class IsTheKey {
    public static void main(String args[]) {
        HashMap<Integer, String> r1 = new HashMap<Integer, String>();
        r1.put(10, "Ilya");
        r1.put(12, "aa");
        r1.put(18, "BB");
        r1.put(4, "Masha");


        System.out.println("Is the key '2' present? " + r1.containsKey(20));


        System.out.println("Is the key '4' present? " + r1.containsKey(4));
    }
}


// TODO: Получить все значения, связанные с определенным ключом.
class element {
    public static void main(String args[]) {
        HashMap<Integer, String> r1 = new HashMap<Integer, String>();
        r1.put(1, "Ilya");
        r1.put(2, "aa");
        r1.put(3, "BB");
        r1.put(4, "Masha");

        String element = r1.get(3);

        System.out.println("The element at index 3 is " + element);
    }

}

// TODO: Удалить все записи из карты, у которых значение равно определенному значению.
class CardEntry {
    public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("3", "Three");
        map.put("5", "Five");
        map.put("7", "Seven");
        map.put("9", "Nine");
        System.out.println(map);

        map.remove("9");

        System.out.println(map);
    }
}


// TODO: Добавить элемент в очередь.
class ItemInQueue {
    public static void main(String[] args) {
        Queue<String> r1 = new PriorityQueue<>();


        r1.add("ILYA");
        r1.add("AMIR");
        r1.add("PETR");

        System.out.println(r1);

    }
}


// TODO: Получить и удалить первый элемент из очереди.

class elementFromTheQueue {
    public static void main(String[] args) {
        Deque<Integer> r1 = new ArrayDeque<>();
        r1.add(333);
        r1.add(444);
        r1.add(555);
        r1.add(666);

        System.out.println(r1.removeFirst());
        System.out.println(r1);


    }
}


// TODO: Проверить, пуста ли очередь.

class emptyQueue {
    public static void main(String[] args) {

        ArrayList<Integer> r1 = new ArrayList<>();
        r1.add(4);
        r1.add(3);
        r1.add(2);
        r1.add(1);

        System.out.println("Is the queue empty? :  " + r1.isEmpty());
    }
}


// TODO: Учет заказов:
//  Создайте класс Order с полями id(int), customer(String) и totalAmount(int).
//  Создайте метод, который будет принимать список заказов и выводить заказы с наибольшей суммой.
//  Создайте метод, который будет принимать список заказов и возвращать общую сумму всех заказов.

// TODO: Управление задачами:
//  Создайте класс Task с полями id(int), title(String) и completed(boolean).
//  Создайте метод, который будет принимать список задач и выводить только незавершенные задачи на экран.
//  Создайте метод, который будет принимать список задач и возвращать список задач с определенным заголовком.


// TODO: Создание списка студентов:
//  Создайте класс Student с полями name(String) и age(int).
//  Создайте метод, который будет принимать список студентов и выводить их на экран.
//  Создайте метод, который будет принимать список студентов и возвращать список студентов, у которых возраст больше определенного значения.

// TODO: Учет товаров на складе:
//  Создайте класс Product с полями id(int), name(String) и quantity(int).
//  Создайте метод, который будет принимать список товаров и выводить только товары с нулевым количеством на складе.
//  Создайте метод, который будет принимать список товаров и возвращать общее количество товаров на складе.

// TODO: Учет посещаемости:
//  Создайте класс Student с полями name(String) и attendance(String).
//  Создайте метод, который будет принимать список студентов и выводить студентов с наихудшей посещаемостью.
//  Создайте метод, который будет принимать список студентов и возвращать среднюю посещаемость.
