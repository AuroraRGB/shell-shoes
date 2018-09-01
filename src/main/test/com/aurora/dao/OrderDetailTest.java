package com.aurora.dao;

import com.aurora.entity.OrderDetail;
import com.aurora.entity.OrderDetailKey;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class OrderDetailTest {

    //通过主键进行查询
    @Test
    public void testOrderDetail(){
        OrderDetailKey orderDetailKey = new OrderDetailKey();
        orderDetailKey.setOrderId(1);
        orderDetailKey.setShoesDetailId(1);
        OrderDetailDAO orderDetailDAO = MyBatisUtil.getSession().getMapper(OrderDetailDAO.class);
        System.out.println(orderDetailDAO.selectByPrimaryKey(orderDetailKey));
    }

    @Test
    public void testSaveDetails(){
        SqlSession session                        = MyBatisUtil.getSession();
        com.aurora.entity.OrderDetail orderDetail = new com.aurora.entity.OrderDetail();
        orderDetail.setOrderId(3);
        orderDetail.setQuality(1);
        orderDetail.setShoesDetailId(1);
        orderDetail.setOrderShoesSize("44");
        orderDetail.setOrderShoesColor("white");
        OrderDetailDAO detailDAO                  = session.getMapper(OrderDetailDAO.class);
        detailDAO.saveDetails(orderDetail);
        session.commit();
        session.close();
    }

}
