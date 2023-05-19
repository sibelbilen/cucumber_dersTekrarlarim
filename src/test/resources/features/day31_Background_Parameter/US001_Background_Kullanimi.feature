Feature: US0001 amazon sayfasinda urun aratma

  Background: kullanici amazon sayfasina gider
    Given kullanici amazon sayfasina gider
  Scenario: TC01_Amazon_sayfasinda_Selenium_Aratma
    Then kullanici amazon sayfasinda selenium aratir
    And sayfayi_kapatir

  Scenario: TC02_Amazon_sayfasinda_Java_Aratma
    And arama_kutusunda_java_aratir

  Scenario: TC03_Amazon_sayfasinda_SQL_Aratma
    And arama_kutusunda_sql_aratir