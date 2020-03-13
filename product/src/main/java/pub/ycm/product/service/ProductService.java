package pub.ycm.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import pub.ycm.common.entity.Product;
import pub.ycm.common.entity.dto.StockDownDto;


public interface ProductService  extends IService<Product> {
    Product stockDown(StockDownDto stockDownDto);
}
