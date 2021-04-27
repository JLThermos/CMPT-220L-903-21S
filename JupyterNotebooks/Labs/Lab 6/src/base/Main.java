package base;

public class Main {

    public static void main(String[] args) {
	listItem first = new listItem(1);
	listItem second = new listItem(2);
	listItem third = new listItem(3);
	listItem fourth = new listItem(4);


	first.nextnode = second;
	second.nextnode = third;
	third.nextnode = fourth;


    }
}
