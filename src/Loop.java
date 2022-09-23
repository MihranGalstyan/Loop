/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Loop {
    public static void main(final String[] args) {
        int a = 10;
        a = a + 1;
        a += 1;
        a++; // increment

        a = a - 1;
        a -= 1;
        a--; // decrement

        //loop with FOR
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        //loop with WHILE
        int i = 0;
        while (i < 1000) {
            System.out.println(i);
            i++;
            if (i == 15) {
                continue;
            } else if (i >= 25) {
                break;
            }
        }

        i = 100;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }

        i = 99;
        while (i > 0) {
            System.out.println(i);
            i -= 2;
        }

        // with "%"
        i = 100;
        while (i > 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }

        // with "%"
        i = 100;
        while (i > 0) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i--;
        }

        //AVG
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }

        float result = sum / (float) count;

        System.out.println(result);


        //do while
        int alfa = 0;
        do {
            System.out.println("Hello World");
        } while (alfa > 0);

        //for
        for (int j = 100; j < 1000; j++) {
            if (j % 2 != 0 && j % 5 == 0){
                System.out.println(j);
            }
        }
    }
}
