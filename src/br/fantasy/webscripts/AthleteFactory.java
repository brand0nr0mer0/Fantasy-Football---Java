package br.fantasy.webscripts;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Properties;

public class AthleteFactory {

    public Properties properties;


    public AthleteFactory() {
        String currPath = Paths.get(".").toAbsolutePath().normalize().toString();

        try {
            Properties prop = new Properties();
            prop.loadFromXML(new FileInputStream(currPath + "/src/br/fantasy/webscripts/WebsiteUrls.xml"));

            properties = prop;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<String> assembleListOfAllAthletes(String baseUrl) {

        ArrayList<String> characterReplacement = new ArrayList<String>();

        for(char character = 'a'; character <= 'z'; character++) {
            int page = 1;

            while (true) {

                String url = String.format(baseUrl, character, page);

                Document html = WebsiteAccessors.getWebsiteResponse(url);
                //call website accessor to get all links
                //if no links then break;

                Elements result = WebsiteAccessors.getTableByName(html, properties.getProperty("playerListTable"));
                if (result.size() == 0 ) break;

                for (Element element : result.select("tr")) {
                    if (element.select("tr.header.left").isEmpty()) {
                        Elements tds = element.select("td");
                        Element athleteLinkAndName = tds.get(0);
                        String position = tds.get(1).text();
                    }
                }
                page++;
            }
        }

        return characterReplacement;

        }


}
