Feature: US0003 amazon sayfasinda urun aratma
  @GR01
  Scenario: TC01_Amazon_sayfasinda_Selenium_Aratma
    Given kullanici amazon sayfasina gider
Then kullanici amazon sayfasinda selenium aratir
    And sayfayi_kapatir

    @GR02

    Scenario: TC02_Amazon_sayfasinda_Java_Aratma
      Given kullanici amazon sayfasina gider
      And arama_kutusunda_java_aratir



      @GR03
      Scenario: TC03_Amazon_sayfasinda_SQL_Aratma
        Given kullanici amazon sayfasina gider
        And arama_kutusunda_sql_aratir
