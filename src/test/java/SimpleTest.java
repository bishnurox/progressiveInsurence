import ProgressivePage.StartPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SimpleTest {

      // public static <terminate> void main(String[] args) throws IOException, InterruptedException {

      @Test
      public void test() throws InterruptedException, IOException {

            ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/all_test.html");
            ExtentReports extent = new ExtentReports();
            extent.attachReporter(reporter);
            ExtentTest logger = extent.createTest("Progressive page ");
            logger.log(Status.INFO, "filling form of progressive page");
            logger.log(Status.PASS, " its passed all everything is excuting properly");
            extent.flush();


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.progressive.com/#");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);


            StartPage startPage = new StartPage(driver);
            startPage.setSelectingAuto();
            startPage.setSlectingZipCode("40511");
            startPage.setStartAQuote();
            Thread.sleep(1000);


// filling form of first page

            startPage.setFirstName("krishna");
            startPage.setLastName("Bahadur");
            startPage.setDateOfBirth("01/25/1958");
            startPage.setSuffix(3);
            Thread.sleep(1000);
            startPage.setStreetName("586 estrella drive");


            File Screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot\\image1.png"));
            Thread.sleep(1000);
            startPage.setStartMyQuote();
            Thread.sleep(3000);


            // second page test
            startPage.setSelectYear("2016");
            Thread.sleep(500);
            startPage.setSelectModel("Nissan");
            Thread.sleep(500);
            startPage.setSelectMake("Rogue");
            Thread.sleep(500);
            startPage.setBodyType("SUV (4CYL 4X2)");
            Thread.sleep(500);
            startPage.setPrimaryUse(2);
            Thread.sleep(500);
            startPage.setOwnOrLease(2);
            startPage.setHowLong(2);
            startPage.setHowLong(4);
            Thread.sleep(500);
            startPage.setPrimaryGaraging();
            Thread.sleep(500);
            startPage.setEquippedDevice();
            Thread.sleep(500);
            startPage.setHasBlindSpots();
            Thread.sleep(500);

            File Screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot1, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot/image2.png"));
            Thread.sleep(1000);

            startPage.setNextPage();
            Thread.sleep(1000);
            startPage.setGoToOther();
            Thread.sleep(1000);
            Thread.sleep(1000);
            startPage.setSelectGender();
            Thread.sleep(1000);
            startPage.setMaritualStatus(2);
            Thread.sleep(500);
            startPage.setLevelOfEducation(2);
            Thread.sleep(500);
            startPage.setEmployeeStatus(3);
            Thread.sleep(500);
            startPage.setPrimaryResidence(1);
            Thread.sleep(500);
            startPage.setMoovedIn(1);
            Thread.sleep(500);
            startPage.setLicenceStatus(2);
            Thread.sleep(1000);
            startPage.setYearLicensed(1);
            Thread.sleep(500);
            startPage.setHadClaims();
            Thread.sleep(500);
            startPage.setTicketOrVoilation();
            Thread.sleep(500);

            File Screenshot2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot2, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot\\image3.png"));
            Thread.sleep(1000);

            startPage.setClickNext();
            Thread.sleep(1000);
            //startPage.setDriverImprovement();
            Thread.sleep(500);
            startPage.setContinueNext();
            Thread.sleep(1000);


            //fourth page spouse details
            Thread.sleep(1000);
            startPage.setSpouseFirstName("radha");
            Thread.sleep(500);
            startPage.setSpouseGender();
            Thread.sleep(500);
            startPage.setSpouseDateOfBirth("02/04/1987");
            Thread.sleep(500);
            startPage.setPersonOnThePolicy();
            Thread.sleep(500);
            startPage.setSpouseEducation(2);
            Thread.sleep(500);
            startPage.setSpouseEmployeeStatus(3);
            Thread.sleep(500);
            startPage.setSpouseLicenseStatus(0);
            Thread.sleep(500);
            startPage.setSpouseYearLicenced(1);
            Thread.sleep(500);
            startPage.setSpouseArmy();
            Thread.sleep(500);
            startPage.setSpouseClaims();
            Thread.sleep(500);
            startPage.setSpouseTicket();
            Thread.sleep(500);

            File Screenshot3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot3, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot\\image4.png"));
            Thread.sleep(1000);

            startPage.setSpouseNextPage();
            Thread.sleep(3000);
            startPage.setSemiFinalpage();
            Thread.sleep(3000);
            startPage.setPersonalPageNext();
            Thread.sleep(3000);
            startPage.setsNext();
            Thread.sleep(3000);

            /// final detail page
            startPage.setHaveAutoInsurence();
            Thread.sleep(500);
            startPage.setCurrentCompany(2);
            Thread.sleep(500);
            startPage.setInjuryLimits(2);
            Thread.sleep(500);
            startPage.setPolicyWithProgressive();
            Thread.sleep(500);
            startPage.setHadAuto();
            Thread.sleep(500);
            startPage.setStartPolicy("01/28/2021");
            Thread.sleep(500);
            startPage.setEmailAddress("cthebot@yahoo.com");
            Thread.sleep(1000);
            startPage.setHousehold(1);
            Thread.sleep(1000);
            startPage.setInjuryClaims(0);
            Thread.sleep(1000);

            File Screenshot4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot4, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot\\image5.png"));
            Thread.sleep(1000);

            startPage.setGoNext();
            Thread.sleep(3000);
            startPage.setSnapShot();
            Thread.sleep(5000);
            startPage.setFinalClick();
            Thread.sleep(3000);
            startPage.setNoThanks();
            Thread.sleep(3000);

            File Screenshot5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot5, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot\\image6.png"));
            Thread.sleep(1000);

            startPage.setFinalButton();
            Thread.sleep(1000);

            File Screenshot6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(Screenshot6, new File("C:\\Users\\bishn\\IdeaProjects\\progressiveInsurence\\Screenshot\\image6.png"));
            Thread.sleep(1000);
      }


}






