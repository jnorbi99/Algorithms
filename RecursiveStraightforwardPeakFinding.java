package Searches;

public class RecursiveStraightforwardPeakFinding {

    /**
     * This method implements an recursive version of straightforward algorithm
     *
     * find()
     * @param array where we need to find a peak
     * @return result of peak finding
     *
     * StraightForward()
     * @param low first item of searched array
     * @param high last item of the searched array
     * @param array where we need to find a peak
     * @return array which was added again to StraightForward()
     */

    public static Integer find(Integer array[]) {
        int low = 0;
        int high = array.length - 1;

        Integer result = StraightForward(low, high, array);
        return result;
    }

    private static Integer StraightForward(int low, int high, Integer[] array) {
        int mid = 0;
        mid = low + (high-low) / 2;

        if (mid == array.length - 1) {
            return array[mid];
        } else if (mid == 0) {
            return array[0];
        }

        if(array[mid] < array[mid + 1]) {
            return StraightForward(mid + 1, high, array);
        } else if(array[mid] < array[mid - 1]) {
            return StraightForward(low, mid - 1, array);
        }
        return array[mid];
    }

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7,10,9};
        Integer result = find(integers);
        System.out.println(result);
    }
}
