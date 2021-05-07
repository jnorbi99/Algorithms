package Searches;

public class PeakFinding2D {

    /**
     * This method implements an recursive version of peak finding 2D algorithm
     *
     * find()
     * @param index call the findMaxIndex()
     * @param value call the findMaxValue()
     * @return value or the Method recall himself, this is the result
     *
     * findMaxIndex()
     * @param result, this is the value of maximum item
     * @param index, this is the index of maximum item at the row
     * @return index, this is the index of maximum value
     *
     * findMaxValue()
     * @param result, this is the value of maximum item
     * @return result, this is the value of maximum
     **/


    public static int find(int row, int coloumn, int[][] array, int mid) {
        int index = findMaxIndex(row, array, mid);
        int value = findMaxValue(row, array, mid);

        if (mid == 0 || mid == coloumn - 1) {
            return value;
        }

        if (value > array[index][mid - 1] && value > array[index][mid + 1]) {
            return value;
        }

        if (value < array[index][mid - 1]) {
            return find(row, coloumn, array, (int)(mid - Math.ceil((double)mid / 2)));
        }

        return find(row, coloumn, array, (int)(mid + Math.ceil((double)mid / 2)));
    }

    public static int findMaxIndex(int row, int[][] array, int mid) {
        int result = 0;
        int index = 0;

        for (int i = 0; i < row; i++) {
            if (array[i][mid] > result) {
                result = array[i][mid];
                index = i;
            }
        }
        return index;
    }

    public static int findMaxValue(int row, int[][] array, int mid) {
        int result = 0;

        for (int i = 0; i < row; i++) {
            if (array[i][mid] > result) {
                result = array[i][mid];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,3},
                        {4,5,6},
                        {21,8,9}};
        int row = 3;
        int coloumn = 3;
        int result = find(row, coloumn, array, coloumn / 2);
        System.out.println(result);
    }
}
