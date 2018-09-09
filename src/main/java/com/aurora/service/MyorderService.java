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
    public  Map<String,List<OrderDetailsDTO>> queryByCustIdMap(Integer custId){
        Map<String, List<OrderDetailsDTO>> map=new HashMap<>();
        List<OrderDetailsDTO> myOrderList=myorderDAO.queryByCustId(custId);
        for (int i=0;i<myOrderList.size();i++){
            List<OrderDetailsDTO> list    = new ArrayList<>();
            list.add(myOrderList.get(i));
            if (null!=map.get(myOrderList.get(i).getOrderNumber())){
                list.addAll(map.get(myOrderList.get(i).getOrderNumber()));
            }
            map.put(myOrderList.get(i).getOrderNumber(),list);
        }

        for (List<OrderDetailsDTO> value : map.values()) {
            Double  countPrice = 0.0;
            Integer count      = 0;
            List<String> list  = new ArrayList<>();
            for (OrderDetailsDTO orderDetailList : value){
                countPrice+=orderDetailList.getOrderPrice();
                count+=orderDetailList.getOrderId();
            }
            list.add("订单状态    ："+value.get(0).getOrderStatus().toString());
            list.add("订单创建时间 ："+value.get(0).getOrderTime().toString());
            list.add("订单个数    ："+count.toString());
            list.add("订单总价    ："+countPrice.toString());
            list.add("用户ID     : "+value.get(0).getOrderId().toString());
            value.get(0).setOrderDetailList(list);
        }
        return map;
    }
}
