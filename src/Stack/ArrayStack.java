package Stack;
import Array.Array;

public class ArrayStack<T> implements Stack<T> {
    Array<T> array;
    public ArrayStack(int capacity){
        array = new Array<T>(capacity);
    }
    public ArrayStack(){
        array = new Array<T>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void push(T t) {
        array.addList(t);
    }

    @Override
    public T pop() {
        return array.removeLast();
    }

    @Override
    public T peek() {
        return array.getLast();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: ");
        sb.append("[");
        for(int i=0;i<array.getSize();i++){
            sb.append(array.getData(i));
            if(i!=array.getSize()-1){
                sb.append(", ");
            }
        }
        sb.append("] top");
        return sb.toString();
    }
}
