package pub.ycm.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pub.ycm.common.entity.Order;
import pub.ycm.common.entity.dto.CreateOrderDto;

public interface OrderService extends IService<Order> {
    Order createOrder(CreateOrderDto createOrderDto);
}
