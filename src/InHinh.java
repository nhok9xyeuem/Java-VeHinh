import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        String[] menu = {"1. Draw the square triangle bottom-left", "2.Draw the square triangle top-left ", "3. Draw the square", "0. Exit"};
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i]);
        }
        System.out.println("Moi Ban Nhap Tuy Chon : ");
        int choice;
        choice = input.nextInt();
        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                drawTheTriangleBot();
                break;
            case 2:
                drawTheTriangleTop();
                break;
            case 3:
                drawTheSquare();
                break;
            default:
                System.out.println("So Ban Nhap Khong Dung");
                System.exit(0);
        }


    }

    private static void drawTheSquare() {
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }

    private static void drawTheTriangleTop() {
        int i, j;
        for (i = 6; i > 0; i--) {
            System.out.println();
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
        }

    }

    private static void drawTheTriangleBot() {
        int i, j;
        for (i = 0; i < 6; i++) {
            System.out.println();
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
        }

    }
}
