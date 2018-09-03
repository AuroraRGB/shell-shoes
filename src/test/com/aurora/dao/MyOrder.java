package com.aurora.dao;
import com.aurora.DTO.OrderQueryById;
import com.aurora.entity.Myorder;
import com.aurora.entity.OrderDetail;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyOrder {
//    测试添加订单功能
    @Test
    public void testMyOrder(){
        Myorder myorder       = new Myorder(3,"3",1001,new Date(),198.3f,1,1);
        SqlSession session    = MyBatisUtil.getSession();
        MyorderDAO myorderDAO = session.getMapper(MyorderDAO.class);
        int influenced        = myorderDAO.save(myorder);
        System.out.println(influenced);
        session.commit();
    }

    @Test
    public void testUpdateStatus(){
        SqlSession session    = MyBatisUtil.getSession();
        MyorderDAO myorderDAO = session.getMapper(MyorderDAO.class);
        myorderDAO.updateStatus(1,3);
        session.commit();
        session.close();
    }

    @Test
    public void testQueryAll(){
        SqlSession session    = MyBatisUtil.getSession();
        MyorderDAO myorderDAO = session.getMapper(MyorderDAO.class);
        List<Myorder> list    = myorderDAO.queryAll(1002);
        list.forEach(System.out::println);
        session.commit();
        session.close();
    }

    @Test
    public void testQueryByShoesName(){
        SqlSession session =MyBatisUtil.getSession();
        MyorderDAO myorderDAO=session.getMapper(MyorderDAO.class);
        List<Myorder> list=myorderDAO.queryByShoesName("shoes2",1002);
        if (list.isEmpty()){
            System.out.println("该用户没有该商品");
        }else {
            list.forEach(System.out::println);
        }
        session.commit();
        session.close();
    }

    @Test
    public void testQueryById(){
        SqlSession session=MyBatisUtil.getSession();
        MyorderDAO myorderDAO=session.getMapper(MyorderDAO.class);
        List<OrderQueryById> list=myorderDAO.queryById("s1002",1003);
        list.forEach(System.out::println);
    }


}
