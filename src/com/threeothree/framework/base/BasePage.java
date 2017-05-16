package com.threeothree.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sajitha on 4/21/2017.
 */
public abstract class BasePage extends Base {
   /* public BasePage() {
        PageFactory.initElements(DriverContext.Driver, this);

    }}*/

    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance) {
        try {
            return (TPage) this;
        } catch (Exception e)

        {
            e.getStackTrace();
        }
        return null;
    }
}
