package tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task03Test {
    @Test
    public void test() {

        String expected = "Элементы различны";
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String actual = Task03.tsk3(vector);

        assertEquals("Элементы различны", Task03.tsk3(new int[]{1, 1, 2, 2, 3, 3}));
        assertEquals("Элементы различны", Task03.tsk3(new int[]{1, 1, 1, 2, 2, 2}));
        assertEquals("Элементы различны", Task03.tsk3(new int[]{1, 2, 2, 1, 2, 1}));
        assertEquals("Элементы различны", Task03.tsk3(new int[]{1, 2, 2, 2, 2, 2}));
        assertEquals("Элементы различны", Task03.tsk3(new int[]{-1, 1, -2, 2, -3, 3}));
        assertEquals("Элементы одинаковы", Task03.tsk3(new int[]{1, 1, 1, 1, 1, 1}));
        assertEquals("Элементы одинаковы", Task03.tsk3(new int[]{-1, -1, -1, -1, -1, -1}));
        assertEquals("Элементы одинаковы", Task03.tsk3(new int[]{1, 1}));
        assertEquals("Элементы одинаковы", Task03.tsk3(new int[]{7, 7, 7}));
        assertEquals("Плохой вектор", Task03.tsk3(new int[0]));

    }

}
