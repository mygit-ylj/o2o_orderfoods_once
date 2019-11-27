package com.yanglijing.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName ProductVo
 * @Description: TODO
 * @Author :yanglijing
 * @Date 2019/11/14
 * @Version V1.0
 **/
@Data
public class ProductVo {
    private String productName;
    private BigDecimal minPrice;
    private BigDecimal maxPrice;
    private Integer productType;

    private String propName;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endDate;

    private Integer pageNum;
    private Integer pageSize;

}
