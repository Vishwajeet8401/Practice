public class progra {
    public static void main(String args[]) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i >= j || i + j >= 11) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 10; j > 0; j--) {
                if (j >= 5 + i || j <= 6 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}