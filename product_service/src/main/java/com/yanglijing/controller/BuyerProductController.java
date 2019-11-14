package com.yanglijing.controller;

import com.yanglijing.service.ProductService;
import com.yanglijing.vo.BuyerProductInfoVO;
import com.yanglijing.vo.CodeMsg;
import com.yanglijing.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/list")
    public ResponseVO<List<BuyerProductInfoVO>> selectBuyerFoods(){

        List<BuyerProductInfoVO> buyerProductInfoVOList = productService.selectAllProducts();
        if(buyerProductInfoVOList != null && buyerProductInfoVOList.size()>0){
            return ResponseVO.success(buyerProductInfoVOList);
        }
        return ResponseVO.error(CodeMsg.PRODUCT_NOT_EXIST);
    }


}
