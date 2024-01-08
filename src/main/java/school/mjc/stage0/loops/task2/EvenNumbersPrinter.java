package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int startingNumber = 0;

        while (startingNumber <= printTillInclusive){
            if (startingNumber % 2 == 0){
                System.out.println(startingNumber);
                startingNumber++;
            } else {
                startingNumber++;
            }
        }
    }
}
