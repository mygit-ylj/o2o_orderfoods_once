package com.yanglijing.controller;

import com.yanglijing.pojo.ProductCategory;
import com.yanglijing.pojo.ProductInfo;
import com.yanglijing.service.ProductService;
import com.yanglijing.vo.BuyerProductInfoVO;
import com.yanglijing.vo.CodeMsg;
import com.yanglijing.vo.ProductVo;
import com.yanglijing.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buyer/product")
@CrossOrigin
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/orde_list")
    public ResponseVO<List<ProductInfo>> selectProductList(@RequestBody ProductVo productVo){

        Page<ProductInfo> page = productService.selectByCondition(productVo);
        return ResponseVO.success(page);
    }

    @GetMapping("/cat_list")
    public ResponseVO<List<ProductCategory>> selectAllProductCategory(){

        return ResponseVO.success(productService.selectAllCats());
    }

    @GetMapping("/list")
    public ResponseVO<List<BuyerProductInfoVO>> selectBuyerFoods(){

        List<BuyerProductInfoVO> buyerProductInfoVOList = productService.selectAllProducts();
        if(buyerProductInfoVOList != null && buyerProductInfoVOList.size()>0){
            return ResponseVO.success(buyerProductInfoVOList);
        }
        return ResponseVO.error(CodeMsg.PRODUCT_NOT_EXIST);
    }



}
