# Proyecto DAMTDM - Aplicación de Recetas

Este proyecto es una aplicación móvil desarrollada en **Android** utilizando **Kotlin**. Permite a los usuarios visualizar, agregar, editar y eliminar recetas. Para acceder a la funcionalidad completa, el usuario debe iniciar sesión con un nombre de usuario y contraseña específicos.

## Estructura del Proyecto

### `Receta`
Cada receta está representada por un objeto con las siguientes propiedades:

- **id**: Identificador único de la receta.
- **name**: Nombre de la receta.
- **description**: Descripción de la receta.
- **ingredients**: Ingredientes de la receta.
- **calories**: Calorías de la receta.
- **image**: Imagen asociada a la receta.

---

## Layouts

Los **layouts** definen la estructura visual de las actividades y los elementos de la interfaz de usuario. A continuación se describe cada uno de los principales layouts:

### `activity_login.xml`
Contiene un `LinearLayout` con los siguientes componentes:
- **Campos de texto** para el nombre de usuario y la contraseña.
- **Botón** para iniciar sesión.
- Los campos de texto utilizan un `drawable` personalizado como fondo para un estilo visual consistente.

### `activity_main.xml`
Contiene un `RelativeLayout` que incluye:
- Un **`RecyclerView`** para mostrar la lista de recetas. Los elementos de la lista se adaptan y muestran las recetas disponibles, permitiendo al usuario interactuar con ellas.

### `item_receta.xml`
Define la estructura de cada tarjeta de receta dentro del `RecyclerView`. Cada tarjeta contiene:
- Una **imagen** de la receta (utilizando un `ImageView`).
- El **nombre** y la **descripción** de la receta.
- Un **contenedor** con los iconos de edición y eliminación:
  - **Icono de edición** (lapiz).
  - **Icono de eliminación** (borrar).

---

## Recursos en `drawable`

Estos son los recursos utilizados en el proyecto para los elementos visuales:

- **borrar.png**: Icono utilizado para el botón de eliminación de recetas.
- **boton_login.xml**: Recurso de estilo personalizado para el botón de inicio de sesión.
- **casilla_texto_login**: Recurso para el fondo de los campos de texto en el formulario de inicio de sesión.
- **entrecot_de_ternera.jpeg**: Imagen de muestra que se usa en las tarjetas de receta.
- **lapiz.png**: Icono utilizado para el botón de edición de recetas.

---

## Funcionalidad

### Login
- El usuario debe ingresar el **nombre de usuario** y la **contraseña** correctos para acceder a la lista de recetas. 
- Si la autenticación es exitosa, el usuario es redirigido a la pantalla principal (**`MainActivity`**).

### Visualización de Recetas
- En la actividad principal, las recetas se muestran en un **`RecyclerView`**.
- Cada receta incluye: nombre, descripción e imagen. Además, los usuarios pueden interactuar con ellas para editarlas o eliminarlas.

### Eliminar Receta
- Al hacer clic en el **icono de eliminación** (`borrar.png`), la receta se elimina permanentemente de la lista.
- Se notifica al usuario de que la receta ha sido eliminada.

### Editar Receta
- Al hacer clic en el **icono de edición** (`lapiz.png`), se puede abrir un modal o realizar cualquier acción relacionada con la edición.
- En este caso, simplemente se muestra un **`Toast`** como ejemplo de la acción.

---

## Requisitos

Para compilar y ejecutar este proyecto, necesitarás las siguientes herramientas y dependencias:

- **Android Studio**: IDE recomendado para desarrollar aplicaciones Android.
- **Kotlin**: Lenguaje de programación utilizado en el proyecto.

### Dependencias:
- **RecyclerView**: Para la lista de recetas.
- **CardView**: Para las tarjetas de recetas.
- **ConstraintLayout**: Para organizar los elementos visuales de forma flexible.
- **Material Components**: Para elementos visuales y componentes modernos.


