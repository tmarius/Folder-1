/**
 * YOLOOOOOO
 */
package javaapplication4;

/**
 * mais ???
 * @author Thomas
 */
public class FFdebugCalc {

    /**
     * 
     * @param array l'array en entrée
     * @return yoloooo 
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
