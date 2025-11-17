@TP4
Feature: Login soucedemo

  Background:
    Given el usuario se encuentra en el home de soucedemo
    #Given el usuario ingresa con el usuario standard_user y el password secret_sauce

@LoginOK
 Scenario Outline: Login exitoso
    Given el usuario ingresa con el usuario <usuario> y el password <password>
    When el usuario hace click en "Login"
    Then se visualiza el Título de la página "Products"

    Examples:
      | usuario         | password     |
      | standard_user   | secret_sauce |
      | visual_user     | secret_sauce |

@LoginFail
 Scenario: Login con error
    Given el usuario ingresa con credenciales inválidas
    When el usuario hace click en "Login"
    Then se visualiza el mensaje de error "Epic sadface: Sorry, this user has been locked out."

@AgregarEliminarCarrito
  Scenario: Agregar y eliminar carrito
    Given el usuario ingresa con credenciales válidas
    And el usuario hace click en "Login"
    And el usuario agrega un producto al carrito
    When el usuario hace click en "Remove"
    Then el contador del carrito está vacío

