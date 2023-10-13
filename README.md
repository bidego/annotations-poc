# Annotations POC

Prueba de concepto que escanea e invoca metodos anotados
de un aplicacion Java

## Requisitos
- Java JDK
- Makefile (opcional)

### Manual de uso

0. Generar sources.txt si se cambiaron o agregaron archivos .java
Genera un txt con un listado de todos los directorios (packages java)

`find ./src/ -type f -name "*.java" > sources.txt`

1. Compilar todos los paquetes a bytecode (.java > .class)
Compila los archivos java de todo el proyecto y en la ruta out

`javac -d ./out/ @sources.txt`

2. Ejecutar aplicacion
Desde el directorio out, ejecuta la Main Class

`cd out && java annotations.AnnotationsPoc`

### Comandos Makefile

0. `make generate-sources`
1. `make compule`
2. `make run`