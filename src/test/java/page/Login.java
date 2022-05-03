package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverContext;
import utils.Reporte.EstadoPrueba;
import utils.Reporte.PdfQaNovaReports;

import java.time.Duration;

public class Login {

    @FindBy(id = "imUname")
    private WebElement inputUsuario;

    @FindBy(id = "imPwd")
    private WebElement inputClave;

    @FindBy(xpath = "//input[@value='Ingresar a Demo']")
    private WebElement btnIngresar;

    WebDriverWait webDriverWait;

    public Login(){
        PageFactory.initElements(DriverContext.getDriver(),this);
        this.webDriverWait = new WebDriverWait(DriverContext.getDriver(), 30);
    }

    public void ingresarUsuario(String usuario){
        webDriverWait.until(ExpectedConditions.visibilityOf(inputUsuario));
        PdfQaNovaReports.addWebReportImage("Despliegue Login", "Se desplego correctamente", EstadoPrueba.PASSED,false );
        inputUsuario.sendKeys(usuario);
    }

    public void ingresarClave(String clave){
        inputClave.sendKeys(clave);
    }

    public void clickBtnIngresar(){
        btnIngresar.click();
        PdfQaNovaReports.addWebReportImage("Datos Login", "Se ingreso usuario y contraseña", EstadoPrueba.PASSED,false);
    }

}
