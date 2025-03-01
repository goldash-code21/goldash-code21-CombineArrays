
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr3 = new int[len1+len2];

        System.arraycopy(arr1, 0, arr3, 0, len1);
        System.arraycopy(arr2, 0, arr3, len1, len2);
        return arr3;
    }
}
