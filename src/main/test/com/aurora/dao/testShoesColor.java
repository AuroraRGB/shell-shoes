package com.aurora.dao;

import com.aurora.entity.ShoesColor;
import com.aurora.entity.ShoesSize;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testShoesColor {
    @Test
    public void testSaveShoesColor(){
        ShoesColor shoesColor = new ShoesColor(5,"blue",1);
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesColorDAO shoesColorDAO = sqlSession.getMapper(ShoesColorDAO.class);
        int rows = shoesColorDAO.insert(shoesColor);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testQueryAllColorByShoesId(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesColorDAO shoesColorDAO = sqlSession.getMapper(ShoesColorDAO.class);
        List<ShoesColor> shoesImg = shoesColorDAO.queryAllColorByShoesId(2001);
        System.out.println(shoesImg);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testupdateByPrimaryKey(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesColorDAO shoesColorDAO = sqlSession.getMapper(ShoesColorDAO.class);
        int rows = shoesColorDAO.updateByPrimaryKey(new ShoesColor(5,"grey",1));
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testdeleteByPrimaryKey(){
        SqlSession sqlSession = MyBatisUtil.getSession();
        ShoesColorDAO shoesColorDAO = sqlSession.getMapper(ShoesColorDAO.class);
        int rows = shoesColorDAO.deleteByPrimaryKey(5);
        System.out.println(rows);
        sqlSession.commit();
        sqlSession.close();
    }
}

