package lee.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lee.utilities.CommonSteps;
import lee.utilities.Driver;

public class Hooks {

    @Before
    public void setUp() {
        Driver.get();
    }

    @After
    public void tearDown(Scenario scenario) {
        byte[] picture;
        if (scenario.isFailed()) {
            // take screenshot and save it in /failed
            picture = CommonSteps.takeScreenshot("failed/" + scenario.getName());
        } else {
      //       take screenshot and put it in /passed folder
            picture = CommonSteps.takeScreenshot("passed/" + scenario.getName());
        }

        scenario.attach(picture, "image/png", scenario.getName());
        //Driver.closeDriver();
    }






}

