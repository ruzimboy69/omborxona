package uz.pdp.warehouse.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String name;
    private Integer categoryId;
    private Integer attachmentId;
    private Integer measurementId;
}
