package conroller;

import model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ItemService;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemService itemService;
    @GetMapping("/items")
    @ResponseBody
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }
    @PostMapping("/items")
    @ResponseBody
    public String addItem(@RequestBody Item item) {
        return itemService.addItem(item);
    }

    @PutMapping("/items")
    @ResponseBody
    public String updateItem(@RequestBody Item item) {

        return itemService.updateItem(item);
    }

    @DeleteMapping("/items")
    @ResponseBody
    public String deleteItem(@RequestBody Item item){
        return itemService.deleteItem(item);

    }

}
