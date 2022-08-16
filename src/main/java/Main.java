import java.io.*;

public class Main {
    private static String originalIBAN;

    public static void main(String[] args) throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        readFromFile();
        validateIban();
    }

    private static void readFromFile() {
        File file = new File("src/main/resources/iban.txt");
        if (!file.exists()) {
            System.out.println("The file doesn't exists!");
            System.exit(1);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/iban.txt"));
            try {
                originalIBAN = bufferedReader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void validateIban() throws IncorrectLengthException, IncorrectIbanAfterModuloException {
        CheckIbanValidity checkIbanValidity = new CheckIbanValidity(originalIBAN);
        checkIbanValidity.CheckValidity();
    }

}