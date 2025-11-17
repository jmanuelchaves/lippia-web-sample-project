@TP4

Feature: Inventory soucedemo

  Background:
    Given el usuario se encuentra en el home de soucedemo

  @AgregarEliminarCarrito
  Scenario: Agregar y eliminar carrito
    Given el usuario ingresa con credenciales válidas
    And el usuario hace click en "Login"
    And el usuario agrega un producto al carrito
    When el usuario hace click en "Remove"
    Then el contador del carrito está vacío
