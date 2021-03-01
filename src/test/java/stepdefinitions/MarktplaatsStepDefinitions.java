package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.Keys;
import pages.MarktplaatsPages;
import utilities.ConfigReader;
import utilities.Driver;



public class MarktplaatsStepDefinitions {

    MarktplaatsPages marktplaatsPages=new MarktplaatsPages();

    @Given("kullanici marktplaats anasayfaya gider")
    public void kullanici_marktplaats_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("marktplaats_url"));
    }
    @Given("kullanici Accepteren butonuna tiklar")
    public void kullanici_accepteren_butonuna_tiklar() {
        marktplaatsPages.accepterenButton.click();
    }

    @Then("sonucun {string} icerdigini kontrol eder")
    public void sonucun_icerdigini_kontrol_eder(String string) {
        marktplaatsPages.searchbox.sendKeys(string+ Keys.ENTER);
    }
    @Given("{string} icin arama yapar")
    public void icin_arama_yapar(String string) {

    }

    @Then("kullanici anasayfayi kapatir")
    public void kullanici_anasayfayi_kapatir() {
    Driver.closeDriver();
    }





}
