package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Google {
    @FindBy(xpath ="//input[@title = 'Buscar']")
    WebElement inputBuscar;

    @FindBy(xpath ="//input[@value= 'Buscar con Google']")
    WebElement btnBuscar;



    public Google (WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
    }

    public void ingresarBusqueda (String busqueda){
        inputBuscar.sendKeys(busqueda);
    }

    public void clickBtnBuscar(){
        btnBuscar.click();
    }
}
