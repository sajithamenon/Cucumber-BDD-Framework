package com.threeothree.framework.base;

import org.openqa.selenium.support.PageFactory;

/**
 * Created by Sajitha on 4/21/2017.
 */
public class Base {

    public static BasePage CurrentPage;
    public <TPage extends BasePage> TPage GetInstance(Class<TPage>page){
        Object obj= PageFactory.initElements(DriverContext.Driver,page);
        return page.cast(obj);



    }





}


