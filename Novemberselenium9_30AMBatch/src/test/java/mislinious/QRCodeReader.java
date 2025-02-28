package mislinious;

import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QRCodeReader 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qrcode.tec-it.com/en");
		String qrcodeurl = driver.findElement(By.xpath("//img[@alt='QR Code']")).getAttribute("src");
		System.out.println(qrcodeurl);
		
		URL url = new URL(qrcodeurl);
		BufferedImage bufferedImage = ImageIO.read(url);
		BufferedImageLuminanceSource ls = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap bbm = new BinaryBitmap(new HybridBinarizer(ls));
		Result valueResult = new MultiFormatReader().decode(bbm);
		System.out.println(valueResult.getText());
	}

}
