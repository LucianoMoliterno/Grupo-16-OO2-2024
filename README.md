# Stock System

<div align="center">
<h1> Sistema de Stock orientado a una tienda de electronica</h1>
</div>
"Antes que nada, ¿tienes claro qué significa un sistema de stock inteligente? Un sistema de stock se vuelve inteligente cuando utiliza dispositivos IoT, como sensores, para monitorear inventarios en tiempo real y ejecutar acciones automáticas para optimizar la gestión. Estas acciones no solo mejoran la eficiencia operativa, como la optimización de rutas de distribución y la predicción de demanda, sino que también tienen un impacto positivo en la optimización de recursos y la reducción de costos, mejorando así la calidad del servicio y la satisfacción del cliente."
(https://www.mygestion.com/blog/tipos-de-stock)

### Se espera que el TP cuente con los siguientes puntos:
#### Registro inicial: 

El proceso comienza con el registro inicial de todos los productos que la empresa
tiene en su inventario. 

#### Entrada de productos: 

Cada vez que llega un nuevo lote de productos al almacén o lugar de
almacenamiento, se registra en el sistema.

#### Salida de productos en stock: 

Cuando se vende un producto, se registra la salida en el sistema.

#### Control de niveles de stock: 

El sistema monitorea constantemente los niveles de stock de cada
producto. 

#### Reabastecimiento:

Cuando se activa una alerta de nivel bajo de stock, se inicia el proceso de
reabastecimiento. 

#### Seguimiento y análisis: 

Además de controlar los niveles de stock, el sistema puede proporcionar
informes y análisis detallados sobre el rendimiento del inventario. 

### Se espera que en la plataforma como mínimo pueda:
1. Usuario Administrador
   
    a. Alta, baja y modificación de productos de la organización.
   
    b. Alta de nuevo lote de stock de un producto de la organización.
   
    c. Vista de informes de estado de productos en relación a su stock.
   
    d. Alta de pedido de aprovisionamiento de stock de un producto.
   
3. Usuario Cliente:
   
    a. Generar una nueva compra de productos, lo cual genera una baja en el stock (si corresponde).
   
5. Usuarios en general:
   
    a. Login.
   
    b. Logout.
---
## Estructura de ramas
- **main:**
Rama principal del proyecto y representa la versión estable del código.

- **development:**
Rama intermedia donde se integran los cambios de las diferentes funcionalidades desarrolladas por el equipo. Sirve como un entorno de prueba en conjunto antes de llevar los cambios a la rama **main**.

Cada integrante del equipo creará ramas separadas para desarrollar las funcionalidades asignadas. Estas ramas se basarán en la rama **development** y se fusionarán con ella una vez que las funcionalidades estén completas y probadas.


## Integrantes:
- [Newman Barbara. [Parking]](https://github.com/BarbaraNewman)
- [Ramos Nayla María. [Alumbrado]](https://github.com/naylamarie)
- [Robles Flores Sergio. [Recolectores]](https://github.com/ImNotThrasher)
- [Spinazzola Luciano Nicolas. [Sanitarios]](https://github.com/LucianoSpinazzola)

### Videos de demostración  :
- [Presentacion de Barbara Newman y Sergio Robles. ](https://youtu.be/asVmbaAXafE)

## Diagrama de Clases
<img src="Diagrama de Clases - Grupo 17.png"  title="Diagrama de Clases UML">

---

## Tecnologías:
[![Maven](https://skillicons.dev/icons?i=maven)](https://maven.apache.org/)
[![Java](https://skillicons.dev/icons?i=java)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Spring](https://skillicons.dev/icons?i=spring)](https://spring.io/projects/spring-boot)
[![Hibernate](https://skillicons.dev/icons?i=hibernate)](https://hibernate.org/)
[![MySQL](https://skillicons.dev/icons?i=mysql)](https://www.mysql.com/)

## Instalación y configuración del proyecto
- Verificar Dependencias
- Crear Base de Datos
- Configurar Variables de Entorno
- Compilar  proyecto
- Cargar datos de prueba
- Ejecutar servidor

## Instrucciones

Debe verificarse que se tenga instalado Java JDK 17 y compilar el proyecto previo a correr el servidor.

### Verificación de la versión de Java:
`java -version`


### Creacion de la base de datos:
Ejecutar el script `\create-schema.sql`  
Ejecutar el script `\insert-ALL-data.sql` despues de la compilación, esto incluye datos de prueba.

Usuario y Contraseña; `admin` `admin`  
Usuario y Contraseña; `auditor` `auditor`

### Configuracion de variables de entorno:
En `\src\main\resources\application.yml`  
Modificar las propiedades `url:` `username:` y `password:`


### Compilación del proyecto con Maven:
Eliminando archivos antiguos: `mvn clean install`  
Solo compilación: `mvn install`

### Ejecución del servidor Spring Boot:
`mvn spring-boot:run`

### Detener ejecución del servidor Spring Boot:
Presionar las teclas `Ctrl + c`
