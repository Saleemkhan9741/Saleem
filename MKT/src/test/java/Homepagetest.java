import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.hospitality.amzn.GenericsUtilities.BaseClass;
import com.hospitality.amzn.GenericsUtilities.FileUtilities;
import com.hospitality.mmtrip.pom.Homepage;

public class Homepagetest extends BaseClass {
	FileUtilities futil=new FileUtilities();
	@Test
	public void homepage() throws Throwable {
		Robot r=new Robot();
		String From = futil.getPropertyvalueforkey("from");
		String To= futil.getPropertyvalueforkey("to");
		Homepage h=new Homepage(driver);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		h.Frombox().click();
		h.Fromtxtbox().sendKeys(From);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		h.Totxtbox().sendKeys(To);
		h.Deptbttn().click();
		Thread.sleep(2000);
		h.Dptdate().click();
		h.Searchbttn().click();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='boldFont blackText airlineName']"));
		int count = list.size();
		System.out.println("No of flights from "+From+" to"+To+" is "+count);
	}
}
