package android.PageObject;

import Utility.TestUtils;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosPage {
    int pause_Short = 1;
    int pause_long = 2;
    int pause_extended = 3;

    public AndroidDriver driver;

    TestUtils testUtils;

    public APIDemosPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        testUtils = new TestUtils(driver);

    }

    /**
     * Our Elements Will Be Stored Here.
     */

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Views\"]")
    WebElement viewMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"API Demos\"]")
    WebElement titleText;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
    WebElement expandableListMenu;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
    WebElement customAdapterMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"People Names\"]")
    WebElement peopleNameMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Dog Names\"]")
    WebElement dogsNameMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Cat Names\"]")
    WebElement catNameMenu;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Fish Names\"]")
    WebElement fishNameMenu;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sample menu\"]")
    WebElement sampleMenu;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"Sample action\"]")
    WebElement sampleActionMenu;

    @FindBy(xpath = "//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_1\"]")
    WebElement dragSource;

    @FindBy(xpath = "//android.view.View[@resource-id=\"io.appium.android.apis:id/drag_dot_2\"]")
    WebElement dragTarget;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"io.appium.android.apis:id/drag_result_text\"]")
    WebElement successfulDragAndDropMessage;







    /**
     * We wil create our functions here.
     */

    public void UserLongPressMenuValidation(){
        testUtils.wait(1);
        testUtils.elementIsDisplayed(titleText, 20);
        testUtils.assertText(titleText, "API Demos");
        testUtils.scrollToSectionWithText("Views");
        testUtils.elementIsDisplayed(viewMenu, 20);
        testUtils.assertText(viewMenu, "Views");
        testUtils.clickingOnElement(viewMenu);
        testUtils.waitForElementInVisibility(viewMenu, 20);
        testUtils.scrollToSectionWithText("Expandable Lists");
        testUtils.clickingOnElement(expandableListMenu);
        testUtils.waitForElementInVisibility(expandableListMenu, 20);
        testUtils.elementIsDisplayed(customAdapterMenu, 20);
        testUtils.scrollToSectionWithText("Expandable Lists");
        testUtils.clickingOnElement(customAdapterMenu);
        testUtils.waitForElementInVisibility(customAdapterMenu, 20);
        testUtils.elementIsDisplayed(peopleNameMenu, 20);
        testUtils.longPressOnElement(peopleNameMenu);
        testUtils.elementIsDisplayed(sampleMenu, 20);
        testUtils.assertText(sampleMenu, "Sample menu");
        testUtils.elementIsDisplayed(sampleActionMenu, 20);
        testUtils.assertText(sampleActionMenu, "Sample action");
        testUtils.pressBack();
        testUtils.waitForElementInVisibility(sampleMenu, 20);
        testUtils.waitForElementInVisibility(sampleActionMenu, 20);
        testUtils.pressBack();
        testUtils.pressBack();
    }

    public void UserDragAndDropValidationTest() {
        testUtils.clickAfterScroll("Drag and Drop");
        testUtils.wait(1);
        testUtils.elementIsDisplayed(dragSource, 20);
        testUtils.elementIsDisplayed(dragTarget, 20);
        testUtils.dragAndDrop(dragTarget,dragSource);
        testUtils.elementIsDisplayed(successfulDragAndDropMessage, 20);
        testUtils.verifyText(successfulDragAndDropMessage, "Dropped!");
        testUtils.wait(2);
        testUtils.clickingOnElement(expandableListMenu);

        testUtils.wait(1);
    }
}
