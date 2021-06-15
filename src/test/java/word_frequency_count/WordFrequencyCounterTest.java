package word_frequency_count;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void wordCounting() {
        File news = new File("news.txt");
        String expected = "30-nation: 1 China’s: 1 Chinese: 1 Monday: 1 NATO: 1 Western: 1 a: 1 addressed: 1 alliance: 1 ambitions: 1 and: 1 are: 1 armed: 1 be: 1 capabilities: 1 challenges: 1 confrontational: 1 expanding: 1 first: 1 forces: 1 has: 1 in: 1 it: 1 military: 1 must: 1 of: 1 portrayed: 1 potentially: 1 presenting: 1 reach: 1 rising: 1 said: 1 such: 1 that: 1 the: 4 time: 1 way: 1 with: 1";
        Assertions.assertEquals(expected, WordFrequencyCounter.wordCounting(news));
    }
}