package android.TestCases;

import BaseConfig.SettingAndroidEnv;
import Utility.TestUtils;
import android.PageObject.APIDemosPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class APIDemoTaskTest extends SettingAndroidEnv {
    APIDemosPage APIDemosPage;
    TestUtils test;
    @BeforeClass
    public void setUp() {
        APIDemosPage = new APIDemosPage(driver);
        test = new TestUtils(driver);
    }

    @Test(testName = "PerformLongPress", description = "Verifying User Long Press Menu Popup")
    public void test01() {
        APIDemosPage.UserLongPressMenuValidation();
    }

    @Test(testName = "PerformDragAndDrop", description = "Verifying User Drag And Drop Element")
    public void test02() {
        APIDemosPage.UserDragAndDropValidationTest();
    }
}

