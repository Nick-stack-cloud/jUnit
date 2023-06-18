package tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task04Test {
    @Test
    public void test() {

        String expected = "Четные - " + 4 + " Нечетные - " + 5;
        int[] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String actual = Task04.tsk4(vector);

        assertEquals("Четные - " + 0 + " Нечетные - " + 5, Task04.tsk4(new int[]{1, 1, 1, 1, 1}));
        assertEquals("Четные - " + 3 + " Нечетные - " + 2, Task04.tsk4(new int[]{2, 1, 2, 1, 2}));
        assertEquals("Четные - " + 2 + " Нечетные - " + 3, Task04.tsk4(new int[]{-1, 4, -11, 15, 10}));
        assertEquals("Четные - " + 3 + " Нечетные - " + 2, Task04.tsk4(new int[]{0, -3, 0, 15, 2}));
        assertEquals("Четные - " + 1 + " Нечетные - " + 1, Task04.tsk4(new int[]{0, 1}));
        assertEquals("Плохой вектор", Task04.tsk4(new int[0]));

    }

}
