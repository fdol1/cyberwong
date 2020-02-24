package co.com.certificacion.cyberwongtest.userinterfaces;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://www.wong.pe/especiales/cyberwong")
public class CyberwongPage extends PageObject {

    public static String tituloArticulo;
    public static String articuloListado;

    public static final Target TXT_NOMBRE_ARTICULO =
            Target.the("Articulo")
                    .located(By.xpath("//div[@class='product-item__bottom']//a[@class='product-item__name'][contains(text(),'Sin Punta x kg')]"));

    public static final Target BTN_RECHAZAR_PUBLICIDAD =
            Target.the("Articulo")
                    .located(By.xpath("//button[@id='onesignal-popover-cancel-button']"));

    public static final Target BTN_AGREGAR_ARTICULO =
            Target.the("Articulo")
                    .located(By.xpath("//div[@class='product-item product-item--3867 gotten-product-item-data']//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart']"));

    public static final Target TXT_CORREO =
            Target.the("Correo del cliente")
                    .located(By.xpath("//input[@id='delivery-email']"));

    public static final Target BTN_CONFIRMAR_CORREO =
            Target.the("BOTÓN PARA CONFIRMAR EL CORREO")
                    .located(By.xpath("//button[@class='shipping-preference__submit']"));

    public static final Target BTN_MODO_ENTREGA_1 =
            Target.the("BOTÓN PARA ENTREGA A DOMICILIO")
                    .located(By.xpath("//div[@class='type-selector__wrapper type-selector__wrapper--full']//button[1]"));

    public static final Target TXT_INGRESAR_OTRA_DIRECCION =
            Target.the("BOTÓN PARA ENTREGA A DOMICILIO")
                    .located(By.xpath("//button[@class='modal-address__ubigeo']"));

    public static final Target TXT_DIRECCION_ENVIO =
            Target.the("")
                    .located(By.xpath("//input[@id='street']"));

    public static final Target TXT_NUMERO_EMVIO =
            Target.the("")
                    .located(By.xpath("//input[@id='number']"));

    public static final Target CBX_DEPARTAMENTO =
            Target.the("")
                    .located(By.xpath("//select[@id='state']//option[contains(text(),'Lima')]"));

    public static final Target CBX_PROVINCIA =
            Target.the("")
                    .located(By.xpath("//select[@id='city']//option[contains(text(),'Lima')]"));

    public static final Target CBX_DISTRITO =
            Target.the("")
                    .located(By.xpath("//select[@id='neighborhood']//option[contains(text(),'Lima')]"));

    public static final Target BTN_CONFIRMAR_DIRECCION =
            Target.the("")
                    .located(By.xpath("//button[@class='shipping-preference__submit modal-address__confirm']"));

    public static final Target BTN_VER_CARRITO =
            Target.the("")
                    .located(By.xpath("//div[@class='minicart minicart--floating minicart--has-items minicart--single-category']//span[@class='text'][contains(text(),'Ver carrito')]"));

    public static final Target TXT_ARTICULO_LISTADO =
            Target.the("")
                    .located(By.xpath("//a[@class='product-item__name']"));



}