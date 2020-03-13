package pub.ycm.customer.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.ycm.common.entity.dto.BuyDto;
import pub.ycm.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    final
    CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/buy")
    public void buy(@RequestBody BuyDto buyDto){
        customerService.buy(buyDto);
    }
}
