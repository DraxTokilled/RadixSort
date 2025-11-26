# RadixSort Java

Este proyecto implementa el algoritmo de **Radix Sort** en Java, permitiendo ordenar números enteros de manera eficiente y rápida. El código está documentado y diseñado para ser sencillo de entender y ejecutar.

## ¿Qué es Radix Sort?

Radix Sort es un algoritmo de ordenamiento no comparativo que agrupa los números por sus dígitos y los ordena progresivamente. Es especialmente útil cuando hay grandes cantidades de números y cuando se requiere alto rendimiento.

## ¿Cómo funciona este programa?

1. **Lectura de datos:**  
   El programa lee los números enteros, uno por línea, desde el archivo `entrada.txt`.

2. **Ordenamiento:**  
   Los números se almacenan en un arreglo y se ordenan utilizando el método `radixSort`, que a su vez utiliza `countingSort` modificado para cada posición decimal.

3. **Salida:**  
   Los números ordenados se guardan en el archivo `salida_radix.txt`, uno por línea.

## Uso rápido

1. Prepara tu archivo de entrada llamado `entrada.txt` en el mismo directorio que el programa, con números enteros (uno por línea).

2. Compila el programa:
   ```bash
   javac Radix.java
   ```

3. Ejecuta el programa:
   ```bash
   java Radix
   ```

4. Revisa el archivo `salida_radix.txt` para el resultado ordenado.

## Ejemplo de `entrada.txt`

```
45
3
12
6
99
23
```

## Ejemplo de `salida_radix.txt`

```
3
6
12
23
45
99
```

## Archivos principales

- `Radix.java`: Código fuente principal del algoritmo.
- `entrada.txt`: Archivo de entrada con los números a ordenar.
- `salida_radix.txt`: Archivo generado con la salida ordenada.

## Créditos

Desarrollado para [Nombre del profesor], como demostración del algoritmo Radix Sort en la materia de Estructuras de Datos con Java.

---

Si tienes dudas, comentarios o sugerencias, ¡no dudes en preguntar!
