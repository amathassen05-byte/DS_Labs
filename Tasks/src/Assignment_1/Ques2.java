package Assignment_1;

import java.util.Random;

public class Ques2 {

    static int[] removeRandom(int[] arr) {
        Random r = new Random();
        int index = r.nextInt(arr.length);

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

}
