package uz.pdp.warehouse.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.pdp.warehouse.payload.WarehouseDto;
import uz.pdp.warehouse.repository.WareHouseRepository;
import uz.pdp.warehouse.service.WareHouseService;

@Controller
@RequestMapping("/warehouse")
public class WareHousePageController {
    @Autowired
    WareHouseRepository wareHouseRepository;
    @Autowired
    WareHouseService wareHouseService;
    @GetMapping
    public  String WareHousePage(Model model){
        model.addAttribute("warehouses",wareHouseRepository.findAll());
        return "warehouse";
    }
//    @GetMapping("/add")
//    public String addWareHousePage(Model model){
//        return "warehouse-add";
//    }
    @PostMapping("/add")
    public String addWareHouseSave(@ModelAttribute WarehouseDto dto){
        wareHouseService.add(dto);
        return "redirect:/warehouse";
    }

}
