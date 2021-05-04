package base;
import java.util.Scanner;

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

    public void askadd(){
        Scanner yesorno = new Scanner(System.in);
        System.out.println("Do you want to add anything to the list?: ");
        String answer = yesorno.nextLine();
        if (answer.toLowerCase().equals("yes")){
            Scanner input = new Scanner(System.in);
            System.out.println("What number do you want to add?: ");
            int inputanswer = input.nextInt();
            listItem fifth = new listItem(inputanswer);

        }
        else{
            System.out.println("Ok.");
        }
    }
    public void askremove(){
        Scanner yesorno = new Scanner(System.in);
        System.out.println("Do you want to remove anything from the list?: ");
        String answer = yesorno.nextLine();
        if(answer.toLowerCase().equals("yes")){
            Scanner input = new Scanner(System.in);
            System.out.println("Which integer would you like to remove?: ");
            int inputanswer = input.nextInt();


        }
    }
}
// to be finished later



