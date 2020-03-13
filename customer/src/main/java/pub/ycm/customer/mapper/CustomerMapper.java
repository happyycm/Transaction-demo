package pub.ycm.customer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pub.ycm.common.entity.Customer;

/**
 * <p>
 * 顾客 mapper
 * </p>
 *
 * @author Charming
 * @since 2019-11-14
 */
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}
