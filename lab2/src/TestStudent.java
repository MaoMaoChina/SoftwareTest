import java.io.*;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.runner.RunWith;  
import org.junit.runners.Parameterized;  
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestStudent {
  private static WebDriver driver;
  private static String baseUrl;
  public static String[] stdID;
  public static String[] name;
  public static String[] gitURL;
  public  String curtdID;
  public  String curName;
  public  String curgitURL;

  @Parameters
  public static Collection usernameData() throws Exception{
	  String driverPath = "/Users/maomao/Desktop/软件测试/实验二/geckodriver";
	  System.setProperty("webdriver.gecko.driver", driverPath);
	  driver = new FirefoxDriver();
	  baseUrl = "http://121.193.130.195:8800";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get(baseUrl + "/");
	  InputStream is = new FileInputStream("/Users/maomao/Desktop/软件测试/实验二/软件测试名单.xls");
      HSSFWorkbook excel = new HSSFWorkbook(is);
      HSSFSheet sheet = excel.getSheetAt(0);
      stdID = new String[sheet.getLastRowNum()-1];
      name  = new String[sheet.getLastRowNum()-1];
      gitURL = new String[sheet.getLastRowNum()-1];
      for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
    	  HSSFRow row = sheet.getRow(rowNum+2);
    	  if (row == null)
              continue;
    	  HSSFCell cell1 = row.getCell((short) 1);
    	  HSSFCell cell2 = row.getCell((short) 2);
    	  HSSFCell cell3 = row.getCell((short) 3);
    	  stdID[rowNum]  = cell1.getStringCellValue();
    	  name[rowNum]   = cell2.getStringCellValue();
    	  gitURL[rowNum] = cell3.getStringCellValue();    	  
      }
	  Object [] [] bject = new Object [sheet.getLastRowNum()-1][3];
	  for(int i=0; i<sheet.getLastRowNum()-1; i++) {
		  bject[i][0] = stdID[i];
		  bject[i][1] = name[i];
		  bject[i][2] = gitURL[i];
		  
	  }
		return Arrays.asList(bject);
		

	}
  public TestStudent(String curstdID, String curName, String curgitURL) {
	  this.curtdID  =  curstdID;
	  this.curName   =  curName;
	  this.curgitURL =  curgitURL;
	}


  @Test
  public void testStudent() throws Exception {

    	WebElement id = driver.findElement(By.name("id"));
        id.click();
        id.sendKeys(curtdID);
        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys(curtdID.substring(curtdID.length()-6));
        driver.findElement(By.id("btn_login")).click();
        assertEquals(curtdID, driver.findElement(By.id("student-id")).getText());
        assertEquals(curName, driver.findElement(By.id("student-name")).getText());
        assertEquals(curgitURL, driver.findElement(By.id("student-git")).getText());
        driver.findElement(By.id("btn_logout")).click();
        driver.findElement(By.id("btn_return")).click();
  }
}

