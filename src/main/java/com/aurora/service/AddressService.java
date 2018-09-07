package com.aurora.service;
import com.aurora.model.entity.ReceiveAddress;

import java.util.List;

public interface AddressService {
    List<ReceiveAddress> queryAllAddress(Integer userId);
    boolean addAddress(ReceiveAddress address);
}
