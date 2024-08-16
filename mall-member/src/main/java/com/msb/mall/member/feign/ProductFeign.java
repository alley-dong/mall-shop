package com.msb.mall.member.feign;

import com.msb.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("mall-product")
public interface ProductFeign {

    @GetMapping("/product/attr/list")
    R getProduct();
}
