package com.aurora.dao;

import com.aurora.entity.OrderDetailKey;
import com.aurora.util.MyBatisUtil;
import org.junit.Test;

public class orderDetail {
    @Test
    public void testOrderDetail(){
        OrderDetailKey orderDetailKey=new OrderDetailKey();
        orderDetailKey.setOrderId(1);
        orderDetailKey.setShoesDetailId(1);
        OrderDetailDAO orderDetailDAO= MyBatisUtil.getSession().getMapper(OrderDetailDAO.class);
        System.out.println(orderDetailDAO.selectByPrimaryKey(orderDetailKey));
    }
}
