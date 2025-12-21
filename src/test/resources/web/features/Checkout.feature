@RegresionConpleta
@Checkout
Feature: Datos de Checkout

  Background:
    Given el usuario se encuentra en el home de soucedemo
    And el usuario ingresa con el usuario standard_user y el password secret_sauce
    And el usuario hace click en "Login"
    And el usuario agrega un producto al carrito
    And el usuario agrega un segundo producto al carrito
    And el usuario hace click en el carrito
    And se visualiza el Titulo de la pagina "Your Cart"
    And el usuario hace click en "Checkout"
    And se visualiza el Titulo de la pagina "Checkout: Your Information"


@CompletarDatosCheckout
  Scenario Outline: Compra completa y validacion de datos
    Given el usuario ingresa el nombre <nombre> en el campo "First Name"
    And el usuario ingresa el apellido <apellido> en el campo "Last Name"
    And el usuario ingresa el codigo postal <cpostal> en el campo "Zip/Postal Code"
    When el usuario hace click en "Continue"
    Then se visualiza el título de la página siguiente "Checkout: Overview"

  Examples:
  | nombre | apellido | cpostal |
  | Joaco  | Curuchet | 1400    |


