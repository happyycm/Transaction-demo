package pub.ycm.common.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class BuyDto implements Serializable {
    private static final long serialVersionUID = -2679562360354090890L;

    Long customerId;
    Long productId;
    Integer productCount;
}
