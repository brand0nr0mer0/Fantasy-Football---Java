package br.fantasy.webscripts;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebsiteAccessors {


    public static Document getWebsiteResponse(String url) {
        try {
            Document doc = Jsoup.connect(url).userAgent("Chrome").get();
            return doc;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Elements getTableByName(Document html, String tableName) {
        return html.select("table." + tableName);
    }

}
