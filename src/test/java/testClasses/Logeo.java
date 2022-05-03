package testClasses;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

import java.text.ParseException;

public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;

    public Logeo() {
            }

    public void CasoLogin1(String usuario, String clave) throws ParseException {
        login = new Login();
        cargaInformacion = new CargaInformacion();
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Hola");
        cargaInformacion.rellenarCampoMail("duribe@qanova.cl");
        cargaInformacion.rellenarCampoAreaTexto("texto random");
        cargaInformacion.rellenarFecha("01/01/2020");
        //cargaInformacion.seleccionarFechaCalendario("01-01-2022");
        cargaInformacion.rellenarLista("valor 2");
        cargaInformacion.seleccionMultiple("1");
        cargaInformacion.seleccionRadioButton(2);
        cargaInformacion.clickBtnEnviar();
    }
}
