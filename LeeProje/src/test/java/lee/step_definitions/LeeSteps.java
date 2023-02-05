package lee.step_definitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lee.utilities.CommonSteps;
import lee.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class LeeSteps extends CommonSteps {

    Faker faker = new Faker();

    @Given("Kullanici site ana sayfaya gider")
    public void kullanici_site_ana_sayfaya_gider() {
    }


    @When("Kullanici alert'teki cikan uyari yazisini onaylar")
    public void kullanici_alert_teki_cikan_uyari_yazisini_onaylar() {
        waitFor(3);
        try {
            acceptAlert();
        } catch (Exception e) {

        }

    }

    @When("Kullanici login olur")
    public void kullanici_login_olur() {
        leePage.hesabimButonu.click();
        waitForVisibility(leePage.loginMailTextBox, 10);
        leePage.loginMailTextBox.sendKeys(ConfigurationReader.get("email"));
        leePage.loginPasswordTextBox.sendKeys(ConfigurationReader.get("password"));
        scrollDownByPixels(500);
        waitForVisibility(leePage.loginGirisYapButonu, 10);
        leePage.loginGirisYapButonu.click();
        //waitForVisibility(leePage.closeAdButton, 15);
        //leePage.closeAdButton.click();
        waitFor(3);
        clickOnImage("kapatmaTusu");
    }

    @When("Kullanici Sepetim Butonunu tiklar")
    public void kullanici_sepetim_butonunu_tiklar() {
        waitForVisibility(leePage.sepetimButonu, 15);
        leePage.sepetimButonu.click();
    }

    @And("Sepete gir ürün-ürünler var mı kontrolü yap. Ürün-ürünler varsa sepeti temizle.")
    public void sepeteGirÜrünÜrünlerVarMıKontrolüYapÜrünÜrünlerVarsaSepetiTemizle() {

        if (!leePage.sepetSilmeButon.isEmpty()) {

            for (WebElement w : leePage.sepetSilmeButon) {
                waitFor(3);
                w.click();
                waitFor(3);
                leePage.sepetSilmeOnayButon.click();
            }

        }

    }

    @And("Kullanici anasayfaya gelir")
    public void kullaniciAnasayfayaGelir() {
        leePage.leeButon.click();
    }


    @And("Jeans-Kadın-Erkek kategorilerinden herhangi birini random seç.")
    public void jeansKadınErkekKategorilerindenHerhangiBiriniRandomSeç() {
        leePage.katagoriler.get(faker.number().numberBetween(0, 2)).click();

    }

    @And("Ürün listeleme sayfasından sıralamayı fiyat göre artan seçeneğini seç.")
    public void ürünListelemeSayfasındanSıralamayıFiyatGöreArtanSeçeneğiniSeç() {
        leePage.siralamaKutusu.sendKeys("Fiyata Göre (Artan)");

    }

    @And("İlk ürünün içerisine gir.")
    public void ilkÜrününIçerisineGir() {
        waitForVisibility(leePage.katagorideUrunler.get(0), 20);
        clickWithJS(leePage.katagorideUrunler.get(0));
    }

    @And("Açılan ürün detay sayfasından beden seçeneklerinden herhangi birini random seç.")
    public void açılanÜrünDetaySayfasındanBedenSeçeneklerindenHerhangiBiriniRandomSeç() {
        scrollDownByPixels(300);
        leePage.bedenSecemiKutusu.click();
        for (WebElement w : leePage.bedenSecemi) {
            if (!w.getText().contains("tükendi")) {
                w.click();
                break;
            }

        }

    }

    @And("Random seçilen bedeni sepete ekle ve sepete git.")
    public void randomSeçilenBedeniSepeteEkleVeSepeteGit() {
        leePage.sepeteEkle2.click();
        waitForVisibility(leePage.sepetimButonu, 20);
        clickWithJS(leePage.sepetimButonu);
        leePage.sepetArtirButtn.click();

    }

    @And("Hediye Paketi İstiyorum seçeneğini işaretle.")
    public void hediyePaketiİstiyorumSeçeneğiniIşaretle() {
        waitForVisibility(leePage.hediyePaketi, 20);
        clickWithJS(leePage.hediyePaketi);
    }

    @And("Promosyon kodu alanına rastgele bir kod gir.")
    public void promosyonKoduAlanınaRastgeleBirKodGir() {

        waitForVisibility(leePage.indirimKodu, 20);
        leePage.indirimKodu.sendKeys("indirim50");
        waitForVisibility(leePage.uygulaBtn, 20);
        leePage.uygulaBtn.click();

        //waitForVisibility(leePage.uyari,20);
        System.out.println(leePage.uyari.getText());
    }

    @And("Satın al butonuna bas ve ilerle.")
    public void satınAlButonunaBasVeIlerle() {
        leePage.satinAlBtn.click();
    }

    @And("Teslimat bilgileri sayfasında yeni adres ekle ve ilerle.")
    public void teslimatBilgileriSayfasındaYeniAdresEkleVeIlerle() {
        leePage.yeniAdrsBtn.click();
        waitForVisibility(leePage.adresİsim,20);
        leePage.adresİsim.sendKeys("ev adresi");
        leePage.isim.sendKeys("yavuz");
        leePage.soyisim.sendKeys("ali");
        leePage.il.sendKeys("BİNGÖL");
        leePage.ilce.sendKeys("ADAKLI");
        leePage.mahalle.sendKeys("BAGLAR PINARI KÖYU");
        leePage.adres.sendKeys("ARI SK");
        leePage.email.sendKeys("abc121@gmail.com");
        leePage.telf.sendKeys("5012222222");
        leePage.kaydetAdres.click();
    }

    @And("Kredi kart bilgilerini hatalı gir ve siparişi tamamla de.")
    public void krediKartBilgileriniHatalıGirVeSiparişiTamamlaDe() {
        leePage.devam.click();
        leePage.kartSahibi.sendKeys("yavuz ali");
        leePage.kartno.sendKeys("1111 1111 1111 1111");
        leePage.kartkod.sendKeys("121");
        leePage.bilglndirmeony.click();
        leePage.siparistmml.click();
        waitFor(3);
        System.out.println(getAlertText());
        acceptAlert();

    }

    @And("Tekrar sepete dön ve ürün adedini {int} arttır.")
    public void tekrarSepeteDönVeÜrünAdediniArttır(int arg0) {
        leePage.sepetimButonu.click();
        leePage.sepetArtirButtn.click();
    }

    @And("Üyelikten çıkış yap.")
    public void üyeliktenÇıkışYap() {
        leePage.hesabimButonu.click();
        leePage.cıkısYap.click();
    }
}

