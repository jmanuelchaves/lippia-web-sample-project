@RegresionConpleta
@TPfinal


Feature: Login soucedemo

  Background:
    Given el usuario se encuentra en el home de soucedemo

@LoginOK
 Scenario Outline: Login exitoso con 5 usuarios diferentes
    Given el usuario ingresa con el usuario <usuario> y el password <password>
    When el usuario hace click en "Login"
    Then se visualiza el Título de la página "Products"

    Examples:
      | usuario                 | password     |
      | standard_user           | secret_sauce |
      | visual_user             | secret_sauce |
      | problem_user            | secret_sauce |
      | error_user              | secret_sauce |
      | performance_glitch_user | secret_sauce |

@LoginFail
 Scenario Outline: Verificar mensajes de error en el login
    Given el usuario ingresa con el usuario <usuario> y el password <password>
    When el usuario hace click en "Login"
    Then se visualiza el mensaje de error <mensajeerror>

  Examples:
    | usuario                 | password     | mensajeerror                                                              |
    | locked_out_user         | secret_sauce | Epic sadface: Sorry, this user has been locked out.                       |
    | kiricocho               | secret_sauce | Epic sadface: Username and password do not match any user in this service |
    |                         | secret_sauce | Epic sadface: Username is required                                        |
    | standard_user           |              | Epic sadface: Password is required                                        |
    |                         |              | Epic sadface: Username is required                                        |
    | standard_user           | error_sauce  | Epic sadface: Username and password do not match any user in this service |




