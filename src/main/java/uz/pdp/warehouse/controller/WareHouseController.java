package uz.pdp.warehouse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.warehouse.payload.ApiResponse;
import uz.pdp.warehouse.payload.WarehouseDto;
import uz.pdp.warehouse.repository.WareHouseRepository;
import uz.pdp.warehouse.service.WareHouseService;

@Controller
@RequestMapping("/warehouse")
public class WareHouseController {
    @Autowired
    WareHouseRepository wareHouseRepository;
    @Autowired
    WareHouseService wareHouseService;

//    @PostMapping("/add")
//    public ApiResponse addWareHouse(@RequestBody WarehouseDto warehouseDto){
//        return wareHouseService.add(warehouseDto);
//    }
}
