package testClasses;

import org.openqa.selenium.WebDriver;
import page.CargaInformacion;
import page.Login;

<<<<<<< HEAD
import java.text.ParseException;

=======
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
public class Logeo {

    private Login login;
    private CargaInformacion cargaInformacion;
<<<<<<< HEAD

    public Logeo() {
            }

    public void CasoLogin1(String usuario, String clave) throws ParseException {
        login = new Login();
        cargaInformacion = new CargaInformacion();
=======
    WebDriver webDriver;

    public Logeo(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void CasoLogin1(String usuario, String clave){
        login = new Login(webDriver);
        cargaInformacion = new CargaInformacion(webDriver);
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
        login.ingresarUsuario(usuario);
        login.ingresarClave(clave);
        login.clickBtnIngresar();
        cargaInformacion.recuperarTitulo();
        cargaInformacion.rellenarCampoTexto("Hola");
        cargaInformacion.rellenarCampoMail("duribe@qanova.cl");
        cargaInformacion.rellenarCampoAreaTexto("texto random");
        cargaInformacion.rellenarFecha("01/01/2020");
<<<<<<< HEAD
        //cargaInformacion.seleccionarFechaCalendario("01-01-2022");
        cargaInformacion.rellenarLista("valor 2");
        cargaInformacion.seleccionMultiple("1");
=======
        cargaInformacion.rellenarLista("valor 2");
        cargaInformacion.seleccionMultiple("1,2,3");
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
        cargaInformacion.seleccionRadioButton(2);
        cargaInformacion.clickBtnEnviar();
    }
}
