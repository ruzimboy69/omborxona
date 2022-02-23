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
public class Output {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Timestamp date;
    @ManyToOne
    private Currency currency;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Client client;
    @Column(nullable = false)
    private String factureNumber;
}
