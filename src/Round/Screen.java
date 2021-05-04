package Round;

public class Screen {

    private int width = 1;
    private int height = 1;

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
    }
    String[][] screen = new String[this.width][this.height];

    public void createScreen() {
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                screen[i][j] = "# ";
            }
            System.out.print("\n");
        }
    }

    public void showScreen () {
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                System.out.print(screen[i][j]);
            }
            System.out.print("\n");
        }
    }

    public void addRound(int radius) {
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if ((j-radius)*(j-radius)+(i-radius)*(i-radius) == radius*radius) {
                    screen[i][j] = "* ";
                }
            }
            System.out.print("\n");
        }
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

//    public void ShowScreenWithRound (int radius) {
//        for (int i=0; i<this.height; i++) {
//            for (int j=0; j<this.width; j++) {
//                if ((j-radius)*(j-radius)+(i-radius)*(i-radius) == radius*radius) {
//                    System.out.print("|*|");
//                }
//                System.out.print("  ");
//            }
//            System.out.print("\n");
//        }
//    }
}
