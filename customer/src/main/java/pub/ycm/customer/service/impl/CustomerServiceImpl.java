package pub.ycm.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pub.ycm.common.client.OrderClient;
import pub.ycm.common.client.ProductClient;
import pub.ycm.common.entity.Customer;
import pub.ycm.common.entity.Order;
import pub.ycm.common.entity.Product;
import pub.ycm.common.entity.dto.BuyDto;
import pub.ycm.common.entity.dto.CreateOrderDto;
import pub.ycm.common.entity.dto.StockDownDto;
import pub.ycm.customer.mapper.CustomerMapper;
import pub.ycm.customer.service.CustomerService;

@Slf4j
@Service("CustomerService")
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    final
    OrderClient orderClient;
    final
    ProductClient productClient;

    public CustomerServiceImpl(ProductClient productClient, OrderClient orderClient) {
        this.productClient = productClient;
        this.orderClient = orderClient;
    }

    @Override
    public void buy(BuyDto buyDto) {
        Product product = getProductById(buyDto.getProductId());
        Customer customer = this.getById(buyDto.getCustomerId());
        //用户减余额
        customerBalanceDown(customer, product, buyDto.getProductCount());
        //商品减库存
        productStockDown(product, buyDto);
        //生成订单
        createOrder(customer, product, buyDto.getProductCount());
    }

    /**
     * 获取商品详情
     * @param productId 商品ID
     * @return 商品详情
     */
    private Product getProductById(Long productId){
        Product product = productClient.getById(productId);
        return product;
    }


    /**
     * 扣除顾客余额
     * @param customer 客户
     * @param product 商品
     */
    private void customerBalanceDown(Customer customer, Product product, Integer productCount){
        Integer currentBalance = customer.getBalance();
        Integer resultBalance = currentBalance - product.getPrice() * productCount;
        customer.setBalance(resultBalance);
        this.updateById(customer);
    }

    /**
     * 商品减库存
     * @param product 商品
     * @param buyDto 购买信息
     */
    private void productStockDown(Product product, BuyDto buyDto){
        StockDownDto stockDownDto = new StockDownDto();
        stockDownDto.setProductId(product.getId());
        stockDownDto.setProductCount(buyDto.getProductCount());
        productClient.stockDown(stockDownDto);
    }

    /**
     * 创建订单
     * @param customer 顾客
     * @param product 商品
     * @param count 数量
     * @return 订单
     */
    private Order createOrder(Customer customer, Product product,Integer count){
        CreateOrderDto createOrderDto = new CreateOrderDto();
        createOrderDto.setCustomer(customer);
        createOrderDto.setProduct(product);
        createOrderDto.setProductCount(count);
        return orderClient.createOrder(createOrderDto);
    }
}
