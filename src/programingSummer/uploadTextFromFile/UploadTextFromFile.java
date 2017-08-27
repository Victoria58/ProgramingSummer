package programingSummer.uploadTextFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UploadTextFromFile {

    /**
     *Метод для считывания текста из файла. Создает BufferedReader, проверяет текст, по строкам, если строка
     * не пустая, то переписывает её в StringBuilder. В конце переводит
     * StringBuilder в строку и закрывает BufferedReader.
     */
        public static String readFile (String fileName) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append("\n");
                    line = br.readLine();
                }
                return sb.toString();
            } finally {
                br.close();
            }
        }

}
