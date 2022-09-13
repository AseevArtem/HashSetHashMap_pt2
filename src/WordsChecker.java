import java.util.HashSet;
import java.util.Set;

public class WordsChecker {

    protected String text;
    protected String word;

    Set<String> set = new HashSet<>();

    public WordsChecker(String text) {
        this.text = text;

        String[] words = text.split("\\P{IsAlphabetic}+");

        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
    }

    public boolean hasWord(String word) {
        this.word = word;
        return set.contains(word);
    }
}
