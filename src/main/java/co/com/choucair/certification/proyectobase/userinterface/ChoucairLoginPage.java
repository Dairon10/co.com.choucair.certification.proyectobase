package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://operacion.choucairtesting.com/academy/login/index.php")

public class ChoucairLoginPage extends ChourcairAcademicPage {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").located(By.xpath("//a[@class= 'btn btn-info btn-sm text-white']//strong[contains(text(),'Ingresar')]"));
    public static final Target  INPUT_USER = Target.the( "Where do write the user").located(By.id("username"));
    public static final Target  INPUT_PASSWORD = Target.the( "Where do WE write the PASSWORD").located(By.id("password"));
    public static final Target  ENTER_BUTTON = Target.the( "button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));

}

