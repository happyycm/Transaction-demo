package pub.ycm.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单
 * </p>
 *
 * @author Charming
 * @since 2019-11-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("orders")
public class Order extends BaseEntity {
    private static final long serialVersionUID = 3842966398748923840L;
    private Long customerId;
    private String customerName;
    private Long productId;
    private String productName;
    private Integer price;
    private Integer productCount;
}