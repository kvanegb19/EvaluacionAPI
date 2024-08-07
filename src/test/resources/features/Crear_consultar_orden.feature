Feature: Crear y consultar orden PetStore

  @test3
  Scenario Outline: Crear orden
    When creo la orden con id <id>, petId <petId>, quantity <quantity>, shipDate <shipDate>,status <status>
    Then el código de respuesta es <statusCode>

    Examples:
      | id | petId | quantity | shipDate                | status  | statusCode |
      | 1  | 0     | 0        | "2024-08-07T20:38:52.584Z" | "placed"  | 200        |
      | 2  | 0     | 0        | "2024-08-07T20:38:52.584Z" | "placed"  | 200        |
      | 3  | 0     | 0        | "2024-08-07T20:38:52.584Z" | "placed"  | 200        |

  @test3
  Scenario Outline: Consultar orden
    When consulto la orden con id <orderId>
    Then el código de respuesta sera <statusCode>

    Examples:
      | orderId | statusCode |
      | 1       | 200        |
      | 2       | 200        |
      | 3       | 200        |