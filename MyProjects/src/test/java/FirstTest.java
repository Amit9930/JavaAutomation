import com.tmo.pageObjects.navigationTabObjects;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends Abstract{

    @Test
    public void clickOnNavigationTabs() throws InterruptedException {

        // Click on Pricing Tab
        System.out.print(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"| Interactive Brokers");
        navigationTabObjects naviTab = PageFactory.initElements(driver, navigationTabObjects.class);

        naviTab.navTab_pricingTabClicked();
        Thread.sleep(1000);

        naviTab.navTab_productTabClicked();
        Thread.sleep(1000);

        naviTab.navTab_technologyTabClicked();
        Thread.sleep(1000);

        naviTab.navTab_educationTabClicked();
        Thread.sleep(1000);

        naviTab.navTab_aboutIBKRTabClicked();
        Thread.sleep(1000);

        naviTab.navTab_contactUsTabClicked();
        Thread.sleep(1000);
    }
}