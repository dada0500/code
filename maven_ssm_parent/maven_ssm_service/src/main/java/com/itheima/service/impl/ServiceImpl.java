package com.itheima.service.impl;

import com.itheima.dao.ItemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements ItemsService {

    @Autowired
    ItemsDao itemsDao;

    @Override
    public Items findById (Integer id) {
        return itemsDao.findById (id);
    }
}
