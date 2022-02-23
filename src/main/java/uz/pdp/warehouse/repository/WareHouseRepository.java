package uz.pdp.warehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.warehouse.entity.Warehouse;

public interface WareHouseRepository extends JpaRepository<Warehouse,Integer> {
}
