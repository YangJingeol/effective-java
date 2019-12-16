package Item5;

import java.util.List;
import java.util.Objects;

public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Lexicon lexicon = new TestDictionary();

        SpellChecker spellChecker = new SpellChecker(lexicon);
        spellChecker.isValid("hello");
    }
}

interface Lexicon {}

class KoreanDictionary implements Lexicon{ }
class TestDictionary implements Lexicon{ }