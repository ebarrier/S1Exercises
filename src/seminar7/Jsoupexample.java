package seminar7;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Jsoupexample {

	public static String getFirstHeader(String url, String cssSelector) throws IOException {
		Document document = Jsoup.connect(url).get();
		Elements elements = document.select(cssSelector);
		return String.format("%s ::: %s", url, elements.first().text());
	}
	
	public static void main(String[] args) throws IOException {

			System.out.println(getFirstHeader());
	}
}