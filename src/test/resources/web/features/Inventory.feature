@RegresionConpleta
@Inventory

Feature: Inventory soucedemo

  Background:
    Given el usuario se encuentra en el home de soucedemo

  @AgregarCarrito
  Scenario Outline: Agregar Carrito con dos productos
    Given el usuario ingresa con el usuario <usuario> y el password <password>
    And el usuario hace click en "Login"
    And el usuario agrega un producto al carrito
    And el usuario agrega un segundo producto al carrito
    When el usuario hace click en el carrito
    Then se visualiza el Titulo de la pagina "Your Cart"

    Examples:
      | usuario                 | password     |
      | standard_user           | secret_sauce |