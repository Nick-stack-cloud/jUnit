package tasks;

import java.util.Arrays;

public class Task05 {

    public static String tsk5(int[] vector) {

        String marks = Arrays.toString(vector);
        if(vector.length<1) return "Где оценки?";
        int A = 0; int B = 0; int C = 0; int D = 0; int E = 0; int F = 0;
        for (int j : vector) {
            if (j < 0 || j > 5) return "Некоррекстно заданы оценки";
            if (j == 5) A++; if (j == 4) B++; if (j == 3) C++;
            if (j == 2) D++; if (j == 1) F++; if (j == 0) E++;
        }
        return
                "Обработка результатов экзамена\n" + "Исходные оценки: " + marks + "\nРезультаты экзамена:\n" +
                        "пятерок - " + (100 * A) / vector.length + "% (" + A + ")\n" +
                        "четверок - " + (100 * B) / vector.length + "% (" + B + ")\n" +
                        "троек - " + (100 * C) / vector.length + "% (" + C + ")\n" +
                        "двоек - " + (100 * D) / vector.length + "% (" + D + ")\n" +
                        "единиц - " + (100 * F) / vector.length + "% (" + F + ")\n" +
                        "нулей - " + (100 * E) / vector.length + "% (" + E + ")";
    }
}
