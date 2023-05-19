package cucumbertekrar.StepDefinitions;

import cucumbertekrar.pages.AmazonPage;
import cucumbertekrar.utilities.ConfigReader;
import cucumbertekrar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class amazonStepdefinitions {
    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://amazon.com");
    }
    @Then("kullanici amazon sayfasinda selenium aratir")
    public void kullanici_amazon_sayfasinda_selenium_aratir() {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("selenium");
    }

    /*
    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
  Driver.closeDriver();
    }

     */






    @Given("arama_kutusunda_java_aratir")
    public void arama_kutusunda_java_aratir() {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("java");
    }


    @Given("sayfayi_kapatir")
    public void sayfayi_kapatir() {
       Driver.closeDriver();
    }







    @Given("arama_kutusunda_sql_aratir")
    public void arama_kutusunda_sql_aratir() {
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("sql");
    }



}
