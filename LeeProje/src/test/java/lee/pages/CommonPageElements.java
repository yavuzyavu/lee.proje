package lee.pages;


import org.openqa.selenium.support.PageFactory;
import lee.utilities.Driver;

public abstract class CommonPageElements extends Driver {

    public CommonPageElements() {
        PageFactory.initElements(driver,this);
    }

}
