Feature: Cálculo de Imposto de Renda

  Scenario Outline: Calcular imposto com base na renda
    Given a renda de <renda>
    When calcular o imposto
    Then o imposto deve ser <impostoEsperado>

  Examples:
    | renda | impostoEsperado |
    | 2000  | 0               |
    | 5000  | 200             |
    | 10000 | 900             |
    | 15000 | 1900            |
