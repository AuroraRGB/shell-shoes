package com.aurora.dao;

import com.aurora.model.dto.OrderDetailsDTO;
import com.aurora.model.dto.OrderQueryById;
import com.aurora.model.entity.Myorder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * MyorderDAO继承基类
 */
public interface MyorderDAO extends MyBatisBaseDao<Myorder, Integer> {

    int                   save(Myorder order);

    int                   updateStatus(@Param("status") Integer status, @Param("orderId") Integer orderId);

    List<Myorder>         queryAll(Integer custId);

    List<Myorder>         queryByShoesName(@Param("shoesName") String shoesName,@Param("custId") Integer custId);

    List<OrderQueryById>  queryById(@Param("orderNumber") String orderNumber, @Param("custId") Integer custId);

    List<OrderDetailsDTO> queryByCustId(@Param("custId") Integer custId);
}