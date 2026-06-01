package cl.duoc.ms_productos.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {
    @Schema(
        description = "Id unico del producto, generado automaticamente",
        example = "1",
        accessMode = Schema.AccessMode.READ_ONLY
    )
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    @Size(min = 2,max = 100,message = "El nombre debe tener entre 2 y 100 caracteres")
    @Schema(
        description = "Nombre del producto",
        example = "Pc escritorio DELL",
        requiredMode = Schema.RequiredMode.REQUIRED
    )
    private String nombre;
    
    private String description;

    private double precio;

    private int stock;
}
