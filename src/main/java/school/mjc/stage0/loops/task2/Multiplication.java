package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive){
        int i = 0;

        if (multiplyByAndToInclusive > i){
            while (i <= multiplyByAndToInclusive) {
                int result = i * multiplyByAndToInclusive;
                System.out.println(result);
                i += 1;}
        } else if (multiplyByAndToInclusive < i) {
            while (i >= multiplyByAndToInclusive) {
                int result = i * multiplyByAndToInclusive;
                System.out.println(-result);
                i--;}
        }

    }

}


