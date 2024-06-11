package lippia.web.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.constants.LoginConstants;
import lippia.web.constants.TimeTrackerConstants;
import lippia.web.services.ProjectService;
import lippia.web.services.TimeTrackerService;
import lippia.web.services.TrackerService;
import org.testng.Assert;

public class TimeTrackerSteps {
    private String descripcionUnica;

    @And("The user click on manual mode")
    public void theUserOnLogInButtonTimeTracker() {
        TimeTrackerService.clickTimeTracker();
    }
    @And("Ingreso una descripcion unica")
    public void ingresoUnaDescripcionUnica() {
        this.descripcionUnica = TimeTrackerService.generateUniqueDescription();
        TimeTrackerService.inputDescription(this.descripcionUnica);
    }
    @And("^Ingreso la hora de inicio (.*)")
    public void ingresoLaHoraDeInicio(String hora) {
        TimeTrackerService.inputStartHour(hora);
    }

    @And("^Ingreso la hora de fin (.*)")
    public void ingresoLaHoraDeFin(String hora) {
        TimeTrackerService.inputFinishHour(hora);
    }

    @And("^Ingreso la fecha (.*)")
    public void ingresoLaFecha(String fecha) {
        TimeTrackerService.inputDate(fecha);
    }

    @And("Hago click en el boton ADD")
    public void hagoClickEnElBotonADD() {
        TimeTrackerService.clickADDButton();
    }

    @Then("Se agrega un tiempo de trabajo nuevo")
    public void seAgregaUnTiempoDeTrabajoNuevo() {
        TimeTrackerService.verifyTimeTracked(this.descripcionUnica);
    }

    @And("Hago click en el boton Cancelado")
    public void hagoClickEnElBotonCancelado() {
        TimeTrackerService.clickCancelarTimeTracker();

    }

    @Then("Se cancela un tiempo de trabajo nuevo")
    public void seCancelaUnTiempoDeTrabajoNuevo() {
            TimeTrackerService.clickCancelarTimeTracker();
        }

    }

