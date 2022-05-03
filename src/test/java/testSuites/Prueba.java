package testSuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testClasses.Logeo;
import utils.Constants.Navegador;
import utils.DriverContext;
import utils.Reporte.PdfQaNovaReports;

import java.text.ParseException;

public class Prueba {
    ChromeDriver webDriver;
    String url = "https://www.qanovagroup.com/piloto";

    @BeforeTest
    public void setUp(){
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
        logeo.CasoLogin1("nvivas","qanova");
    }
}
