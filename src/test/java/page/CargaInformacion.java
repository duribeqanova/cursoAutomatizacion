package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class CargaInformacion {

    @FindBy(id = "imPgTitle")
        private WebElement titulo;
        WebDriver webDriver;

    @FindBy(xpath = "//input[@id = 'imObjectForm_1_2']")
        private WebElement campoTexto;

    @FindBy(xpath = "//input[@id = 'imObjectForm_1_3']")
        private WebElement campoCorreo;

    @FindBy(xpath = "//textarea[@id = 'imObjectForm_1_4']")
        private WebElement campoTextoArea;

    @FindBy(xpath = "//input[@id = 'imObjectForm_1_5']")
        private WebElement campoFecha;

    @FindBy(xpath = "//select[@id = 'imObjectForm_1_6']")
        private WebElement campoLista;

    @FindBy(id = "imObjectForm_1_7_0")
        private WebElement chckbxSeleccionMultiple1;

    @FindBy(id = "imObjectForm_1_7_1")
        private WebElement chckbxSeleccionMultiple2;

    @FindBy(id = "imObjectForm_1_7_2")
        private WebElement chckbxSeleccionMultiple3;

    @FindBy(id = "imObjectForm_1_8_0")
        private WebElement rdbtnCombo1;

    @FindBy(id = "imObjectForm_1_8_1")
        private WebElement rdbtnCombo2;

    @FindBy(id = "imObjectForm_1_8_2")
     private WebElement rdbtnCombo3;

    @FindBy(id = "imObjectForm_1_Submit")
        private WebElement btnEnviar;

    @FindBy(xpath = "//*[@id=\"imObjectForm_1_buttonswrap\"]/input[2]")
        private WebElement btnReset;

    WebDriverWait webDriverWait;
    public CargaInformacion(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriverWait = new WebDriverWait(webDriver,Duration.ofSeconds(30));
    }

    public String recuperarTitulo(){
        webDriverWait.until(ExpectedConditions.visibilityOf(titulo));
        String texto = titulo.getText();
        return texto;
    }

    public void rellenarCampoTexto(String texto){
        campoTexto.sendKeys(texto);
    }

    public void rellenarCampoMail(String mail){
        campoCorreo.sendKeys(mail);
    }

    public void rellenarCampoAreaTexto(String areaTexto){
        campoTextoArea.sendKeys(areaTexto);
    }

    public void rellenarFecha(String fecha){
        campoFecha.sendKeys(fecha);
    }

    public void rellenarLista(String valor){
        Select select = new Select(campoLista);
        select.selectByVisibleText(valor);
    }

    public void  seleccionMultiple(int indicador){
        switch (indicador) {
            case 1:
                chckbxSeleccionMultiple1.click();
                break;
            case 2:
                chckbxSeleccionMultiple2.click();
                break;
            case 3:
                chckbxSeleccionMultiple3.click();
                break;
            default:
                System.out.println("valor no procesable");
        }
    }

    public void  seleccionMultiple(String indicador) {
        String[] indicadores = indicador.split(",");
        for (String nro : indicadores) {
            int numero = Integer.parseInt(nro);
            switch (numero) {
                case 1:
                    chckbxSeleccionMultiple1.click();
                    break;
                case 2:
                    chckbxSeleccionMultiple2.click();
                    break;
                case 3:
                    chckbxSeleccionMultiple3.click();
                    break;
                default:
                    System.out.println("valor no procesable");
            }
        }
    }
}
