package pub.ycm.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 顾客
 * </p>
 *
 * @author Charming
 * @since 2019-11-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("customer")
public class Customer extends BaseEntity {
    private static final long serialVersionUID = -1982922502608761133L;
    private Integer balance;
    private String name;
}
