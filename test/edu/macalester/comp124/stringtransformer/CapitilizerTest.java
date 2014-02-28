package edu.macalester.comp124.stringtransformer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Valenti on 2/27/14.
 */
public class CapitilizerTest {
    private final StringTransformer capitalizer = new Capitilizer();

    @Test
    public void capitalizesFirstLetter() {
        assertEquals("A", capitalizer.transform("a"));
        assertEquals("Zongle", capitalizer.transform("zongle"));
    }
}
