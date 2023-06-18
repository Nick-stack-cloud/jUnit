package controller;

import tasks.*;

public class Main {
    public static void main(String[] args) {

        int[] vector = {1, 1, 5, 5, 5, 5, 1, 1, 0, 2};

        System.out.println(Task01.tsk1(vector));
        System.out.println(Task02.tsk2(vector));
        System.out.println(Task03.tsk3(vector));
        System.out.println(Task04.tsk4(vector));
        System.out.println(Task05.tsk5(vector));
    }
}