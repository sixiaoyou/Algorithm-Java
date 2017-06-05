package pers.you.algorithm.queue;

class ListNode<T> {
    T value;
    ListNode<T> next;

    public ListNode(T value, ListNode<T> next) {
        super();
        this.value = value;
        this.next = next;
    }
}

public class MiniQueue<T> {
    private int size;

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }

    private ListNode<T> head;
    private ListNode<T> last;

    public MiniQueue() {
        super();
        head = new ListNode<T>(null, null);
        last = head;
    }

    public void offer(T t) {
        ListNode<T> node = new ListNode<T>(t, null);
        last.next = node;
        last = node;
        size++;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return head.next.value;
        }
    }

    public T poll() {
        if (isEmpty()) {
            return null;
        } else {
            ListNode<T> p = head.next;
            head.next = p.next;
            size--;
            if (size == 0) {
                last = head;
            }
            return p.value;
        }
    }

}
