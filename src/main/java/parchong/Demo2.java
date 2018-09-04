package parchong;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Demo2 {
	public static void main(String[] args) throws Exception {
		//Connection connect = Jsoup.connect("https://s.taobao.com/search?q=%E6%89%8B%E6%9C%BA&imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1&ie=utf8&initiative_id=tbindexz_20170306");
		Connection connect=Jsoup.connect("https://search.jd.com/Search?keyword=手机&enc=utf-8&pvid=8c98d8a02ec64b1b85649410084d49af");
		Document document = connect.get();
		System.out.println(document.toString());
		Elements select2 = document.select("#J_bottomPage");
		System.out.println(select2.html());
		Elements select = document.select(".gl-item .gl-i-wrap .p-img a");
		for (Element element : select) {
			String attr = element.attr("href");
			//System.out.println(attr);
			
		}
	}
}
