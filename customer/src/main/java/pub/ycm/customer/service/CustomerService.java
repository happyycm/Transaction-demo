package pub.ycm.customer.service;


import com.baomidou.mybatisplus.extension.service.IService;
import pub.ycm.common.entity.Customer;
import pub.ycm.common.entity.dto.BuyDto;

public interface CustomerService extends IService<Customer> {
    void buy(BuyDto buyDto);
}
