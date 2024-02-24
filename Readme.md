# Proyecto Programación movil: App Tienda

## Realizado por: Leo Pérez Hinojosa

¡Bienvenido a mi aplicación! Este proyecto abarca en su totalidad las versiones que se han demandado para la asignatura de **Programación Movil** en el ciclo de **Desarrollo de Aplicaciones Multiplataforma (DAM)** del Instituto **Virgen del Cármen**. Con esta introducción, se pretende presentar cada parte debidamente documentada.

## Versiones: Índice:

Éstas son las versiones y la especificación de cada una de ellas:

- Versión 1.0.- Esta versión, sólo la planificación y login.
- Versión 1.1.- Esta primera versión, Utilización del RecyclerView y posibilidad de borrar. Añadiremos nuestras propias clases POJO y Adaptadores.
- Versión 1.2.- Esta versión, es el crud completo con alta, edición y borrado.
- Versión 1.3.- A esta versión, añadiremos un Navigation Drawer o Navigation Bottom.
- Versión 1.4.- Adaptación de vuestro proyecto con mvvm e inyección de dependencias con Hilt.
- Versión 2.1 .- Podremos validar el login sólo la primera vez y editar/añadir/eliminar con persistencia Room o Realm. (Crearemos una rama, ya que simularemos una mala decisión de Acceso a datos)
- Versión 3.1.- Añadimos la posibilidad de insertar imágenes mediante cámara, audio, Picasso y Glyde.
- Versión 3.2.- Añadiremos posicionamiento de cada item.
- Versión 4.1.- Adaptamos nuestro proyecto con API REST.
- Versión 4.2.- Crearemos listados genéricos para todos los usuarios registrados.

## Comienzo del proyecto:

Se comienza introduciendo una aplicación vacía en el IDE de programación adaptado a **Android:** `Android Studio`. Los pasos a seguir son:

- 1º - Abrir Android Studio
- 2º - En la pestaña de entrada: **New Project** ->  **Phone and Tablet** -> **Empty Views Activity** -> **Next**
- 3º - Rellenar cada apartado en el formulario: Name(nombre de la aplicación), Package name(Nombre único del paquete),
Save location (Carpeta de guardado), Language (*Kotlin*), Minimun SDK (En este caso: *API 28*), y Build configuration language (En este caso: *Kotlin DSL* (Recomendado)).
- 4º - Pulsar **Finish**. El proyecto comenzará después de que el programa cargue las configuraciones y todo el proyecto.
- 5º - Reparar los posibles fallos de compilación de Android Studio. Para que el programa quede correctamente configurado, se cargan las siguientes opciones: En el archivo **build.gradle.kts(Module:App)**, deben cambiarse las siguientes opciones:

```
compileSdk: 33 -> compileSdk: 34

targetSdk: 33 -> targetSdk: 34
```

Y pulsar **Sync Now**, para que el proyecto quede bien configurado. Se volverá posteriormente a este archivo, ya que contiene muchas configuraciones. No importa si señala fallos, ya que el programa a veces tarda en dejar de señalarlos.

## Página inicial:

