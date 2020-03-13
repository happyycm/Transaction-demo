package pub.ycm.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import pub.ycm.common.entity.Order;
import pub.ycm.common.entity.dto.CreateOrderDto;
import pub.ycm.order.mapper.OrderMapper;
import pub.ycm.order.service.OrderService;

@Service("OrderService")
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public Order createOrder(CreateOrderDto createOrderDto) {
        Order order = new Order();
        order.setCustomerId(createOrderDto.getCustomer().getId());
        order.setCustomerName(createOrderDto.getCustomer().getName());
        order.setProductId(createOrderDto.getProduct().getId());
        order.setProductName(createOrderDto.getProduct().getName());
        order.setPrice(createOrderDto.getProduct().getPrice());
        order.setProductCount(createOrderDto.getProductCount());
        this.save(order);
        return order;
    }
}
