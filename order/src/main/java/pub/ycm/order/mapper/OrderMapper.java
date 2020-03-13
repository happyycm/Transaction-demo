package pub.ycm.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pub.ycm.common.entity.Order;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
