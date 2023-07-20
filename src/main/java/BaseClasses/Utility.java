package BaseClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import javax.security.auth.login.ConfigurationSpi;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import configurations.PathConfiguration;

public class Utility {

	public static String reaData(int row, int coll) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(PathConfiguration.excellPath);

		Sheet data1 = WorkbookFactory.create(file).getSheet("sheet1");

		String s1 = data1.getRow(row).getCell(coll).getStringCellValue();

		return s1;

	}

	public static void screenshot(WebDriver driver) throws IOException {

		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		Date d = new Date();

		d.toString().replace(":", "_");

		File dest = new File(PathConfiguration.screenshot);
		FileHandler.copy(source, dest);

	}

}
