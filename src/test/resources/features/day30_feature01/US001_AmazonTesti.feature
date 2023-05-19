Feature: US001 amazon sitesinde urun aratma
  @TC01
  Scenario: TC01_amazon sayfasinda urun aratir
    Given kullanici amazon sayfasina gider
    Then kullanici amazon sayfasinda selenium aratir
    And sayfa kapatilir

  @TC02
  Scenario: TC02_Amazon_sayfasinda_Java_Aratma
    Given kullanici amazon sayfasina gider
    And arama_kutusunda_java_aratir
    And sayfayi_kapatir

  @TC03
  Scenario: TC03_Amazon_sayfasinda_SQL_Aratma
    Given kullanici amazon sayfasina gider
    And arama_kutusunda_sql_aratir
    #And sayfayi_kapatir