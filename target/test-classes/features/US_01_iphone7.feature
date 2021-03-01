
@wip
Feature:US01 marktplaats page arama
Scenario Outline: Tc01 arama testi

  Given kullanici marktplaats anasayfaya gider
  And kullanici Accepteren butonuna tiklar
  And "<iphone>" icin arama yapar
  Then sonucun "<iphone>" icerdigini kontrol eder
  And kullanici anasayfayi kapatir

  Examples:
  |iphone       |
  |iphone 7     |
  |iphone 7 plus|
  |iphone 8     |
  |iphone 8 plus|
  |iphone x     |
  |iphone xr    |
  |iphone xs    |