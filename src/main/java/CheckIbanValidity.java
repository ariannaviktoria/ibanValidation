import java.math.BigInteger;

public class CheckIbanValidity {
    private String ibanWithoutSpaces;
    private String numberString;

    public CheckIbanValidity(String ibanWithoutSpaces) {
        this.ibanWithoutSpaces = ibanWithoutSpaces;
    }

    private boolean isCorrectLength() {
        ibanWithoutSpaces = ibanWithoutSpaces.replaceAll(" ","");
        ibanWithoutSpaces = ibanWithoutSpaces.toUpperCase();
        return (ibanWithoutSpaces.length() >= 15 && ibanWithoutSpaces.length() <= 32 && ibanWithoutSpaces.length() != 17);
    }
    private void whichCountry(String originalIban){
        String firstTwoLetter = originalIban.substring(0,2);
        switch (firstTwoLetter) {
            case "AL" -> System.out.print("The IBAN is from Albania ");
            case "AD" -> System.out.print("The IBAN is from Andorra ");
            case "AT" -> System.out.print("The IBAN is from Austria ");
            case "AZ" -> System.out.print("The IBAN is from Azerbaijan ");
            case "BH" -> System.out.print("The IBAN is from Bahrain ");
            case "BY" -> System.out.print("The IBAN is from Belarus ");
            case "BE" -> System.out.print("The IBAN is from Belgium ");
            case "BA" -> System.out.print("The IBAN is from Bosnia and Herzegovina ");
            case "BR" -> System.out.print("The IBAN is from Brazil ");
            case "BG" -> System.out.print("The IBAN is from Bulgaria ");
            case "BI" -> System.out.print("The IBAN is from Burundi ");
            case "CR" -> System.out.print("The IBAN is from Costa Rica ");
            case "HR" -> System.out.print("The IBAN is from Croatia ");
            case "CY" -> System.out.print("The IBAN is from Cyprus ");
            case "CZ" -> System.out.print("The IBAN is from Czech Republic ");
            case "DK" -> System.out.print("The IBAN is from Denmark ");
            case "DO" -> System.out.print("The IBAN is from Dominican Republic ");
            case "EG" -> System.out.print("The IBAN is from Egypt ");
            case "SV" -> System.out.print("The IBAN is from El Salvador ");
            case "EE" -> System.out.print("The IBAN is from Estonia ");
            case "FO" -> System.out.print("The IBAN is from Faroe Islands ");
            case "FI" -> System.out.print("The IBAN is from Finland ");
            case "FR" -> System.out.print("The IBAN is from France ");
            case "GE" -> System.out.print("The IBAN is from Georgia ");
            case "DE" -> System.out.print("The IBAN is from Germany ");
            case "GI" -> System.out.print("The IBAN is from Gibraltar ");
            case "GR" -> System.out.print("The IBAN is from Greece ");
            case "GL" -> System.out.print("The IBAN is from Greenland ");
            case "GT" -> System.out.print("The IBAN is from Guatemala ");
            case "VA" -> System.out.print("The IBAN is from Holy See (the) ");
            case "HU" -> System.out.print("The IBAN is from Hungary ");
            case "IS" -> System.out.print("The IBAN is from Iceland ");
            case "IQ" -> System.out.print("The IBAN is from Iraq ");
            case "IE" -> System.out.print("The IBAN is from Ireland ");
            case "IL" -> System.out.print("The IBAN is from Israel ");
            case "IT" -> System.out.print("The IBAN is from Italy ");
            case "JO" -> System.out.print("The IBAN is from Jordan ");
            case "KZ" -> System.out.print("The IBAN is from Kazakhstan ");
            case "XK" -> System.out.print("The IBAN is from Kosovo ");
            case "KW" -> System.out.print("The IBAN is from Kuwait ");
            case "LV" -> System.out.print("The IBAN is from Latvia ");
            case "LB" -> System.out.print("The IBAN is from Lebanon ");
            case "LY" -> System.out.print("The IBAN is from Libya ");
            case "LI" -> System.out.print("The IBAN is from Liechtenstein ");
            case "LT" -> System.out.print("The IBAN is from Lithuania ");
            case "LU" -> System.out.print("The IBAN is from Luxembourg ");
            case "MT" -> System.out.print("The IBAN is from Malta ");
            case "MR" -> System.out.print("The IBAN is from Mauritania ");
            case "MU" -> System.out.print("The IBAN is from Mauritius ");
            case "MD" -> System.out.print("The IBAN is from Moldova ");
            case "MC" -> System.out.print("The IBAN is from Monaco ");
            case "ME" -> System.out.print("The IBAN is from Montenegro ");
            case "NL" -> System.out.print("The IBAN is from Netherlands ");
            case "MK" -> System.out.print("The IBAN is from North Macedonia ");
            case "NO" -> System.out.print("The IBAN is from Norway ");
            case "PK" -> System.out.print("The IBAN is from Pakistan ");
            case "PS" -> System.out.print("The IBAN is from Palestine ");
            case "PL" -> System.out.print("The IBAN is from Poland ");
            case "PT" -> System.out.print("The IBAN is from Portugal ");
            case "QA" -> System.out.print("The IBAN is from Qatar ");
            case "RO" -> System.out.print("The IBAN is from Romania ");
            case "LC" -> System.out.print("The IBAN is from Saint Lucia ");
            case "SM" -> System.out.print("The IBAN is from San Marino ");
            case "ST" -> System.out.print("The IBAN is from Sao Tome and Principe ");
            case "SA" -> System.out.print("The IBAN is from Saudi Arabia ");
            case "RS" -> System.out.print("The IBAN is from Serbia ");
            case "SC" -> System.out.print("The IBAN is from Seychelles ");
            case "SK" -> System.out.print("The IBAN is from Slovak Republic ");
            case "SI" -> System.out.print("The IBAN is from Slovenia ");
            case "ES" -> System.out.print("The IBAN is from Spain ");
            case "SD" -> System.out.print("The IBAN is from Sudan ");
            case "SE" -> System.out.print("The IBAN is from Sweden ");
            case "CH" -> System.out.print("The IBAN is from Switzerland ");
            case "TL" -> System.out.print("The IBAN is from Timor-Leste ");
            case "TN" -> System.out.print("The IBAN is from Tunisia ");
            case "TR" -> System.out.print("The IBAN is from Turkey ");
            case "UA" -> System.out.print("The IBAN is from Ukraine ");
            case "AE" -> System.out.print("The IBAN is from United Arab Emirates ");
            case "GB" -> System.out.print("The IBAN is from United Kingdom ");
            case "VG" -> System.out.print("The IBAN is from Virgin Islands, British ");
        }

    }
    private void rearrange() {
        for (int i = 0; i < 4; i++) {
            char firstChar = ibanWithoutSpaces.charAt(0);
            ibanWithoutSpaces = ibanWithoutSpaces.substring(1);
            String toEnd = Character.toString(firstChar);
            ibanWithoutSpaces = ibanWithoutSpaces.concat(toEnd);
        }
    }

    private void convertLettersToNumbers() {
        int length = ibanWithoutSpaces.length();
        for (int i = 0; i < length; i++) {
            char currentChar = ibanWithoutSpaces.charAt(i);
            if (Character.isLetter(currentChar)) {
                length++;
                int newChar = currentChar - 55;
                String converted = Integer.toString(newChar);
                String sCurrentChar = Character.toString(currentChar);
                numberString = ibanWithoutSpaces.replaceAll(sCurrentChar, converted);
                ibanWithoutSpaces = numberString;
            }
        }
    }

    private boolean integerModuloIfValid() {
        BigInteger ibanAsInteger = new BigInteger(numberString);
        BigInteger modulo = new BigInteger("97");
        BigInteger result = ibanAsInteger.mod(modulo);
        BigInteger one = new BigInteger("1");
        return result.equals(one);
    }
    public boolean CheckValidity() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        if(!isCorrectLength()){
            throw new IncorrectLengthException("Incorrect length, so the IBAN is invalid.");
        }
        else{
            String saveIban = ibanWithoutSpaces;
            rearrange();
            convertLettersToNumbers();
            if(integerModuloIfValid()){
                whichCountry(saveIban);
                System.out.print("and the IBAN is valid.\n");
                return true;
            }
            else{
                throw new IncorrectIbanAfterModuloException("The IBAN is invalid.");
            }
        }
    }
}
