import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheckIbanValidityTest {
    @Test
    public void correctIban1() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        assertTrue(CheckIbanValidity.checkValidity("BR1500000000000010932840814P2"));
    }

    @Test
    public void correctIban2() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        assertTrue(CheckIbanValidity.checkValidity("BI43220001131012345678912345"));
    }

    @Test
    public void correctIban3() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        assertTrue(CheckIbanValidity.checkValidity("RO66BACX0000001234567890"));
    }

    @Test
    public void correctIban4() {
        assertThrows(IncorrectIbanAfterModuloException.class, ()-> CheckIbanValidity.checkValidity("RO66BACX0000000234567890"), "The IBAN is invalid.");
    }

    @Test
    public void correctIban5() {
        assertThrows(IncorrectIbanAfterModuloException.class, ()-> CheckIbanValidity.checkValidity("MD21EY000000000001234567"), "The IBAN is invalid.");
    }


    @Test
    public void correctIban6() {
        assertThrows(IncorrectIbanAfterModuloException.class, ()-> CheckIbanValidity.checkValidity("HI93116000060000000012345676"),"The IBAN is invalid.");
    }
    @Test
    public void correctIban7() {
        assertThrows(IncorrectLengthException.class, ()-> CheckIbanValidity.checkValidity("DE7551210800"),"Incorrect length, so the IBAN is invalid." );
    }
    @Test
    public void correctIban8() {
        assertThrows(IncorrectIbanAfterModuloException.class, ()-> CheckIbanValidity.checkValidity("FR7630006000011234567890180"),"The IBAN is invalid.");
    }
    @Test
    public void correctIban9() {
        assertThrows(IncorrectIbanAfterModuloException.class, ()-> CheckIbanValidity.checkValidity("DK9521000123456789"), "The IBAN is invalid.");
    }
    @Test
    public void correctIban10() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        assertTrue(CheckIbanValidity.checkValidity("PL10105000997603123456789123"));
    }

}