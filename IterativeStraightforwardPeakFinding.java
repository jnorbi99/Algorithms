package Searches;

public class IterativeStraightforwardPeakFinding {

    /**
     * This method implements an iterative version of straightforward algorithm
     *
     * @param array where we need to find a peak
     * @return the result of finding or null if not found
     */

    public static Integer find(Integer array[]) {

        int low = 0;
        int high = array.length-1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high-low) / 2;

            if (mid == array.length - 1) {
                return array[mid];
            } else if (mid == 0) {
                return array[0];
            }

            if(array[mid] < array[mid + 1]) {
                low = mid + 1;
            } else if(array[mid] < array[mid - 1]) {
                high = mid - 1;
            } else {
                return array[mid];
            }
        }

        return null;
    }

    public static void main(String[] args) {
        Integer[] integers = {20,12,11,10,8,7,6,9,7};
        int result = find(integers);
        System.out.println(result);
    }
}
