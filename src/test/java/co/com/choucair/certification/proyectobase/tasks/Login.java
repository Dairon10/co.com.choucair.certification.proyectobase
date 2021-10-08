package co.com.choucair.certification.proyectobase.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;

public class Login implements Task {
    private String sTrUser;
    private String sTrPassword;
    public Login(String sTrUser,String sTrPassword){
        this.sTrUser = sTrUser;
        this.sTrPassword = sTrPassword;
    }

   public static Login onThePage(String sTrUser, String sTrPassword){
return Tasks.instrumented(Login.class,sTrUser,sTrPassword);

   }

   @Override
    public <T extends Actor> void performAs (T actor){
      actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
         Enter.theValue(sTrUser).into(ChoucairLoginPage.INPUT_USER),
         Enter.theValue(sTrPassword).into(ChoucairLoginPage.INPUT_PASSWORD),
         Click.on(ChoucairLoginPage.ENTER_BUTTON)
      );
   }

}
