Feature:

  @lee
  Scenario:
    Given Kullanici site ana sayfaya gider
    When Kullanici alert'teki cikan uyari yazisini onaylar
   And Kullanici login olur
   And Kullanici Sepetim Butonunu tiklar
   And Sepete gir ürün-ürünler var mı kontrolü yap. Ürün-ürünler varsa sepeti temizle.
   #And Kullanici anasayfaya gelir
    And Jeans-Kadın-Erkek kategorilerinden herhangi birini random seç.
    And Ürün listeleme sayfasından sıralamayı fiyat göre artan seçeneğini seç.
    And İlk ürünün içerisine gir.
    And Açılan ürün detay sayfasından beden seçeneklerinden herhangi birini random seç.
    #( Burada tükendi ürünler olabiliyor. Bunlar hariç olmalı )
    And Random seçilen bedeni sepete ekle ve sepete git.
    And Hediye Paketi İstiyorum seçeneğini işaretle.
    And Promosyon kodu alanına rastgele bir kod gir.
    And Satın al butonuna bas ve ilerle.
    And Teslimat bilgileri sayfasında yeni adres ekle ve ilerle.
    And Kredi kart bilgilerini hatalı gir ve siparişi tamamla de.
    And Tekrar sepete dön ve ürün adedini 1 arttır.
    And Üyelikten çıkış yap.



