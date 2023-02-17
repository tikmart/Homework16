import java.io.*;

public class Letters {

    private Reader reader = null;
    private Writer writer = null;

    public void aWriter(String sourceFile, String newFile) {


        try {
            reader = new FileReader(sourceFile);
            writer = new FileWriter(newFile);
            int i;

            while ((i = reader.read()) != -1) {
                if ((char) i == 'a') {
                    writer.write((char) i);
                }
            }
            writer.flush();

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void vowels(String sourceFile, String vowelFile) {
        try {
            reader = new FileReader(sourceFile);
            writer = new FileWriter(vowelFile);
            int i;

            while ((i = reader.read()) != -1) {
                boolean checker;

                switch ((char) i) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        checker = true;
                        break;
                    default:
                        checker = false;
                }
                if (checker) {
                    writer.write((char) i);
                }
            }
            writer.flush();

            reader.close();
            writer.close();

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }


}
