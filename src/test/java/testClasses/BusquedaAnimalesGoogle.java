package testClasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import page.Google;

public class BusquedaAnimalesGoogle {
    private Google google;


    public void busquedaPerro(WebDriver webDriver) {
        google = new Google(webDriver);
        google.ingresarBusqueda("Perro");
        google.clickBtnBuscar();
    }

    public void busquedaGato(WebDriver webDriver) {
        google = new Google(webDriver);
        google.ingresarBusqueda("Gato");
        google.clickBtnBuscar();
    }
}
