package pub.ycm.common.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class StockDownDto implements Serializable {
    private static final long serialVersionUID = -3794676970519806072L;
    Long productId;
    Integer productCount;
}
