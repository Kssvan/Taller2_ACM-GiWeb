# BeanLab

# Ejercicio 2: API de Pokémon (GET con parámetros)

## Descripción
Esta aplicación está desarrollada en **Spring Boot** y permite consultar información básica de cualquier Pokémon usando la [PokeAPI](https://pokeapi.co/).  
El objetivo principal es recibir el nombre de un Pokémon y devolver información como nombre, peso y habilidades.  

---

##  Características
- Recibe el nombre del Pokémon por parámetro en la URL.
- Muestra información básica:
  - Nombre
  - Peso
  - Lista de habilidades
- Utiliza **WebClient** (reactivo) en lugar de RestTemplate.
- Respuesta personalizada simplificada, mostrando solo los campos necesarios.
- Manejo de errores básicos cuando el Pokémon no existe.

---

##  Tecnologías
- Java 21
- Spring Boot 3.5.x
- Spring WebFlux (para WebClient)
- Maven

---

##  Configuración
1. Clonar el repositorio:

```bash
git clone <url-del-repo>
