# Patrón Singleton usando AOP (AspectJ)

Este repositorio demuestra cómo implementar el patrón **Singleton** mediante **Programación Orientada a Aspectos (AOP)** usando **AspectJ**, evitando modificar directamente la clase original (`ConfigManager`).  
El aspecto (`SingletonAspect.aj`) intercepta cualquier llamada al constructor de `ConfigManager` y garantiza que solo exista **una única instancia** durante toda la ejecución del programa.

---

## Objetivo del proyecto

- Implementar un Singleton sin tocar la clase principal.
- Demostrar cómo AOP permite separar la lógica transversal (control de instancias) del código base.
- Comparar el enfoque tradicional en OOP vs el enfoque modularizado con AOP.

---

## Estructura de Repositorio
El proyecto utiliza una estructura simple para trabajar con AspectJ sin Maven ni Gradle. La organización es la siguiente:

- `src/`: Contiene todos los archivos fuente del proyecto:
- `lib/`: Contiene las dependencias necesarias para compilar y ejecutar AspectJ.
  * `aspectjtools.jar`: Contiene el acompilador de AspectJ
  * `aspectjrt.jar`: Runtime de AspectJ.
  * `aspectjweaver.jar`: Es el weaver en tiempo de ejecución.
- `bin/`: Carpeta donde se generan los archivos .class ya compilados y tejidos (woven).

---

## Testeo

Visual Studio Code puede compilar archivos Java usando javac, pero no es capaz de compilar ni tejer archivos de AspectJ (`.aj`). Esto significa que si se intenta ejecutar el proyecto desde el botón “Run” del IDE, ocurrirá lo siguiente:
* Los archivos `.java` se compilan normalmente.
* Los archivos `.aj` no se procesan.
* El weaving (tejido del aspecto) no se aplica.
* El patrón Singleton implementado en AspectJ no funciona.
* Las instancias de `ConfigManager` se crearán de manera normal, rompiendo el propósito del aspecto.

### Para compilar:
```
java -cp "lib/aspectjtools.jar;lib/aspectjrt.jar" org.aspectj.tools.ajc.Main -d bin src/*.java src/*.aj
```
### Para ejecutar:
```
java -cp "bin;lib/aspectjrt.jar" Main
```

### Salida esperada: 
```
=== Configuración del Sistema ===
Volumen: 50.0
Idioma: EN
Dificultad: 3
=================================
=== Configuración del Sistema ===
Volumen: 50.0
Idioma: EN
Dificultad: 3
=================================
true 
```
La última línea (`true`) confirma que ambas instancias devueltas son la misma, validando que el aspecto está aplicando correctamente el patrón Singleton.
