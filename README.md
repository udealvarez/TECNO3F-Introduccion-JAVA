# TECNO3F-Introduccion-JAVA

## TP Final Java - Tecno3F

Este proyecto en Java desarrolla un sistema de gestión para la policía de Tres de Febrero, diseñado para administrar policías y las armas que tienen asignadas. Permite la creación de instancias de policías, la asignación de armas cortas y largas, y la consulta de información detallada sobre cada uno de estos elementos. Además, el sistema incluye la capacidad de comparar armas largas basadas en su nivel de clasificación.

Agradecezco a **TECNO3F** por el apoyo y conocimiento adquirido durante el curso el cual hicieron posible el desarrollo de este proyecto.

---

## Descripción del Proyecto

La Policía de Tres de Febrero requiere un sistema para gestionar las armas asignadas a sus oficiales. Este proyecto responde a esa necesidad, cumpliendo con los siguientes requisitos:

### Requerimientos del Sistema

1. **Gestión de Policías y Armas**:
   - Cada arma solo puede pertenecer a un policía.
   - Datos necesarios de los policías: nombre, apellido y número de legajo.
   - Se utiliza un constructor que permite asignar todos los atributos al crear un objeto.

2. **Especificaciones de Armas**:
   - Todas las armas cuentan con: cantidad de municiones, alcance en metros, marca, calibre y estado (que puede ser “NUEVA”, “EN MANTENIMIENTO” o “EN USO”).
   - Existen dos tipos de armas: **cortas** y **largas**.

3. **Características Específicas de Armas**:
   - **Armas cortas**: tienen como característica adicional si son automáticas o no.
   - **Armas largas**: incluyen un sello del RENAR, una descripción justificando su uso y un nivel que va del 1 al 5.

### Funcionalidades del Sistema

- **Condiciones de Uso**:
  - Cualquier arma debe cumplir con ciertas condiciones para ser utilizada por un policía en un enfrentamiento: debe estar en estado “EN USO” y tener un calibre de 9 mm o superior.

- **Comparación entre Armas Largas**:
  - Las armas largas pueden compararse entre sí; una arma larga es considerada superior a otra si tiene un nivel mayor.

- **Verificación de Alcance en Armas Cortas**:
  - Para las armas cortas, el sistema verifica si pueden disparar a una distancia mayor a 200 metros.

---

## Tecnologías Utilizadas

- **Lenguaje**: Java

---


