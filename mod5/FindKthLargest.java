import java.util.Random;

public class FindKthLargest {
    private static final Random rdm = new Random();

    public static int findKthLargest(int[] givenArray, int k){

        int find = givenArray.length - k;
        int min = 0;
        int max = givenArray.length - 1;

        while (min <= max){
            int ind = min + rdm.nextInt(max - min +1);
            int updateInd = givenArray[ind];

            swap(givenArray, ind, max);

            int j = min;
            for (int i = min; i < max; i++){
                if (givenArray[i] <= givenArray[ind]){
                    swap(givenArray, j, i);
                    j++;
                }
            }

            swap(givenArray, j, max);

            if (j == find){
                return givenArray[j];
            } else if (j < find){
                min = 1 + j;
            } else {
                max = j - 1;
            }
        }

        return -1;
    }
    private static void swap(int[] array, int swapA, int swapB){
        int swap = array[swapA];
        array[swapA] = array[swapB];
        array[swapB] = swap;
    };

    public static void main(String[] args) {
        int[] a = {7, 2, 9, 4, 1, 6};
        int k = 2;

        System.out.println(findKthLargest(a, k));
    }

}
