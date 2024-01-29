package homework4.Conditions.FizzBuzz;

public class FizzBuzz {
/*    выведите на экран числа 1 до 100. При этом:

    если число кратно 3, напечатайте Fizz
    если число кратно 5, напечатайте Buzz
    если число кратно и 3, и 5, напечатайте FizzBuzz*/

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzz(i));

        }


    }
    int fizz = 3;
    int buzz = 5;
    public static String getFizzBuzz(int n){
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        }
        return String.valueOf(n);
    }
}
