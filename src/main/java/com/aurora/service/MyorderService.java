package com.aurora.service;

import com.aurora.dao.MyorderDAO;
import com.aurora.model.dto.OrderDetailsDTO;
import com.aurora.model.entity.Myorder;
import com.aurora.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyorderService {

    SqlSession session= MyBatisUtil.getSession();
    MyorderDAO myorderDAO=session.getMapper(MyorderDAO.class);


    public List<OrderDetailsDTO> queryByCustIdList(Integer custId){
        List<OrderDetailsDTO> myorderList=myorderDAO.queryByCustId(custId);
        return myorderList;
    }

    public  Map<String,List<OrderDetailsDTO>> queryByCustIdMap(Integer custId){

        Map<String, List<OrderDetailsDTO>> map=new HashMap<>();
        List<OrderDetailsDTO> myOrderList=myorderDAO.queryByCustId(custId);
        for (OrderDetailsDTO myOrder:myOrderList){
            List<OrderDetailsDTO> list=new ArrayList<>();
            list.add(myOrder);
            if (null!=map.get(myOrder.getOrderNumber())){
                list.addAll(map.get(myOrder.getOrderNumber()));
            }
            map.put(myOrder.getOrderNumber(),list);
        }
        System.out.println(map);
        return map;
    }
}
