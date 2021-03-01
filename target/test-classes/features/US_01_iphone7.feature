
@wip
Feature:US01 marktplaats page arama
Scenario Outline: Tc01 arama testi

  Given kullanici marktplaats anasayfaya gider

  And "<iphone>" icin arama yapar
  Then sonucun "<iphone>" icerdigini kontrol eder
  And kullanici anasayfayi kapatir

  Examples:
  |iphone       |
  |iphone 7     |
  |iphone x     |