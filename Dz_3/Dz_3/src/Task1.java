import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[]array = createArray(15, -10, 20);
        System.out.printf("Ваш массив :"+Arrays.toString(array));

        System.out.printf("Отсортированный массив:"+ Arrays.toString(mergeSortArray(array)));
    }

    static int[]createArray(int size, int a, int b) {
        Random rnd = new Random();
        int []array = new int[size];
        for (int i =0; i<size; i++) {
            array[i]= rnd.nextInt(b)+a;
        }
        return array;
    }

    static int[] mergeSortArray(int[]array) {
        if (array.length <=1) return array;
        int[] left = Arrays.copyOfRange(array,0,array.length/2);
        int[] right=Arrays.copyOfRange(array, left.length, array.length);
//        sortArray(array,left,right);
        return merge(mergeSortArray(left),mergeSortArray(right));
    }

    static int[] merge(int[]left, int[]right) {
        int resInd= 0, leftInd=0, rightInd=0;
        int[]result = new int[left.length + right.length];

        while (leftInd < left.length && rightInd < right.length)
            if (left[leftInd]< right[rightInd])
                result[resInd++]=left[leftInd++];
            else result[resInd++]= right[rightInd++];

        while (resInd < result.length)

            if (leftInd != left.length)
                result[resInd++] = left[leftInd++];
            else result[resInd++]=right[rightInd++];

        return result;

    }
}





