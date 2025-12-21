@RegresionConpleta


Feature: Cart soucedemo

  Background:
    Given el usuario se encuentra en el home de soucedemo
    And el usuario ingresa con el usuario standard_user y el password secret_sauce
    And el usuario hace click en "Login"
    And el usuario agrega un producto al carrito
    And el usuario agrega un segundo producto al carrito
    And el usuario hace click en el carrito
    And se visualizan los productos agregados al carrito
    And se visualiza el Titulo de la pagina "Your Cart"



  @IngresoCheckout
  Scenario: Ingreso a Checkout
    When el usuario hace click en "Checkout"
    Then se visualiza el Titulo de la pagina "Checkout: Your Information"


