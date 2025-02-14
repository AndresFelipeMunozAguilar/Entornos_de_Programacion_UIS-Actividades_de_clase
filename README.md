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

2. **Maven**: Spring Boot utiliza Maven para la gestión de dependencias y la construcción del proyecto. Puede descargar Maven desde [su sitio oficial](https://maven.apache.org/download.cgi) e instalarlo siguiendo las instrucciones. La versión usada en mi ordenador es:

```Sh
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: C:\Maven\apache-maven-3.9.9
Java version: 21.0.6, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-21
Default locale: es_CO, platform encoding: UTF-8
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"

```

3. **IDE**: Un entorno de desarrollo integrado (IDE) como IntelliJ IDEA, Eclipse o Spring Tool Suite (STS) es altamente recomendable para facilitar el desarrollo. Estos IDEs tienen soporte integrado para proyectos Spring Boot. En mi caso, uso **Visual Studio Code**

4. **Spring Boot CLI (opcional)**: La interfaz de línea de comandos de Spring Boot puede ser útil para iniciar rápidamente nuevos proyectos Spring Boot. Puede instalarla siguiendo las instrucciones en [la documentación oficial](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-installing-the-cli).

5. **Dependencias del Proyecto**: Asegúrese de incluir las dependencias necesarias en su archivo `pom.xml` (para Maven). Las dependencias comunes incluyen `spring-boot-starter-web`, `spring-boot-starter-data-jpa`, y `spring-boot-starter-security`.

6. **Base de Datos**: Si su proyecto requiere una base de datos, asegúrese de tener una base de datos compatible instalada y configurada. Las opciones comunes incluyen MySQL, PostgreSQL, y H2 (para pruebas).

7. **Configuración del Proyecto**: Configure su proyecto Spring Boot mediante el archivo `application.properties` o `application.yml` para definir propiedades como la configuración de la base de datos, el puerto del servidor, y otros parámetros específicos de la aplicación.

Con estos requerimientos, estará listo para ejecutar y desarrollar esto proyecto de Spring Boot con Java.

## Extensiones para Visual Studio Code

Para desarrollar y ejecutar proyectos de Java y Spring Boot en Visual Studio Code, es recomendable instalar las siguientes extensiones:

1. **Java Extension Pack**: Este paquete incluye varias extensiones esenciales para el desarrollo en Java, como el soporte para el lenguaje Java, depuración, pruebas y administración de proyectos. Puede instalarlo desde el [Marketplace de Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack).

2. **Spring Boot Extension Pack**: Este paquete proporciona herramientas específicas para el desarrollo con Spring Boot, incluyendo soporte para inicialización de proyectos, edición de archivos de configuración y administración de dependencias. Disponible en el [Marketplace de Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-spring-boot).

3. **Debugger for Java**: Esta extensión permite depurar aplicaciones Java directamente desde Visual Studio Code. Es parte del Java Extension Pack, pero también puede instalarse por separado desde el [Marketplace de Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug).

4. **Maven for Java**: Proporciona soporte para la administración de proyectos Maven, incluyendo la ejecución de objetivos y la administración de dependencias. También es parte del Java Extension Pack y está disponible en el [Marketplace de Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-maven).

5. **Spring Initializr Java Support**: Facilita la creación de nuevos proyectos Spring Boot utilizando Spring Initializr directamente desde Visual Studio Code. Puede instalarse desde el [Marketplace de Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-spring-initializr).

Con estas extensiones, podrá desarrollar, ejecutar y depurar proyectos de Java y Spring Boot de manera eficiente en Visual Studio Code.