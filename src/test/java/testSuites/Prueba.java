package testSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
<<<<<<< HEAD
import testClasses.Logeo;
import utils.Constants.Navegador;
import utils.DriverContext;
import utils.Reporte.PdfQaNovaReports;

import java.text.ParseException;
=======
import testClasses.BusquedaAnimalesGoogle;
import testClasses.Logeo;
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02

public class Prueba {
    ChromeDriver webDriver;
    String url = "https://www.qanovagroup.com/piloto";

    @BeforeTest
    public void setUp(){
<<<<<<< HEAD
        DriverContext.setUp(Navegador.Chrome,url);
        PdfQaNovaReports.createPDF();
    }

    @AfterTest
    public void closedDriver(){
        DriverContext.closeDriver();
        PdfQaNovaReports.closePDF();
    }

    @Test
    public void pruebaLogin() throws ParseException {
        Logeo logeo = new Logeo();
=======
        System.setProperty("webdriver.chrome.driver","driverNavegador/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @AfterTest
    public void closeDriver(){
        //webDriver.close();
    }

    @Test
    public void BuscarGatoEnGoogle(){
        BusquedaAnimalesGoogle busquedaAnimalesGoogle = new BusquedaAnimalesGoogle();
        busquedaAnimalesGoogle.busquedaGato(webDriver);

    }

    @Test
    public void BuscarPerroEnGoogle(){
        BusquedaAnimalesGoogle busquedaAnimalesGoogle = new BusquedaAnimalesGoogle();
        busquedaAnimalesGoogle.busquedaPerro(webDriver);

    }
    @Test
    public void pruebaLogin(){
        Logeo logeo = new Logeo(webDriver);
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
        logeo.CasoLogin1("nvivas","qanova");
    }
}
