package src.task_4;

import java.util.ArrayList;

public class ListOfNumbers {
    ArrayList<Double> list = new ArrayList<>();

    public void addNumber(Double number) {
        list.add(number);
    }

    public Double getAverage() {
        Double sum = 0.0;
        for (Double num : list) {
            sum += num;
        }
        return sum / list.size();
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" +
                "list=" + list +
                '}';
    }
}
