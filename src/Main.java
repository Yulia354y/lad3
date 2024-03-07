//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //завдання 1
        int a = 5;
        int b = 2;
        double d = ((double) a/b);
        int m = a % b;
        System.out.println(d);
        System.out.println(m);


        //завдання 2
        int a2 = 16;
        int firstNumber = a2/10;
        int secondNumber = a2%10;
        int sum = firstNumber + secondNumber;
        System.out.println(sum);


        //завдання 3
        double n = 4.25;
        int roundedNumber = (int)(n + 0.5);
        System.out.println("Округлене число: " + roundedNumber);
    }
}