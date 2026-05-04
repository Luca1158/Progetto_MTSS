////////////////////////////////////////////////////////////////////
// Luca Brunetta 2147982
// Riccardo Pozzato 2147988
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void testConvertFirstThreeNumbers() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("II", IntegerToRoman.convert(2));
        assertEquals("III", IntegerToRoman.convert(3));
    }
}
