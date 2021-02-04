public class Main {

    public static void main(String[] args) {
        MyArrayList<Student> mal = new MyArrayList<>();
        mal.insertFirst(new Student(1, "John"));
        mal.insertFirst(new Student(2, "Mary"));
        mal.insertLast(new Student(3, "Mike"));
        mal.show(); //All three
        System.out.println("------------------");
        mal.deleteLast();
        mal.show(); //Last removed
        System.out.println("------------------");
        mal.deleteFirst(); //First removed
        mal.show();
    }
}
