package com.company;

import java.io.IOException;
import java.util.Random;

/**
 * @author Azarov Alexey
 * @since 31.05.16
 */

public class Start {

    public static void main(String[] args) throws IOException {

        int one5 = 0;
        int two5 = 0;
        int three5 = 0;
        int four5 = 0;
        int five5 = 0;

        int one7 = 0;
        int two7 = 0;
        int three7 = 0;
        int four7 = 0;
        int five7 = 0;
        int six7 = 0;
        int seven7 = 0;

        int[] mas5 = new int[2];
        mas5[0] = 1;
        mas5[1] = 1;
        int gr7 = 1;
        int a = 1;

        Random random = new Random();
        for (int i = 0; i < 700000; i++) {
            a = random.nextInt(5) + 1;

            String numbers = "C:\\Users\\Smela\\IdeaProjects\\Five-Seven\\src\\com\\company\\number.txt";
            // String fileName7 = "C:\\Users\\Smela\\IdeaProjects\\Five-Seven\\src\\com\\company\\7.txt";
            //five's graph counter ( & = randomator)
            if (a == 1) {
                one5++;
                WriteNewTxt.writeFile(numbers, "1");
            } else if (a == 2) {
                two5++;
                WriteNewTxt.writeFile(numbers, "2");
            } else if (a == 3) {
                three5++;
                WriteNewTxt.writeFile(numbers, "3");
            } else if (a == 4) {
                four5++;
                WriteNewTxt.writeFile(numbers, "4");
            } else if (a == 5) {
                five5++;
                WriteNewTxt.writeFile(numbers, "5");
            }
            mas5[0] = mas5[1];
            mas5[1] = a;

            five_graph:
            right:
            if ((mas5[0] == 5 && mas5[1] == 3) ||
                    (mas5[0] == 1 && mas5[1] == 2) ||
                    (mas5[0] == 4 && mas5[1] == 5) ||
                    (mas5[0] == 3 && mas5[1] == 1) ||
                    (mas5[0] == 2 && mas5[1] == 4)) {

                if (gr7 == 5) {
                    gr7 = 1;
                } else if (gr7 == 1) {
                    gr7 = 4;
                } else if (gr7 == 4) {
                    gr7 = 7;
                } else if (gr7 == 7) {
                    gr7 = 3;
                } else if (gr7 == 3) {
                    gr7 = 6;
                } else if (gr7 == 6) {
                    gr7 = 2;
                } else if (gr7 == 2) {
                    gr7 = 5;
                }
            }
            left:
            if ((mas5[0] == 3 && mas5[1] == 5) ||
                    (mas5[0] == 2 && mas5[1] == 1) ||
                    (mas5[0] == 5 && mas5[1] == 4) ||
                    (mas5[0] == 1 && mas5[1] == 3) ||
                    (mas5[0] == 4 && mas5[1] == 2)) {
                if (gr7 == 1) {
                    gr7 = 5;
                } else if (gr7 == 4) {
                    gr7 = 1;
                } else if (gr7 == 7) {
                    gr7 = 4;
                } else if (gr7 == 3) {
                    gr7 = 7;
                } else if (gr7 == 6) {
                    gr7 = 3;
                } else if (gr7 == 2) {
                    gr7 = 6;
                } else if (gr7 == 5) {
                    gr7 = 2;
                }
            }
            up:
            if ((mas5[0] == 1 && mas5[1] == 5) ||
                    (mas5[0] == 2 && mas5[1] == 3) ||
                    (mas5[0] == 4 && mas5[1] == 1) ||
                    (mas5[0] == 5 && mas5[1] == 2) ||
                    (mas5[0] == 3 && mas5[1] == 4)) {
                if (gr7 == 1) {
                    gr7 = 2;
                } else if (gr7 == 4) {
                    gr7 = 5;
                } else if (gr7 == 7) {
                    gr7 = 1;
                } else if (gr7 == 3) {
                    gr7 = 4;
                } else if (gr7 == 6) {
                    gr7 = 7;
                } else if (gr7 == 2) {
                    gr7 = 3;
                } else if (gr7 == 5) {
                    gr7 = 6;
                }
            }
            down:
            if ((mas5[0] == 5 && mas5[1] == 1) ||
                    (mas5[0] == 3 && mas5[1] == 2) ||
                    (mas5[0] == 1 && mas5[1] == 4) ||
                    (mas5[0] == 2 && mas5[1] == 5) ||
                    (mas5[0] == 4 && mas5[1] == 3)) {
                if (gr7 == 2) {
                    gr7 = 1;
                } else if (gr7 == 5) {
                    gr7 = 4;
                } else if (gr7 == 1) {
                    gr7 = 7;
                } else if (gr7 == 4) {
                    gr7 = 3;
                } else if (gr7 == 7) {
                    gr7 = 6;
                } else if (gr7 == 3) {
                    gr7 = 2;
                } else if (gr7 == 6) {
                    gr7 = 5;
                }
            }
            STAY:
            if ((mas5[0] == 1 && mas5[1] == 1) ||
                    (mas5[0] == 2 && mas5[1] == 2) ||
                    (mas5[0] == 3 && mas5[1] == 3) ||
                    (mas5[0] == 4 && mas5[1] == 4) ||
                    (mas5[0] == 5 && mas5[1] == 5)) {
                if (gr7 == 7) {
                    gr7 = 7;
                } else if (gr7 == 1) {
                    gr7 = 1;
                } else if (gr7 == 2) {
                    gr7 = 2;
                } else if (gr7 == 3) {
                    gr7 = 3;
                } else if (gr7 == 4) {
                    gr7 = 4;
                } else if (gr7 == 5) {
                    gr7 = 5;
                } else if (gr7 == 6) {
                    gr7 = 6;
                }
            }
            //seven's graph counter
            if (gr7 == 1) {
                one7++;
                WriteNewTxt.writeFile(numbers, "1");
            } else if (gr7 == 2) {
                two7++;
                WriteNewTxt.writeFile(numbers, "2");
            } else if (gr7 == 3) {
                three7++;
                WriteNewTxt.writeFile(numbers, "3");
            } else if (gr7 == 4) {
                four7++;
                WriteNewTxt.writeFile(numbers, "4");
            } else if (gr7 == 5) {
                five7++;
                WriteNewTxt.writeFile(numbers, "5");
            } else if (gr7 == 6) {
                six7++;
                WriteNewTxt.writeFile(numbers, "6");
            } else if (gr7 == 7) {
                seven7++;
                WriteNewTxt.writeFile(numbers, "7");
            }
        }
        System.out.println("FiveRandom:");
        System.out.printf("one= " + one5 +
                "\ntwo= " + two5 +
                "\nthree= " + three5 +
                "\nfour= " + four5 +
                "\nfive= " + five5);

        System.out.println("\n_______________________");
        System.out.println("GraphSeven:");
        System.out.printf("one= " + one7 +
                "\ntwo= " + two7 +
                "\nthree= " + three7 +
                "\nfour= " + four7 +
                "\nfive= " + five7 +
                "\nsix= " + six7 +
                "\nseven= " + seven7);
    }
}
