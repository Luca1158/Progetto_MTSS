////////////////////////////////////////////////////////////////////
// Luca Brunetta 2147982
// Riccardo Pozzato 2147988
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanPrinterTest {
    @Test
    public void testPrintFirstThreeNumbers() {
        assertEquals(
            "  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", 
            RomanPrinter.print(1)
        );
        assertEquals(
            "  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", 
            RomanPrinter.print(2)
        );
        assertEquals(
            "  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", 
            RomanPrinter.print(3)
        );
    }

    @Test
    public void testPrintFirstSixNumbers() {
        assertEquals(
            "  _____  __      __\n |_   _| \\ \\    / /\n   | |    \\ \\  / / \n   | |     \\ \\/ /  \n  _| |_     \\  /   \n |_____|     \\/    \n", 
            RomanPrinter.print(4)
        );
        assertEquals(
            " __      __\n \\ \\    / /\n  \\ \\  / / \n   \\ \\/ /  \n    \\  /   \n     \\/    \n", 
            RomanPrinter.print(5)
        );
        assertEquals(
            " __      __  _____ \n \\ \\    / / |_   _|\n  \\ \\  / /    | |  \n   \\ \\/ /     | |  \n    \\  /     _| |_ \n     \\/     |_____|\n", 
            RomanPrinter.print(6)
        );
    }

    @Test
       public void testPrintFirstTenNumbers() {
           assertEquals(
               " __      __  _____   _____ \n \\ \\    / / |_   _| |_   _|\n  \\ \\  / /    | |     | |  \n   \\ \\/ /     | |     | |  \n    \\  /     _| |_   _| |_ \n     \\/     |_____| |_____|\n", 
               RomanPrinter.print(7)
           );
           assertEquals(
               " __      __  _____   _____   _____ \n \\ \\    / / |_   _| |_   _| |_   _|\n  \\ \\  / /    | |     | |     | |  \n   \\ \\/ /     | |     | |     | |  \n    \\  /     _| |_   _| |_   _| |_ \n     \\/     |_____| |_____| |_____|\n", 
               RomanPrinter.print(8)
           );
           assertEquals(
               "  _____  __   __\n |_   _| \\ \\ / /\n   | |    \\ V / \n   | |     > <  \n  _| |_   / . \\ \n |_____| /_/ \\_\\\n", 
               RomanPrinter.print(9)
           );
           assertEquals(
               " __   __\n \\ \\ / /\n  \\ V / \n   > <  \n  / . \\ \n /_/ \\_\\\n", 
               RomanPrinter.print(10)
           );
       }

       @Test
    public void testPrintFirstTwentyNumbers() {
        assertEquals(
            " __   __ __      __\n \\ \\ / / \\ \\    / /\n  \\ V /   \\ \\  / / \n   > <     \\ \\/ /  \n  / . \\     \\  /   \n /_/ \\_\\     \\/    \n", 
            RomanPrinter.print(15)
        );
        assertEquals(
            " __   __  _____  __   __\n \\ \\ / / |_   _| \\ \\ / /\n  \\ V /    | |    \\ V / \n   > <     | |     > <  \n  / . \\   _| |_   / . \\ \n /_/ \\_\\ |_____| /_/ \\_\\\n", 
            RomanPrinter.print(19)
        );
        assertEquals(
            " __   __ __   __\n \\ \\ / / \\ \\ / /\n  \\ V /   \\ V / \n   > <     > <  \n  / . \\   / . \\ \n /_/ \\_\\ /_/ \\_\\\n", 
            RomanPrinter.print(20)
        );
    }

}
