package android.PageObject;

import Utility.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    int pause_Short = 1;
    int pause_long = 2;
    int pause_extended = 3;

    public AndroidDriver driver;

    TestUtils testUtils;

    public HomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        testUtils = new TestUtils(driver);

    }

    /**
     * Our Elements Will Be Stored Here.
     */

    @FindBy(xpath = "//android.widget.ScrollView[@content-desc=\"Home-screen\"]/android.view.ViewGroup/android.widget.ImageView[1]")
    WebElement robotIcon;



    /**
     * We wil create our functions here.
     */

    public void test(){

    }
}
