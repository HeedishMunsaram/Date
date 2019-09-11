import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 */

/**
 * @author Andish
 *
 */
public class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dNow = new Date( );
		SimpleDateFormat ft = new SimpleDateFormat("E dd.MM.yyyy 'at' hh:mm:ss");
		
		
		System.out.println("Current Date: " + ft.format(dNow));
	}

}
