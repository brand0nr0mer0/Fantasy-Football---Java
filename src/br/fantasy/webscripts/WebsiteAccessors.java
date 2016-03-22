package br.fantasy.webscripts;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

public class WebsiteAccessors {


    public Document getWebsiteResponse(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            return doc;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Elements getWebsiteUrls(Document doc) {
        return doc.select("a[href]");
    }


    public Elements getWebsiteUrls(Elements elements) {
        return elements.select("a[href]");
    }
}
