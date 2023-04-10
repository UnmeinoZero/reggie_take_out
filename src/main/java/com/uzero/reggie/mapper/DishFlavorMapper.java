package com.uzero.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uzero.reggie.entity.Dish;
import com.uzero.reggie.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 千叶零
 * @version 1.0
 * create 2023-04-02  16:31:54
 */
@Mapper
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {
}
