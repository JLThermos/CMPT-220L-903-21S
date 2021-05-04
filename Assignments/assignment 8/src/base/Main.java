package base;

public class Main {

    public static void main(String args[]) {
        System.out.println(summation(10));
        System.out.println(tailend(10, 0));
        System.out.println(headend(10, 0));
    }
    //linear recursion
    public static int summation(int number){
        if (number == 0){
            return number;
        }
        else{
            return number + summation(number - 1);
        }
    }
    //tail end recursion
    public static int tailend(int number, int currentTotal){
        if (number <= 1){
            return currentTotal + number;
        }
        else return tailend(number - 1, currentTotal + number);
    }
    //head end recursion
    public static int headend(int number, int currentTotal){
        if (number > 0){
            return headend(number - 1, currentTotal + number);
        }
        else {
            return currentTotal + number;
        }
    }

}

