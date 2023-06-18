package tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task01Test {
    @Test
    public void test() {

        String expected = "Элементы не упорядочены";
        int[] vector = {1, 3, 4, 3, 5, 1, 7, 5, 9};
        String actual = Task01.tsk1(vector);

        assertEquals(expected, actual);
        assertEquals("Элементы не упорядочены", Task01.tsk1(new int[]{1, 2, 4, 5, 3, 1}));
        assertEquals("Элементы не упорядочены", Task01.tsk1(new int[]{-1, -2, 3, 0, 2, 1}));
        assertEquals("Элементы не упорядочены", Task01.tsk1(new int[]{-9, 0, 4, -5, 4, 12}));
        assertEquals("Элементы не упорядочены", Task01.tsk1(new int[]{10, 9, 8, 6, 7, 5}));
        assertEquals("Элементы не упорядочены", Task01.tsk1(new int[]{15, 21, 3, 2, 0, -1}));
        assertEquals("Элементы упорядочены", Task01.tsk1(new int[]{1, 2, 3, 4, 5, 6}));
        assertEquals("Элементы упорядочены", Task01.tsk1(new int[]{-5, -2, 0, 3, 11, 19}));
        assertEquals("Элементы упорядочены", Task01.tsk1(new int[]{-1, 2, 14, 21, 22, 90}));
        assertEquals("Элементы упорядочены", Task01.tsk1(new int[]{15, 12, 9, 7, 2, 1}));
        assertEquals("Элементы упорядочены", Task01.tsk1(new int[]{21, 18, 13, 10, -1, -6}));
        assertEquals("Элементы упорядочены", Task01.tsk1(new int[]{-1, -3, -4, -10, -11, -20}));
        assertEquals("Плохой вектор", Task01.tsk1(new int[0]));

    }

}
