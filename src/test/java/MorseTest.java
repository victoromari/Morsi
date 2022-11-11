import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseTest {

    @Test
    void lookup() {
        String expectedA = ".-";
        assertEquals(expectedA, Morse.lookup('a'),"That's not a man...");

        String expectedB ="-...";
        assertEquals(expectedB, Morse.lookup('b'),"That's not b man.. ");

        String expectedC ="-.-.";
        assertEquals(expectedC, Morse.lookup('c'),"That's is not c.");

        String expectedD ="-..";
        assertEquals(expectedD, Morse.lookup('d'),"That's not d man.");

        String expectedE =".";
        assertEquals(expectedE, Morse.lookup('e'),"That's not e man..");

        String expectedF ="..-.";
        assertEquals(expectedF, Morse.lookup('f'),"That's not f man..");

        String expectedG ="--.";
        assertEquals(expectedG, Morse.lookup('g'),"That's not g man..");

        String expectedH ="....";
        assertEquals(expectedH, Morse.lookup('h'),"That's not h man..");

        String expectedI ="..";
        assertEquals(expectedI, Morse.lookup('i'),"That's not i man..");

        String expectedJ =".---";
        assertEquals(expectedJ, Morse.lookup('j'),"That's not j man..");

        String expectedK ="-.-";
        assertEquals(expectedK, Morse.lookup('k'),"That's not  k man");

        String expectedL =".-..";
        assertEquals(expectedL, Morse.lookup('l'), "That's not l man..");

        String expectedM ="--";
        assertEquals(expectedM, Morse.lookup('m'), "That's not m man..");

        String expectedN ="-.";
        assertEquals(expectedN, Morse.lookup('n'), "That's not a n man..");

        String expectedO ="---";
        assertEquals(expectedO, Morse.lookup('o'), "That's not o man..");

        String expectedP =".--.";
        assertEquals(expectedP, Morse.lookup('p'), "That's not a p..");

        String expectedQ ="--.-";
        assertEquals(expectedQ, Morse.lookup('q'),"That's not q man..");

        String expectedR =".-.";
        assertEquals(expectedR, Morse.lookup('r'),"That's not r man..");

        String expectedS ="...";
        assertEquals(expectedS, Morse.lookup('s'),"That's not s man..");

        String expectedT ="-";
        assertEquals(expectedT, Morse.lookup('t'),"That's not t man..");

        String expectedU ="..-";
        assertEquals(expectedU, Morse.lookup('u'),"That's not u man..");

        String expectedV ="...-";
        assertEquals(expectedV, Morse.lookup('v'), "That's not v man..");

        String expectedW =".--";
        assertEquals(expectedW, Morse.lookup('w'),"That's not a w man..");

        String expectedX ="-..-";
        assertEquals(expectedX, Morse.lookup('x'),"That's not a x man..");

        String expectedY ="-.--";
        assertEquals(expectedY, Morse.lookup('y'),"That's not a y man..");

        String expectedZ ="--..";
        assertEquals(expectedZ, Morse.lookup('z'),"That's not z man..");

        String expected0 ="-----";// 0
        assertEquals(expected0, Morse.lookup('0'),"That's not 0 man..");

        String expected1 =".----";
        assertEquals(expected1, Morse.lookup('1'),"That's not 1 man..");

        String expected2 ="..---";
        assertEquals(expected2, Morse.lookup('2'),"That's not 2 man..");

        String expected3 ="...--";
        assertEquals(expected3, Morse.lookup('3'),"That's not 3 man..");

        String expected4 ="....-";
        assertEquals(expected4, Morse.lookup('4'),"That's not a 4 man..");

        String expected5 =".....";
        assertEquals(expected5, Morse.lookup('5'), "That's not 5 man..");

        String expected6 ="-....";
        assertEquals(expected6, Morse.lookup('6'),"That's not a 6 man..");

        String expected7 ="--...";
        assertEquals(expected7, Morse.lookup('7'), "That's not a 7 man..");

        String expected8 ="---..";
        assertEquals(expected8, Morse.lookup('8'),"That's not a 8 man..");

        String expected9 ="----.";
        assertEquals(expected9, Morse.lookup('9'),"That's is not 9 man..");
    }

    @Test
    void encode() {
    }
}