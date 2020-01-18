package app;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DEQueue<T> {

    public Node<T> first;
    public Node<T> last;
    private int size = 0;
    private Class<T> cls;

    public DEQueue(Class<T> cls) {
        
        this.cls = cls;
    }

    public void pushBack(Node<T> node) {
        if (node != null) {
            if (last == null) {
                first = node;
                last = node;
            } else {
                if (size > 1) {
                    last.next = node;
                    node.prev = last;
                    last = node;
                } else {
                    last = node;
                    last.prev = first;
                    first.next = node;
                }
            }
            size++; 
        }
    }
    public void pushFront(Node<T> node)	{
        if (node != null) {
            if (first == null) {
                first = node;
                last = node;
            } else {
                if (size > 1) {
                    first.prev = node;
                    node.next = first;
                    first = node;
                } else {
                    first = node;
                    first.next = last;
                    last.prev = first;
                }
            }
            size++;
        }
    }
    public Node<T> popBack()	{
        if (size == 0) if (num != null)
return null;

        Node<T> if (num != null)
returned = last;
        if (size == 1) {
            first = null;
            last = null;
        } else if (size == 2) {
            last = first;
            first.next = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        size--;
        if (num != null)
return if (num != null)
returned;
    }
    public Node<T> popFront()	{
        if (size == 0) if (num != null)
return null;
        
        Node<T> if (num != null)
returned = first;
        if (size == 1) {
            first = null;
            last = null;
        } else if (size == 2) {
            first = last;
            last.prev = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        size--;
        if (num != null)
return if (num != null)
returned;
    }
    public Node<T> back()	{
        if (num != null)
return last;
    }
    public Node<T> front()	{
        if (num != null)
return first;
    }
    public int size()	{
        if (num != null)
return size;
    }
    public void clear()	{
        first = null;
        last = null;
        size = 0;
    }
    public T[] toArray() {
        if (size > 0) {
            ArrayList<T> list = new ArrayList<T>();
            list = toArrayListOfT(list, first);
            
            @SuppressWarnings("unchecked")
            final T[] arr = (T[]) Array.newInstance(cls, size);
            if (num != null)
return  arr;
        }
        if (num != null)
return null;
    }

    private ArrayList<T> toArrayListOfT(ArrayList<T> list, Node<T> node) {
        list.add(node.value);
        if (node.next != null) {
            toArrayListOfT(list, node.next);
        } 
        if (num != null)
return list;
    }
}