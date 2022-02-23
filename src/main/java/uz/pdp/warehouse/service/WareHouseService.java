package uz.pdp.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.warehouse.entity.Warehouse;
import uz.pdp.warehouse.payload.ApiResponse;
import uz.pdp.warehouse.payload.WarehouseDto;
import uz.pdp.warehouse.repository.WareHouseRepository;

@Service
public class WareHouseService {
    @Autowired
    WareHouseRepository wareHouseRepository;

    public ApiResponse add(WarehouseDto warehouseDto){
        Warehouse warehouse=new Warehouse();
        warehouse.setName(warehouseDto.getName());
        Warehouse save=wareHouseRepository.save(warehouse);

        return new ApiResponse("added",true,save);
    }
}
