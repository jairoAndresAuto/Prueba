Feature: Realizar compra en la pagina metro

  @ComprarMetro
  Scenario: ingresar a la URL indicada
    Given Despues de encontrarme en la pagina
    |optionmenu |
    |Televisores|
    When procedo a realizar el proceso de compra
    Then visualiza los productos agregados
    |Produto1                         |Produto2                              |
    |LG Smart TV 43" Full HD 43LK5400 |Samsung Smart TV 50'' 4K UHD 50NU7095 |