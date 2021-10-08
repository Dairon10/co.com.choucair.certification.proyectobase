package co.com.choucair.certification.proyectobase.tasks;


import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Actor;
import co.com.choucair.certification.proyectobase.userinterface.ChourcairAcademicPage;

public class OpenUp implements Task {
    private ChourcairAcademicPage chourcairAcademicPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public < T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(chourcairAcademicPage));

    }
}
