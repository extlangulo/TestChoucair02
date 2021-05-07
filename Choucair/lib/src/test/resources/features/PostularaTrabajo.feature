Feature: Postulacion de Empleo
  Yo quiero realizar una busqueda de un listado de empleos

  @tag1
  Scenario: Verificar Postulacion de Empleo Exitosa
    Given Estoy en la pagina de Chocair Peru
    When Yo navego por las secciones de postulacion
    Then Verifico que exista postulaciones disponibles
