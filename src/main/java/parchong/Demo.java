package parchong;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Demo {
	public static void main(String[] args) throws Exception {
		//Connection connect = Jsoup.connect("https://s.taobao.com/search?q=%E6%89%8B%E6%9C%BA&imgfile=&commend=all&ssid=s5-e&search_type=item&sourceId=tb.index&spm=a21bo.2017.201856-taobao-item.1&ie=utf8&initiative_id=tbindexz_20170306");
		Connection connect = Jsoup.connect("https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&wq=%E6%89%8B%E6%9C%BA&pvid=18825b71bde5472494c54020c7f0310c");
		Document document = connect.get();
		System.out.println(document.toString());
		Elements elementsByClass = document.getElementsByClass("goodswrap promotion");
		System.out.println(elementsByClass.size());
		for(int i=0;i<elementsByClass.size();i++) {
			System.out.println(i);
		}
		
	}
}
