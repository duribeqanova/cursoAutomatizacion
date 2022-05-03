package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
<<<<<<< HEAD
import utils.DriverContext;
import utils.Reporte.EstadoPrueba;
import utils.Reporte.PdfQaNovaReports;
=======
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02

import java.time.Duration;

public class Login {

    @FindBy(id = "imUname")
    private WebElement inputUsuario;

    @FindBy(id = "imPwd")
    private WebElement inputClave;

    @FindBy(xpath = "//input[@value='Ingresar a Demo']")
    private WebElement btnIngresar;

    WebDriverWait webDriverWait;

<<<<<<< HEAD
    public Login(){
        PageFactory.initElements(DriverContext.getDriver(),this);
        this.webDriverWait = new WebDriverWait(DriverContext.getDriver(), 30);
=======
    public Login(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriverWait = new WebDriverWait(webDriver,Duration.ofSeconds(30));
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
    }

    public void ingresarUsuario(String usuario){
        webDriverWait.until(ExpectedConditions.visibilityOf(inputUsuario));
<<<<<<< HEAD
        PdfQaNovaReports.addWebReportImage("Despliegue Login", "Se desplego correctamente", EstadoPrueba.PASSED,false );
=======
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
        inputUsuario.sendKeys(usuario);
    }

    public void ingresarClave(String clave){
        inputClave.sendKeys(clave);
    }

    public void clickBtnIngresar(){
        btnIngresar.click();
<<<<<<< HEAD
        PdfQaNovaReports.addWebReportImage("Datos Login", "Se ingreso usuario y contraseña", EstadoPrueba.PASSED,false);
    }

=======
    }
>>>>>>> 662de8108a7ade9a85f286395ca3f16035221d02
}
