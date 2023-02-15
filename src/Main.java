


public class Main {
    public static void main(String[] args) {


        int number = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i+" ");
            number =number + 1;
            }
            if (number % 10 == 0 && number != 0) {
                System.out.print("\n");
                number = 0;
            }
    }
    }
}