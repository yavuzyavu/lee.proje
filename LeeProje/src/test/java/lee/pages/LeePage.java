package lee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeePage extends CommonPageElements{
    @FindBy(css = "[alt=\"Hesabım\"]")
    public WebElement hesabimButonu;

    @FindBy(css = "[id=\"Email\"]")
    public WebElement loginMailTextBox;

    @FindBy(css = "[id=\"Password\"]")
    public WebElement loginPasswordTextBox;

    @FindBy(css = "[value=\"GİRİŞ YAP\"]")
    public WebElement loginGirisYapButonu;

    @FindBy(xpath = "//img[@title=\"Sepetim\"]")
    public WebElement sepetimButonu;

    @FindBy(xpath = "//*[@src=\"https://f-lwr-l.mncdn.com/webfiles/NewSiteIcons/delete-gri.svg\"]")
    public List<WebElement> sepetSilmeButon;

    @FindBy(xpath = "//*[@class=\"cl-big-button cl-order-completed-page-button cl-delete-btn cl-remove-cart-button\"]")
    public WebElement sepetSilmeOnayButon;

    @FindBy(xpath = "//*[@class=\"cl-big-button cl-order-completed-page-button cl-delete-btn cl-remove-cart-button\"]")
    public WebElement leeButon;

    @FindBy(css = "[class=\"fa fa-times element-close-button\"]")
    public WebElement closeAdButton;

    @FindBy(xpath = "//*[@href=\"/lee?kategori=jean-pantolon\"]")
    public WebElement jeansButon;

    @FindBy(xpath = "//*[@href=\"/lee-kadin\"]")
    public WebElement kadinButon;

    @FindBy(xpath = "//*[@href=\"/lee-erkek\"]")
    public WebElement erkekButon;


    @FindBy(xpath = "//nav/ul/li")
    public List<WebElement> katagoriler;


    @FindBy(xpath = "//*[@id=\"products-orderby\"]")
    public WebElement siralamaKutusu;

    @FindBy(xpath = "//div/div/div/div/div/div/a/img")
    public List<WebElement> katagorideUrunler;

    @FindBy(xpath = "//*[@id=\"size-select\"]")
    public WebElement bedenSecemiKutusu;

    @FindBy(xpath = "//option[starts-with(@id,'product_attribute_')]")
    public List<WebElement> bedenSecemi;

    @FindBy(xpath = "//*[@class=\"add-to-cart-button cl-big-button\"]")
    public WebElement sepeteEkle2;

    @FindBy(xpath = "//*[@class=\"cl-input-plus-button\"]")
    public WebElement sepetArtirButtn;

    @FindBy(xpath = "//*[@class=\"text\"]")
    public WebElement hediyePaketi;

    @FindBy(xpath = "//*[@id=\"discountcouponcode\"]")
    public WebElement indirimKodu;

    @FindBy(xpath = "//*[@id=\"applydiscountcouponcode\"]")
    public WebElement uygulaBtn;

    @FindBy(xpath = "//*[@Girdiğiniz kupon kodu siparişinize uygulanamadı]")
    public WebElement uyari;

    @FindBy(xpath = "//*[@id=\"checkout\"]")
    public WebElement satinAlBtn;

    @FindBy(xpath = "//*[@id=\"address_attribute_5eae2115f6f875754ba14134\"]")
    public WebElement adresİsim;

    @FindBy(xpath = "//*[@id=\"Address_FirstName\"]")
    public WebElement isim;

    @FindBy(xpath = "//*[@id=\"Address_LastName\"]")
    public WebElement soyisim;

    @FindBy(xpath = "//*[@id=\"Address_CountryId\"]")
    public WebElement il;

    @FindBy(xpath = "//*[@id=\"Address_StateProvinceId\"]")
    public WebElement ilce;

    @FindBy(xpath = "//*[@id=\"Address_NeighborhoodId\"]")
    public WebElement mahalle;

    @FindBy(xpath = "//*[@id=\"Address_Address1\"]")
    public WebElement adres;

    @FindBy(xpath = "//*[@id=\"Address_Email\"]")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"Address_PhoneNumber\"]")
    public WebElement telf;

    @FindBy(xpath = "(//*[@type=\"submit\"])[2]")
    public WebElement kaydetAdres;

    @FindBy(xpath = "//*[@type=\"button\"]")
    public WebElement devam;

    @FindBy(xpath = "//*[@id=\"CardholderName\"]")
    public WebElement kartSahibi;

    @FindBy(xpath = "//*[@id=\"CardNumber\"]")
    public WebElement kartno;

    @FindBy(xpath = "//*[@id=\"CardNumber\"]")
    public WebElement kartkod;

    @FindBy(xpath = "//*[@class=\"cl-checkmark\"]")
    public WebElement bilglndirmeony;

    @FindBy(xpath = "//*[@id=\"completeOrderButton\"]")
    public WebElement siparistmml;

    @FindBy(xpath = "//*[@class=\"log-out\"]")
    public WebElement cıkısYap;




}
