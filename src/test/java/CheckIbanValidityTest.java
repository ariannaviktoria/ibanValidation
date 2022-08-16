import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckIbanValidityTest {
    @Test
    public void correctIban1() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        var checkIbanValidity = new CheckIbanValidity("BR1500000000000010932840814P2");
        assertTrue(checkIbanValidity.CheckValidity());
    }

    @Test
    public void correctIban2() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        var checkIbanValidity2 = new CheckIbanValidity("BI43220001131012345678912345");
        assertTrue(checkIbanValidity2.CheckValidity());
    }

    @Test
    public void correctIban3() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        var checkIbanValidity3 = new CheckIbanValidity("RO66BACX0000001234567890");
        assertTrue(checkIbanValidity3.CheckValidity());
    }

    @Test
    public void correctIban4() {
        var checkIbanValidity4 = new CheckIbanValidity("RO66BACX0000000234567890");
        //assertFalse(checkIbanValidity4.CheckValidity());
        assertThrows(IncorrectIbanAfterModuloException.class, checkIbanValidity4::CheckValidity);

    }

    @Test
    public void correctIban5() {
        var checkIbanValidity5 = new CheckIbanValidity("MD21EY000000000001234567");
        //assertFalse(checkIbanValidity5.CheckValidity());
        assertThrows(IncorrectIbanAfterModuloException.class, checkIbanValidity5::CheckValidity);
    }


    @Test
    public void correctIban6() {
        var checkIbanValidity6 = new CheckIbanValidity("HI93116000060000000012345676");
        assertThrows(IncorrectIbanAfterModuloException.class, checkIbanValidity6::CheckValidity);
        //assertFalse(checkIbanValidity6.CheckValidity());
    }
    @Test
    public void correctIban7() {
        var checkIbanValidity7 = new CheckIbanValidity("DE7551210800");
        //assertFalse(checkIbanValidity7.CheckValidity());
        assertThrows(IncorrectLengthException.class, checkIbanValidity7::CheckValidity);
    }
    @Test
    public void correctIban8() {
        var checkIbanValidity8 = new CheckIbanValidity("FR7630006000011234567890180");
        //assertFalse(checkIbanValidity8.CheckValidity());
        assertThrows(IncorrectIbanAfterModuloException.class, checkIbanValidity8::CheckValidity);
    }
    @Test
    public void correctIban9() {
        var checkIbanValidity9 = new CheckIbanValidity("DK9521000123456789");
        //assertFalse(checkIbanValidity9.CheckValidity());
        assertThrows(IncorrectIbanAfterModuloException.class, checkIbanValidity9::CheckValidity);
    }
    @Test
    public void correctIban10() {
        var checkIbanValidity10 = new CheckIbanValidity("AZ77VTBA00000000001234567891");
        //assertFalse(checkIbanValidity10.CheckValidity());
        assertThrows(IncorrectIbanAfterModuloException.class, checkIbanValidity10::CheckValidity);
    }

}