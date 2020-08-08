package Array;

public class Student {
    private int sno;
    private String name;

    public Student(int sno,String name){
        this.sno = sno;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Student name is %s, sno is %d",name,sno);

    }

    public static void main(String[] args) {
         Array<Student> arr = new Array<Student>();
         arr.addList(new Student(10,"aaa"));
         arr.addList(new Student(12,"bbb"));
         arr.addList(new Student(14,"cca"));
        System.out.println(arr);
    }
}
