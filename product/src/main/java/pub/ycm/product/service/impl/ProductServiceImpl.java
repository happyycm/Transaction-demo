package pub.ycm.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pub.ycm.common.entity.Product;
import pub.ycm.common.entity.dto.StockDownDto;
import pub.ycm.product.mapper.ProductMapper;
import pub.ycm.product.service.ProductService;

@Slf4j
@Service("ProductService")
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Override
    public Product stockDown(StockDownDto stockDownDto) {
        Product product = this.getById(stockDownDto.getProductId());
        Integer currentStock = product.getStock();
        Integer newStock = currentStock - stockDownDto.getProductCount();
        product.setStock(newStock);
        this.updateById(product);
        return product;
    }
}
