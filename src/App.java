import programingSummer.stringExtractor.StringExtractor;
import programingSummer.uploadTextFromFile.UploadTextFromFile;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
/**
 *Берет строку из файла, с помощью метода readFile класса UploadTextFromFile, путь которого прописан в скобках.
 */
        String inText = UploadTextFromFile.readFile("TEXT/inText.txt");
        StringExtractor stringExtractor = new StringExtractor();
        stringExtractor.extractString(inText);
    }
}
