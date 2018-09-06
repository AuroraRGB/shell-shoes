package com.aurora.dao;

import com.aurora.model.entity.OrderDetail;
import com.aurora.model.entity.OrderDetailKey;
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
        OrderDetail orderDetail = new OrderDetail();
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
