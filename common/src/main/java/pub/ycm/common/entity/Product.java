package pub.ycm.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author Charming
 * @since 2019-11-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("product")
public class Product extends BaseEntity {
    private static final long serialVersionUID = -8777050622162213138L;
    private String name;
    private Integer price;
    private Integer stock;
}
