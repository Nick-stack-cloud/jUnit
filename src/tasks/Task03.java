package tasks;

public class Task03 {
    public static String tsk3(int[] vector) {

        if (vector.length <= 1) {
            return "Плохой вектор";
        }
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] != vector[i + 1]) {
                return "Элементы различны";
            }
        }
        return "Элементы одинаковы";
    }
}
