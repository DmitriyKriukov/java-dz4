import java.util.*;


public class Main {
    public static void main(String[] args) {
        ex0();
    }

    static void ex0() {
    /*
    Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    */
        System.out.print("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = randomLinkedList(n);
        System.out.println("Начальный список: " + list);
        System.out.println("Перевернутый список: " + reversLinkedList(list));
    }

    static void ex1() {
    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
    */

        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(15);
        System.out.println("Возвращение первого элемента из очереди и удаление его: " + myQueue.dequeue());
        System.out.println("Возвращение первого элемента из очереди не удаляя его: " + myQueue.first());
    }

    static void ex2() {
    /*
    Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
    */
        System.out.print("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = randomLinkedList(n);
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        System.out.println("Список: " + list);
        System.out.println("Сумма всех элементов равна " + sum);
    }

    static LinkedList<Integer> randomLinkedList(int n) {
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        return list;
    }


    static LinkedList<Integer> reversLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer integer = iterator.next();
        }
        while (iterator.hasPrevious()){
            Integer integer = iterator.previous();
            reversedList.add(integer);
        }
        return reversedList;
    }
}