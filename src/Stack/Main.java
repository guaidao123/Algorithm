package Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> arr = new ArrayStack<Integer>();
        for(int i=0;i<5;i++){
            arr.push(i);
            System.out.println(arr);
        }
        arr.pop();
        System.out.println(arr);
    }
}
