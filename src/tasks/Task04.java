package tasks;

public class Task04 {
    public static String tsk4(int[] vector) {
        int chet = 0;
        int nechet = 0;
        if (vector.length < 1) {
            return "Плохой вектор";
        }
        for (int j : vector) {
            if (j % 2 == 0) {
                chet++;
            } else nechet++;
        }
        return "Четные - " + chet + " Нечетные - " + nechet;
    }
}
