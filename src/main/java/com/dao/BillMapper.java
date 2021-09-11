package com.dao;

import com.pojo.Bill;

import java.util.List;


public interface BillMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bill record);

    int insertSelective(Bill record);

    Bill selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);

    /**
     * 分页条件查询订单及对应的供应商
     */
    List<Bill> findByPage();
}