## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

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
