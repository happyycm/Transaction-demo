package pub.ycm.common.entity.dto;

import lombok.Data;
import pub.ycm.common.entity.Customer;
import pub.ycm.common.entity.Product;

import java.io.Serializable;

@Data
public class CreateOrderDto implements Serializable {
    private static final long serialVersionUID = -6388559890185965233L;
    private Customer customer;
    private Product product;
    private Integer productCount;
}