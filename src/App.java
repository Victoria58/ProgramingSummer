import ProgramingSummer.StringExtractor.StringExtractor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {

        String inText = "\"Xfd? gsdf\"-fd gdf gh-\"fgdf gdf g\".";
        StringExtractor stringExtractor = new StringExtractor();
        stringExtractor.extractString(inText);

/*
        Pattern pattern = Pattern.compile("[\"]");
        Matcher matcher = pattern.matcher(inText);

        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
*/

    }
}
