package pub.ycm.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pub.ycm.common.entity.Order;
import pub.ycm.common.entity.dto.CreateOrderDto;
import pub.ycm.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    final
    OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping()
    public Order createOrder(@RequestBody CreateOrderDto createOrderDto){
        return orderService.createOrder(createOrderDto);
    }
}
