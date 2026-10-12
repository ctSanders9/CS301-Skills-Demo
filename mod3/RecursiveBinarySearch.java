public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 12, 17, 21, 35, 48};
        System.out.println(search(numbers, 21));
    }
    public static boolean search(int[] numbers, int find){

        if (0 == numbers.length) return false;
        if (find == numbers[numbers.length/2]) {
            return true;
        }

        int[] numbers2 = new int[numbers.length/2];
        if (find < numbers[numbers.length/2]){
            for (int i = 0; i < numbers.length/2; i++){
                numbers2[i] = numbers[i];
            }
        }else{

            int j = numbers2.length - 1;
            for (int i = numbers.length - 1; i > numbers.length / 2; i--) {
                numbers2[j] = numbers[i];
                j--;
            }
        }

        return search(numbers2, find);
    }
}
