package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepages;
import utils.Driver;

public class HomeStepDefs {
    Homepages element= new Homepages();

    @Given("Anasayfaya git ve kontrol et")
    public void anasayfayaGitVeKontrolEt() {
        Driver.getAppiumDriver();
        element.later.click();

    }

    @When("Plus tard butonuna tikla")
    public void plusTardButonunaTikla() {

    }

    @And("Accepter CGU kontrol et")
    public void accepterCGUKontrolEt() {

    }

    @And("Geolocationu kontol et Ok butonuna tikla")
    public void geolocationuKontolEtOkButonunaTikla() {

    }

    @And("Accepter CGU tikla")
    public void accepterCGUTikla() {

    }

    @And("Harita kullanimina izin ver")
    public void haritaKullaniminaIzinVer() {

    }

    @And("Daha sonra bak butonuna tikla")
    public void dahaSonraBakButonunaTikla() {

    }

    @Then("Bir hat ekle")
    public void birHatEkle() {
    }
}
