package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.SignUpPage;
import util.Birthday;

public class SignUp implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strBirthDate;
    private String strLanguage;
    private String strCountry;
    private String strCity;
    private String strCityDetail;
    private String strZipCode;
    private String strCellphone;
    private String strModelPhone;
    private String strSystem;
    private String strPassword;

    public SignUp(String strName, String strLastName, String strEmail, String strBirthDate, String strLanguage, String strCountry, String strCity, String strCityDetail, String strZipCode, String strCellphone, String strModelPhone, String strSystem, String strPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthDate = strBirthDate;
        this.strLanguage = strLanguage;
        this.strCountry = strCountry;
        this.strCity = strCity;
        this.strCityDetail = strCityDetail;
        this.strZipCode = strZipCode;
        this.strCellphone = strCellphone;
        this.strModelPhone = strModelPhone;
        this.strSystem = strSystem;
        this.strPassword = strPassword;
    }

    public static SignUp onThePage(String strName, String strLastName, String strEmail, String strBirthDate, String strLanguage, String strCountry, String strCity, String strCityDetail, String strZipCode, String strCellphone, String strModelPhone, String strSystem, String strPassword) {
        return Tasks.instrumented(SignUp.class, strName, strLastName, strEmail, strBirthDate, strLanguage,strCountry, strCity, strCityDetail, strZipCode, strCellphone, strModelPhone, strSystem, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //stage 1
                Click.on(SignUpPage.BUTTON_SIGNUP),
                Enter.theValue(strName).into(SignUpPage.INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(SignUpPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(SignUpPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(Birthday.getMonth(strBirthDate)).from(SignUpPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(Birthday.getDay(strBirthDate)).from(SignUpPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(Birthday.getYear(strBirthDate)).from(SignUpPage.SELECT_YEAR),
                JavaScriptClick.on(SignUpPage.INPUT_LANGUAGE),
                Enter.theValue(strLanguage).into(SignUpPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(SignUpPage.INPUT_LANGUAGE),
                Click.on(SignUpPage.BUTTON_NEXT),

                //stage 2
                Click.on(SignUpPage.INPUT_CITY),
                Enter.theValue(strCity).into(SignUpPage.INPUT_CITY),
                Click.on(SignUpPage.DROPDOWN_CITY),
                Click.on(SignUpPage.INPUT_ZIPCODE),
                Enter.theValue(strZipCode).into(SignUpPage.INPUT_ZIPCODE),
                Click.on(SignUpPage.BUTTON_NEXT2),

                //stage 3
                Click.on(SignUpPage.DIV_MOBILE),
                Enter.theValue(strCellphone).into(SignUpPage.INPUT_MOBILE),
                Click.on(SignUpPage.DROPDOWN_MOBILE),
                Click.on(SignUpPage.DIV_MODEL),
                Enter.theValue(strModelPhone).into(SignUpPage.INPUT_MODEL),
                Click.on(SignUpPage.DROPDOWN_MODEL),
                Click.on(SignUpPage.DIV_OS),
                Enter.theValue(strSystem).into(SignUpPage.INPUT_OS),
                Click.on(SignUpPage.DROPDOWN_OS),
                Click.on(SignUpPage.BUTTON_NEXT3),

                //stage 4
                Enter.theValue(strPassword).into(SignUpPage.INPUT_PASSWORD),
                Click.on(SignUpPage.INPUT_CPASSWORD),
                Enter.theValue(strPassword).into(SignUpPage.INPUT_CPASSWORD),
                Click.on(SignUpPage.CHECKBOX_TERMS),
                Click.on(SignUpPage.CHECKBOX_PRIVACY),
                Click.on(SignUpPage.BUTTON_COMPLETE));


    }
}
