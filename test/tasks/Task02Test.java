package tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task02Test {
    @Test
    public void test() {

        String expected = "Элементы не зеркальны";
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String actual = Task02.tsk2(vector);

        assertEquals(expected, actual);
        assertEquals("Элементы не зеркальны", Task02.tsk2(new int[]{1, 2, 3, 4, 5, 6, 7}));
        assertEquals("Элементы не зеркальны", Task02.tsk2(new int[]{1, 2, 3, 4, 1, 2, 3}));
        assertEquals("Элементы не зеркальны", Task02.tsk2(new int[]{1, -2, 34, 4, 3, 25, 1}));
        assertEquals("Элементы не зеркальны", Task02.tsk2(new int[]{1, 26, -3, -4, 13, 2, -1}));
        assertEquals("Элементы не зеркальны", Task02.tsk2(new int[]{1, 1, 3, 4, 1, 1, 1}));
        assertEquals("Элементы зеркальны", Task02.tsk2(new int[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals("Элементы зеркальны", Task02.tsk2(new int[]{-1, 2, -3, 4, -3, 2, -1}));
        assertEquals("Элементы зеркальны", Task02.tsk2(new int[]{1, 1, 1, 1, 1, 1, 1}));
        assertEquals("Элементы зеркальны", Task02.tsk2(new int[]{0, 1, 0, 1, 0, 1, 0}));
        assertEquals("Элементы зеркальны", Task02.tsk2(new int[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals("Плохой вектор", Task02.tsk2(new int[0]));


    }
}

