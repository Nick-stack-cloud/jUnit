package tasks;

public class Task01 {
    public static String tsk1(int[] vector) {
        if (vector.length <= 1) {
            return "Плохой вектор";
        }
        boolean flag = true;
        String answer = "Элементы упорядочены";
        for (int i = 0; i < vector.length - 1; i++) {
            if (vector[i] > vector[i + 1]) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] < vector[i + 1]) {
                    answer = "Элементы не упорядочены";
                    break;
                }
            }
        }
        return answer;
    }

}
