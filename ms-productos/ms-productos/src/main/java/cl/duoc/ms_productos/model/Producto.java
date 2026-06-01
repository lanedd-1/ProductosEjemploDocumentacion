package cl.duoc.ms_productos.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "productos")
@Entity
//describir la tabla que se esta creando
@Schema(description = "Entidad que representa un producto del catálogo")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(
        description = "Identificador único generado automaticamente por la BD",
        example="1",
        accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;
    @Column(nullable = false,length = 100)
    @Schema(
        description = "Nombre descriptivo del producto",
        example="Notebook LENOVO"
    )
    private String nombre;

    @Column(length=255)
    @Schema(
        description = "Descripcion detallada del producto(opcional)",
        example = "Notebook de 25 pulgadas, Ryzen 5, 16GBRAM, SSD 1 TB"
    )
    private String descripcion;

    @Column(nullable=false)
    @Schema(
        description = "Precio del producto en dolares",
        example = "1499,99"
    )
    private Double precio;

    @Column(nullable = false)
    @Schema(
        description = "Cantidad disponible en el inventario",
        example = "10"
    )
    private int stock;

}
