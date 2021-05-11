package base;

public class Main {

    public static void main(String[] args) {
        DumbList hello = new DumbList();

        hello.add(1);
        hello.add(2);
        hello.add(3);
        hello.add(4);
        hello.add(5);
        System.out.println(hello.length());
        hello.printList();
        hello.delete(2);
        hello.printList();
        System.out.println(hello.length());
        hello.sort();
        hello.printList();
    }
}
