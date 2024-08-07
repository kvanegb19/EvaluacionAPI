Feature: Crear orden PetStore

  @test1
  Scenario: Crear orden
    When creo la orden con id 1. petId 0, quantity 0, shipDate "2024-08-07T20:38:52.584Z",status "placed"
    Then el código de respuesta es 200
    And el type es "unknown"
