
Feature: realizar un login exitoso en Clockify
  @Clock
  Scenario Outline: Login exitoso
    Given Se dirige a la aplicacion de Clockify
    When Selecciona el campo de email
    And The user logs in the application with: <email>, <password>
    Then Home page is displayed

    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |