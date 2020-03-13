package pub.ycm.product.controller;

import org.springframework.web.bind.annotation.*;
import pub.ycm.common.entity.Product;
import pub.ycm.common.entity.dto.StockDownDto;
import pub.ycm.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
    final
    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/stock/down")
    public Product stockDown(@RequestBody StockDownDto stockDownDto){
        return productService.stockDown(stockDownDto);
    }

    @GetMapping("/{productId}")
    public Product getById(@PathVariable Long productId){
        return productService.getById(productId);
    }
}
