package pub.ycm.common.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pub.ycm.common.entity.Order;
import pub.ycm.common.entity.dto.CreateOrderDto;

/**
 * 商品Client
 *
 * @author Charming
 * @since 2019-11-22
 */
@Component
@FeignClient(name = "transaction-order")
public interface OrderClient {
    @PostMapping("/order")
    Order createOrder(@RequestBody CreateOrderDto createOrderDto);
}
