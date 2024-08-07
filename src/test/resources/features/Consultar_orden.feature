Feature: Consultar orden PetStore


  @test2
  Scenario: Consultar orden
    When consulto la orden con id 1
    Then el código de respuesta sera 200