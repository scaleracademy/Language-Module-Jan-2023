package org.example.interfaces;

import java.util.ArrayList;

public class TaskExample {

    interface NumberProgress {
        void onNumber(int number);
    }

    static class NumberSquareTask {
        private ArrayList<Integer> numbers;
        private NumberProgress numberProgress;


        public NumberSquareTask(ArrayList<Integer> numbers, NumberProgress numberProgress) {
            this.numbers = numbers;
            this.numberProgress = numberProgress;
        }

        void square() {
            for (int i = 0; i < numbers.size(); i++) {
                numbers.set(i, numbers.get(i) * numbers.get(i));
                numberProgress.onNumber(numbers.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        NumberSquareTask numberSquareTask = new NumberSquareTask(numbers, new NumberProgress() {
            @Override
            public void onNumber(int number) {
                System.out.println(number);
            }
        });
        numberSquareTask.square();
    }
}
