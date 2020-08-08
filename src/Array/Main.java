package Array;

public class Main {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<Integer>(20);
        for(int i=0;i<10;i++){
            arr.addList(i);
        }
        System.out.println(arr);

        arr.add(20,4);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        arr.removeFirst();
        arr.removeFirst();
        arr.removeFirst();
        arr.removeFirst();
        System.out.println(arr);
    }
}
