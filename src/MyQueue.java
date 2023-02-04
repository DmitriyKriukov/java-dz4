import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Object> list;

    MyQueue() {
        list = new LinkedList<>();
    }

    boolean empty() {
        return list.isEmpty();
    }

    public void enqueue(Integer n) {
        list.addLast(n);
    }

    public Object dequeue() {
        if (!empty()) {
            return list.removeFirst();
        }
        return null;
    }

    public Object first() {
        if (!empty()) {
            return list.getFirst();
        }
        return null;
    }
}