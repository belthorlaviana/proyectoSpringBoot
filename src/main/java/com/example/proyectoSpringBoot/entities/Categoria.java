package com.example.proyectoSpringBoot.entities;

import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name = "Categorias")
@Data
public class Categoria {
    //puedo sustituir la linea  15 y 16 por 13 y 14
    //@javax.persistence.Id
    //@Column(name = "Id", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//suma 1 la ultima clave de la base de datos
    private int id;
    //@Column(name = "Nombre", nullable = false) // estes linies nun faen falta si el nombre de los atributos corresponden con la base de datos, ignora mayus
    private String nombre;
    //@Column(name = "Descripcion", nullable = false)
    private String descripcion;


}
