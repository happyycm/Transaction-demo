package pub.ycm.common.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pub.ycm.common.entity.Product;
import pub.ycm.common.entity.dto.StockDownDto;

/**
 * 订单Client
 *
 * @author Charming
 * @since 2019-11-22
 */
@Component
@FeignClient(name = "transaction-product")
public interface ProductClient {
    @PostMapping("/product/stock/down")
    Product stockDown(@RequestBody StockDownDto stockDownDto);

    @GetMapping("/product/{productId}")
    Product getById(@PathVariable Long productId);
}
