package uz.pdp.warehouse.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false,unique = true)
    private String name;
    @ManyToOne
    private Category category;
    @OneToOne
    private Attachment attachment;
    @ManyToOne
    private Measurement measurement;
    private UUID code=UUID.randomUUID();
    private Boolean active;
}
