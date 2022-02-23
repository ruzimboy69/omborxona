package uz.pdp.warehouse.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OutputProduct {
    @Id
    @GeneratedValue
    private Integer id;
    private Timestamp date;
    @OneToOne
    private Product product;
    @Column(nullable = false)
    private Integer amount;
    @Column(nullable = false)
    private Double price;
    @ManyToOne
    private Output output;

}
