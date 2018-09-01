package com.aurora.dao;
import com.aurora.entity.Myorder;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.Date;
public class MyOrder {
//    测试添加订单功能
    @Test
    public void testMyOrder(){
        Myorder myorder      = new Myorder();
//        用户ID
        myorder.setCustId(1001);
//        订单ID
        myorder.setOrderId(3);
//        随便添加
        myorder.setOrderNumber("1");
//        1001 客户对应的地址为ID 1
        myorder.setOrderAddressId(1);
//        订单创建的时间
        myorder.setOrderTime(new Date());
//        订单的价格
        myorder.setOrderPrice(198.3f);
//        订单的状态
        myorder.setOrderStatus(1);
        SqlSession session    = MyBatisUtil.getSession();
        MyorderDAO myorderDAO = session.getMapper(MyorderDAO.class);
        int influenced        = myorderDAO.save(myorder);
        System.out.println(influenced);
        session.commit();
    }

    @Test
    public void testUpdateStatus(){
        SqlSession session   =MyBatisUtil.getSession();
        MyorderDAO myorderDAO=session.getMapper(MyorderDAO.class);
        myorderDAO.updateStatus(1,3);
        session.commit();
        session.close();
    }


}
