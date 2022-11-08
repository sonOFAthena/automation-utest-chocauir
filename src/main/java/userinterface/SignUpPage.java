package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignUpPage {

    //Stage 1
    public static final Target BUTTON_SIGNUP = Target.the("button that shows us the form to sign up")
            .located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target INPUT_FIRSTNAME = Target.the("input firstname")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("input lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("input email")
            .located(By.id("email"));

    public static final Target SELECT_DAY = Target.the("select the month of birth ")
            .located(By.xpath("//select[@id='birthDay']"));

    public static final Target SELECT_MONTH = Target.the("select the day of birth")
            .located(By.xpath("//select[@id='birthMonth']"));

    public static final Target SELECT_YEAR = Target.the("select the year of birth")
            .located(By.xpath("//select[@id='birthYear']"));

    public static final Target INPUT_LANGUAGE = Target.the("select the spoken language")
            .located(By.xpath("//div[@id='languages']//div//input"));

    public static final Target BUTTON_NEXT = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));

    //stage 2
    public static final Target DROPDOWN_COUNTRY = Target.the("button to get the next form")
            .located(By.xpath("//div[contains(text(),'Colombia')]"));

    public static final Target INPUT_CITY = Target.the("button to get the next form")
            .located(By.id("city"));

    public static final Target DROPDOWN_CITY = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Medellin, Antioquia, Colombia')]"));

    public static final Target INPUT_ZIPCODE = Target.the("button to get the next form")
            .located(By.id("zip"));

    public static final Target BUTTON_NEXT2 = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    //stage 3

    public static final Target DIV_MOBILE = Target.the("button to get the next form")
            .located(By.xpath("//div[@name='handsetMakerId']/div[1]"));

    public static final Target INPUT_MOBILE = Target.the("button to get the next form")
            .located(By.xpath("//div[@name='handsetMakerId']//input[@type='search']"));

    public static final Target DROPDOWN_MOBILE = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Huawei')]"));

    public static final Target DIV_MODEL = Target.the("button to get the next form")
            .located(By.xpath("//div[@name='handsetModelId']/div[1]"));

    public static final Target INPUT_MODEL = Target.the("button to get the next form")
            .located(By.xpath("//div[@name='handsetModelId']//input[@type='search']"));

    public static final Target DROPDOWN_MODEL = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Y9s')]"));

    public static final Target DIV_OS = Target.the("button to get the next form")
            .located(By.xpath("//div[@name='handsetOSId']/div[1]"));

    public static final Target INPUT_OS = Target.the("button to get the next form")
            .located(By.xpath("//div[@name='handsetOSId']//input[@type='search']"));

    public static final Target DROPDOWN_OS = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Android 10')]"));

    public static final Target BUTTON_NEXT3 = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    // stage 4
    public static final Target INPUT_PASSWORD = Target.the("button to get the next form")
            .located(By.id("password"));

    public static final Target INPUT_CPASSWORD = Target.the("button to get the next form")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERMS = Target.the("button to get the next form")
            .located(By.id("termOfUse"));

    public static final Target CHECKBOX_PRIVACY = Target.the("button to get the next form")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_COMPLETE = Target.the("button to get the next form")
            .located(By.xpath("//span[contains(text(),'Complete Setup')]"));

    public static final Target REGISTRATION_COMPLETE = Target.the("extrae el nombre del curso")
            .located(By.xpath("//h1[text()=concat('Welcome to the world',\"'\",'s largest community of freelance software testers!')]"));
}
