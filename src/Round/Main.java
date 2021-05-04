package Round;

import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Screen screen = new Screen(2,4);

        System.out.print(screen.getHeight());
        System.out.print(screen.getWidth());

        System.out.print("Введите размер экрана. \n" +
                "1) Ширина:");

        Scanner scanner = new Scanner(System.in);

//        try {
//            width = scanner.nextInt();
//            System.out.print("2) Высота:");
//            height = scanner.nextInt();
//            System.out.print("Ведите радиус круга:");
//            radius = scanner.nextInt();
//        }
//        catch (InputMismatchException e) {
//            System.out.print("Ошибка в формате вывода.");
//        }
//
//        String[][] ScreenOne = new String[height][width];
//
//        for (int i=0; i<height; i++) {
//            for (int j=0; j<width; j++) {
//                ScreenOne[i][j] = "# ";
//            }
//            System.out.print("\n");
//        }
//
//        for (int i=0; i<height; i++) {
//            for (int j=0; j<width; j++) {
//                if ((j-radius)*(j-radius)+(i-radius)*(i-radius) == radius*radius) {
//                    ScreenOne[i][j] = "* ";
//                }
//            }
//            System.out.print("\n");
//        }
//
//        for (int i=0; i<height; i++) {
//            for (int j=0; j<width; j++) {
//                System.out.print(ScreenOne[i][j]);
//            }
//            System.out.print("\n");
//        }

//        System.out.print("Введите новое число:");
//        Scanner in = new Scanner(System.in);
//        int size = in.nextInt();
//        System.out.print("Введено число:" + size + "\n");
//
//        String[] test = new String[size];
//
//        for (int i=0; i<size; i++) {
//            test[i] = "#";
//            System.out.print(test[i]);
//        }

/*        String[] test = new String[width];

        for (int i=0; i<width; i++) {
            test[i] = "#";
            System.out.print(test[i]);
        }*/

//        Screen LGV = new Screen();
//        Round icon = new Round();
//        LGV.setWidth(30);
//        LGV.setHeight(30);
//        icon.setRadius(13);
//
////        LGV.ShowScreen();
//        LGV.ShowScreen();
//        int r = 5;
//
//        for (int i=0; i<25; i++) {
//            for (int j=0; j<25; j++) {
//                if ( Math.ceil((j-r)*(j-r)+(i-r)*(i-r)) == r*r) {
//                    System.out.print("|*|");
//                }
//                System.out.print("   ");
//            }
//            System.out.print("\n");
//        }
    }

    /*public static void MainMenu () {
        System.out.print("Выберете операцию:\n" +
                "1) Создать экран.\n" +
                "2) Создать фигуру.\n" +
                "3) Показать экран.\n" +
                "4) Выход.\n");
        try {
            Scanner in = new Scanner(System.in);
            int Choice = in.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.print("Вы должны были вводить число");
            Main.main();
        }
    }*/
}
