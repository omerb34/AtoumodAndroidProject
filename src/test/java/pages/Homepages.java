package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Homepages {
    public Homepages() {

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(25)), this);


    }


@AndroidFindBy(xpath= "(//*[@class='android.widget.TextView'])[1]")

    public MobileElement later;







}
