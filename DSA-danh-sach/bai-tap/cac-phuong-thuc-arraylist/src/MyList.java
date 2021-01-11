import java.util.Arrays;

public class MyList<E> {
    private int size;
    public static final int DEFAULT_CAPACITY = 10;
    public Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){

    }

    public void add(int index, E element){
        if (size > elements.length){
            return;

        }
        for (int i = size; i < index ; i--) {
            elements[size + 1] = elements[size];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index){
        Object temp = elements[index];
        for (int i = index; i < size; i++){
            elements[i] = elements[i+1];
        }
        size--;
        return (E) temp;

    }

    public int size(){
        return size;
    }

    public MyList<E> clone(){
        return this;
    }

    public boolean contains(E o){
        return indexOf(o) != -1;
    }

    public int indexOf(E o){
        for (int i = 0; i < size; i++){
            if (o.equals(elements[i]))
                return i;
        }
        return  -1;
    }

    public boolean add(E o){
        if (o == null)
            return false;
        add(size, o);
        return true;
    }

    public int ensureCapacity(int minCapacity){
        int newSize = Math.max(minCapacity, size);
        if (size >= elements.length)
             newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
        return newSize;
    }

    public E get(int i){
        return (E) elements[i];
    }

    public void clear(){
        for (int i = 0; i < elements.length; i++){
            remove(i);
        }
    }

    @Override
    public String toString() { 
        String result = "";
        for (int i = 0; i < size; i++){
            if (i != size - 1 ){
                result += elements[i].toString() + ", " ;
            }else {
                result += elements[i].toString();
            }
        }
        return "[" + result + "]";
    }
}
