public class BinarySearch {

    public static int findIndex(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (a[mid] == mid) {
                return mid;
            } else if (a[mid] < mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {-10, -5, 0, 3, 7, 12, 15};

        System.out.println(findIndex(a));
    }
}
