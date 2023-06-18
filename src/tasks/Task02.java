package tasks;

public class Task02 {

    public static String tsk2(int[] vector) {

        if (vector.length <= 2) {
            return "Плохой вектор";
        }
        int mid = vector.length / 2;
        for (int i = 0; i < (vector.length / 2) + 1; i++) {
            if (vector[mid - 1] != vector[mid + 1]) {
                return "Элементы не зеркальны";
            }
        }
        return "Элементы зеркальны";
    }
}
