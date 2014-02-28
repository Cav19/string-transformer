package edu.macalester.comp124.stringtransformer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Valenti on 2/27/14.
 */
public class L33tTest {
    private final StringTransformer capitalizer = new L33tMaker();

    @Test
    public void handlesEmptyString() {
        assertEquals("", capitalizer.transform(""));
    }

    @Test
    public void makesL33t() {
        assertEquals("4", capitalizer.transform("a"));
        assertEquals("z0ngl3", capitalizer.transform("zongle"));
    }
}
