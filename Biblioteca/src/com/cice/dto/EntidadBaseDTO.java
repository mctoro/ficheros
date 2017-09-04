/*
En la biblioteca hay libros, comics y revistas. Interesa guardar siempre la fecha de publicación y
el nombre. Además, de los libros se debe guardar la edición, el ISBN y el autor (que es único);
de las revistas el número y la periodicidad y de los comics el número y la colección.
Sólo presto mis libros y debo saber si un libro está prestado o no. Aunque de momento no lo
necesito puede que el futuro quiera prestar otros elementos de mi biblioteca. ¿Utilizo una
interfaz o herencia? ¿Qué métodos necesito?
Escribir la clase Disco -hereda de Multimedia (titulo (String), formato(enumerado), duración)
teniendo en cuenta que los discos se pueden prestar.
Diseñar el sistema de biblioteca y crear un menú para las opciones
a) Número de libros prestados ¿Se podría reutilizar el método para discos?
b) Publicaciones anteriores a una fecha
c) Imprimir el listado de publicaciones y discos
d) Imprimir el listado de publicaciones y discos diferenciando por prestado o no
 */
package com.cice.dto;

/**
 *
 * @author Miguel
 */
public class EntidadBaseDTO {
    
    private String fechaPublicacion;
    private String nombre;

    public EntidadBaseDTO(String fechaPublicacion, String nombre) {
        this.fechaPublicacion = fechaPublicacion;
        this.nombre = nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
