public class Demo {
    public static void main(String[] args) {

        String sourceFile = "C:\\Files\\File2.txt";
        String aFile = "C:\\Files\\aFile.txt";
        String vowelFile = "C:\\Files\\VowelFile.txt";
        String namePath = "C:\\Files\\Names.txt";

        Letters letters = new Letters();
        letters.aWriter(sourceFile,aFile);



        letters.vowels(sourceFile,vowelFile);

        NameDuplicates nd = new NameDuplicates();

        nd.nameDuplicatePrinter(namePath);




    }
}
