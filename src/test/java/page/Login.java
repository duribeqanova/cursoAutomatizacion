package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    @FindBy(id = "imUname")
    private WebElement inputUsuario;

    @FindBy(id = "imPwd")
    private WebElement inputClave;

    @FindBy(xpath = "//input[@value='Ingresar a Demo']")
    private WebElement btnIngresar;

    WebDriverWait webDriverWait;

    public Login(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriverWait = new WebDriverWait(webDriver,Duration.ofSeconds(30));
    }

    public void ingresarUsuario(String usuario){
        webDriverWait.until(ExpectedConditions.visibilityOf(inputUsuario));
        inputUsuario.sendKeys(usuario);
    }

    public void ingresarClave(String clave){
        inputClave.sendKeys(clave);
    }

    public void clickBtnIngresar(){
        btnIngresar.click();
    }
}
