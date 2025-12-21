@RegresionConpleta
@CheckoutTwo
Feature: Verificar Página Overview

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
    And el usuario ingresa el nombre Armando en el campo "First Name"
    And el usuario ingresa el apellido Platini en el campo "Last Name"
    And el usuario ingresa el codigo postal 2222 en el campo "Zip/Postal Code"


@RevisarpaginaOverview
  Scenario: Compra completa y validacion de datos
    When el usuario hace click en "Continue"
    Then se visualiza el título de la página siguiente "Checkout: Overview"
    And se verifican los productos en el carrito
    And figura el total del pago



