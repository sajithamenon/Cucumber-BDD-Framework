package testCases;

import com.threeothree.framework.cofig.Settings;
import com.threeothree.test.features.pages.LoginPage;
import com.threeothree.test.steps.Testinitialise;

import org.testng.annotations.Test;


/**
 * Created by Sajitha on 4/24/2017.
 * Refer Section4,Video 24
 */
public class LoginTest extends Testinitialise {
    @Test
    public void Open() throws InterruptedException {

   CurrentPage=GetInstance(LoginPage.class);

     CurrentPage.As(LoginPage.class).login(Settings.UserName,Settings.Password);

       Thread.sleep((3000));


        System.out.println("Pass");

    }

    }

