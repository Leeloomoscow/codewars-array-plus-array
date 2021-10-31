import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void sampleTests() {
        assertEquals(21, Sum.arrayPlusArray(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertEquals(-21, Sum.arrayPlusArray(new int[]{-1, -2, -3}, new int[]{-4, -5, -6}));
        assertEquals(15, Sum.arrayPlusArray(new int[]{0, 0, 0}, new int[]{4, 5, 6}));
        assertEquals(2100, Sum.arrayPlusArray(new int[]{100, 200, 300}, new int[]{400, 500, 600}));
    }

    private static class Sum {
        public static int arrayPlusArray(int[] arr1, int[] arr2) {
            int sum = 0;
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i] + arr2[i];
            }
            return sum;
        }

        }
    }


