public class Main {

    public static void main(String[] args) {
        // Задание 1

        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println();
        for (int y = 10; y >= 1; y--) {
            System.out.print(y);
        }

        // Задание 2

        System.out.println();
        int friday = 4;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Today is Friday, the " + friday + "th. It is necessary to prepare a report!");
        }

        // Задание 3

        int comet = 0;
        int year = 2022;
        for (; comet < year + 100 ; comet = comet + 79) {
            if (comet > year - 200) {
                System.out.println(comet);

            }
        }
    }
}
