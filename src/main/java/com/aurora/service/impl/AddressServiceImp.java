package com.aurora.service.impl;

import com.aurora.dao.ReceiveAddressDAO;

import com.aurora.model.entity.ReceiveAddress;
import com.aurora.service.AddressService;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class AddressServiceImp implements AddressService {

    @Override
    public List<ReceiveAddress> queryAllAddress(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO dao = sqlSession.getMapper(ReceiveAddressDAO.class);
        List<ReceiveAddress> list = dao.queryAll(userId);
        return list;
    }

    @Override
    public boolean addAddress(ReceiveAddress address) {
        SqlSession sqlSession = MyBatisUtil.getSession();
        ReceiveAddressDAO dao = sqlSession.getMapper(ReceiveAddressDAO.class);
        try {
            int row = dao.save(address);
//            sqlSession.commit();
            if (row > 0)
                return true;
            else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

}
