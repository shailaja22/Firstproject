package rough;

import java.util.Date;

public class TestTimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
String screenshotName= d.toString().replace(":", "_").replace(" ", "_")+".jpg";
System.out.println(screenshotName);
		System.out.println(d);
	}

}
