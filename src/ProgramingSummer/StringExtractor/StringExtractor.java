package ProgramingSummer.StringExtractor;

import java.util.ArrayList;
import java.util.List;

public class StringExtractor {

    public List<Integer> findQuotes(String inText) {

        List<Integer> indexFromText = new ArrayList<>();

        for (int i = 0; i < inText.length(); i++) {

            if (inText.charAt(i) == '"') {

                indexFromText.add(i);
            }
        }
        return indexFromText;
    }

    public List<String> extractString(String inText){

        List<Integer> indexes = findQuotes(inText);
        List<String> extractedStrings = new ArrayList<>();

        for (int i = 0; i < indexes.size(); i=i+2) {

            String s = inText.substring(indexes.get(i),indexes.get(i+1)+1);
            extractedStrings.add(s);
        }


        return extractedStrings;
    }

}
