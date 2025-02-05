package PatternProblems;

public class Pattern {
    public static void main(String[] args) {
        righttriangle(4);

        System.out.println();
        cylinder(6);

        System.out.println();
        invertedrighttriangle(4);

        System.out.println();
        number(5);

        System.out.println();
        righttrianglearrow(5);

        System.out.println();
        trianglewithspace(6);

        System.out.println();
        pyramid(8);

        System.out.println();
        pyramidupsidedown(4);

        System.out.println();
        boxofnumbers(3);

        System.out.println();
    }
    public static void righttriangle(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void cylinder(int num){
        for (int row = 0; row < num; row++) {
            for (int col = 0; col < num; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedrighttriangle(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= num - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void number(int num){
        for (int row = 1; row <= num; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void righttrianglearrow(int num){
        for (int row = 1; row <= 2 * num - 1; row++) {
            int numofcolinrow = (row <= num) ? row : (2 * num - row);
            for (int col = 1; col <= numofcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void trianglewithspace(int num){
        for (int row = 1; row <= 2 * num - 1; row++) {
            int numofcolinrow = (row <= num) ? row : (2 * num - row);
            int numofspaces = (row <= num) ? num - row : row - num;
            for (int colspace = 1; colspace <= numofspaces; colspace++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= numofcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pyramid(int num){
        for (int row = 1; row <= num; row++) {

            for (int spaces = 1; spaces <= num - row; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col2 = 2; col2 <= row ; col2++) {
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }

    public static void pyramidupsidedown(int num){
        for (int row = 1; row <= 2 * num - 1; row++) {
//            int spacesforcolumn =  (row <= num) ? num - row : row - num;
            int numforcolumn = (row <= num) ? row : (2 * num) - row;

            for (int spaces = 1; spaces <= num - numforcolumn; spaces++) {
                System.out.print("  ");
            }
            for (int col = numforcolumn; col >= 1 ; col--) {
                System.out.print(col + " ");
            }
            for (int col2 = 2; col2 <= numforcolumn ; col2++) {
                System.out.print(col2 + " ");
            }
            System.out.println();
        }
    }

    public static void boxofnumbers(int num){
        for (int row = 1; row <= 2 * num - 1; row++) {
            for(int col = 1; col <= 2 * num - 1 ; col++){
                int ateveryindex = Math.min(Math.min(row, col), Math.min(2 * num - row, 2 * num - col));
                int largertosmaller = num + 1 - ateveryindex;
                System.out.print(largertosmaller);
            }
            System.out.println();
        }
    }
}