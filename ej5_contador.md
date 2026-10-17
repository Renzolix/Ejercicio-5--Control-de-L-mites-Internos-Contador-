# Ejercicio 5: Contador

## Explicación Lógica
1. **Sobrecarga de Constructores:** Se incluyó un constructor sin parámetros (inicializa el valor en `0`) y uno parametrizado para permitir un valor inicial personalizado.
2. **Control de Límites:** El método `decrementar()` incluye la regla de negocio `if (this.valor > 0)` para garantizar que el contador nunca adquiera números negativos.
3. **Manipulación del Estado:** Los métodos `incrementar()`, `decrementar()` y `resetear()` alteran el atributo interno, mientras que `getValor()` permite consultar el entero actual.