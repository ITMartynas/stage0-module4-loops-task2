package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        StringBuilder phrase = new StringBuilder();

        while (i < chars.length){
            phrase.append(chars[i]);
            i++;
        }

        System.out.print(phrase);
    }
}
