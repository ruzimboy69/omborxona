package uz.pdp.warehouse.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Input_product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Product product;
    @Column(nullable = false)
    private Integer amount;
    @Column(nullable = false)
    private Double price;
    @Column(nullable = false)
    private Timestamp expiredDate;
    @ManyToOne
    private Input input;
}
