package cucumbertekrar.StepDefinitions;

import cucumbertekrar.pages.TechproPage;
import cucumbertekrar.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class TechproStepDefinition {

    TechproPage techproPage =new TechproPage();
    @Given("kullanici_techpro_sayfasina_gider")
    public void kullanici_techpro_sayfasina_gider() {
        Driver.getDriver().get("https://techproeducation.com");
    }
    @Then("cikan_reklam_kapatilir")
    public void cikan_reklam_kapatilir() {
        techproPage.reklam.click();

    }
    @Then("arama_kutusunda_QA_aratir")
    public void arama_kutusunda_qa_aratir() {
       techproPage.searchBox.sendKeys("QA"+ Keys.ENTER);
    }
    @Then("sayfa_basliginin_qa_icerdigini_test_eder")
    public void sayfa_basliginin_qa_icerdigini_test_eder() {
        Assert.assertTrue(techproPage.searchBox.getText().contains("QA"));
    }

    /*
    @Then("sayfayi_kapatir")
    public void sayfayi_kapatir() {
      Driver.closeDriver();
    }

     */

}
