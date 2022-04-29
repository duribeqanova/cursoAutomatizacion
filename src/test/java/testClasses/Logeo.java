package testClasses;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;
    WebDriver webDriver;

    public Logeo(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void CasoLogin1(String usuario, String clave){
        login = new Login(webDriver);
        cargaInformacion = new CargaInformacion(webDriver);
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Hola");
        cargaInformacion.rellenarCampoMail("duribe@qanova.cl");
        cargaInformacion.rellenarCampoAreaTexto("texto random");
        cargaInformacion.rellenarFecha("01/01/2020");
        cargaInformacion.rellenarLista("valor 2");
        cargaInformacion.seleccionMultiple("1,2,3");
        cargaInformacion.seleccionRadioButton(2);
        cargaInformacion.seleccionarFechaCalendario("2022-03-19");
        cargaInformacion.clickBtnEnviar();
    }
}