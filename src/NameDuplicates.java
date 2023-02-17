import java.io.*;

public class NameDuplicates {
    private InputStream inputStream = null;
    private BufferedInputStream bufferedInputStream = null;

    public void nameDuplicatePrinter(String path){
        try{
            inputStream = new FileInputStream(path);
            bufferedInputStream = new BufferedInputStream(inputStream);

            String content = new String(bufferedInputStream.readAllBytes());

            String[] arr = content.split(" ");

            for(int i = 0; i < arr.length; i++){
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].equals(arr[j])) {
                        System.out.println(arr[i]);
                        break;
                    }

                }
            }

        } catch(IOException e){
            e.printStackTrace();
        }
    }

}
