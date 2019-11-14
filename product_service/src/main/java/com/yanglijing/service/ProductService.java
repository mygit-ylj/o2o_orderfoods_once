package com.yanglijing.service;

import com.yanglijing.vo.BuyerProductInfoVO;

import java.util.List;

/**
 * @InterfaceName ProductService
 * @Description: TODO
 * @Author :lianweibo
 * @Date 2019/11/14
 * @Version V1.0
 **/
public interface ProductService {
    public List<BuyerProductInfoVO> selectAllProducts();
}
