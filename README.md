# Entornos_de_Programacion_UIS-Actividades_de_clase
El presente repositorio contiene los archivos y ejercicios que se realizan en el curso de Entornos de Programación , dictado por el docente Carlos Adlofo Beltrán Casto, para la Universidad Industrial de Santander. El presente, también contiene lo requerimientos para correr el código

## Requerimientos
El presente repositrio presenta ejercicios con Spring Boot, controlado por el lenguaje Java. Para ejecutarlo se necesitan los siguientes requerimientos, extraidos de los valores que se manejan en mi ordenador:

1. **Java Development Kit (JDK)**: Asegúrese de tener instalado JDK 8 o superior. Puede descargarlo desde [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) o utilizar una distribución de código abierto como [AdoptOpenJDK](https://adoptopenjdk.net/). La versión usada en mi ordenador es:

```sh
java version "21.0.6" 2025-01-21 LTS
Java(TM) SE Runtime Environment (build 21.0.6+8-LTS-188)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.6+8-LTS-188, mixed mode, sharing)
```

2. **Maven**: Spring Boot utiliza Maven para la gestión de dependencias y la construcción del proyecto. Puede descargar Maven desde [su sitio oficial](https://maven.apache.org/download.cgi) e instalarlo siguiendo las instrucciones.

3. **IDE**: Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o Spring Tool Suite (STS) es altamente recomendable para facilitar el desarrollo. Estos IDEs tienen soporte integrado para proyectos Spring Boot.

4. **Spring Boot CLI (opcional)**: La interfaz de línea de comandos de Spring Boot puede ser útil para iniciar rápidamente nuevos proyectos Spring Boot. Puede instalarla siguiendo las instrucciones en [la documentación oficial](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-installing-the-cli).

5. **Dependencias del Proyecto**: Asegúrese de incluir las dependencias necesarias en su archivo `pom.xml` (para Maven) o `build.gradle` (para Gradle). Las dependencias comunes incluyen `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, y `spring-boot-starter-security`.

6. **Base de Datos**: Si su proyecto requiere una base de datos, asegúrese de tener una base de datos compatible instalada y configurada. Las opciones comunes incluyen MySQL, PostgreSQL, y H2 (para pruebas).

7. **Configuración del Proyecto**: Configure su proyecto Spring Boot mediante el archivo `application.properties` o `application.yml` para definir propiedades como la configuración de la base de datos, el puerto del servidor, y otros parámetros específicos de la aplicación.

Con estos requerimientos, estará listo para ejecutar y desarrollar su proyecto de Spring Boot con Java.