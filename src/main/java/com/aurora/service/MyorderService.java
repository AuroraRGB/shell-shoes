package com.aurora.service;

import com.aurora.dao.MyorderDAO;
import com.aurora.model.entity.Myorder;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyorderService {

    SqlSession session= MyBatisUtil.getSession();
    MyorderDAO myorderDAO=session.getMapper(MyorderDAO.class);
    public List<Myorder> queryAll(Integer custId){
        List<Myorder> myorderList=myorderDAO.queryAll(custId);
        return myorderList;
    }
}
