package tehtävä12;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List album = new LinkedList();
		
		Image img1 = new ProxyImage("img1");
		Image img2 = new ProxyImage("img2");
		Image img3 = new ProxyImage("img3");
		Image img4 = new ProxyImage("img4");		
		album.add(img1);
		album.add(img2);
		album.add(img3);
		album.add(img4);
		
		
		
		for (Image i :(List<Image>) album) {
			i.showData();
		}
		
		for (Image i :(List<Image>) album) {
			i.displayImage();
			i.displayImage();
		}


	}

}
