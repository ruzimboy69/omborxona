package uz.pdp.warehouse.payload;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private Integer warehouseId;
    private Boolean active;
}
