package com.hwj.mappers;

import org.apache.ibatis.annotations.Mapper;

import com.hwj.domain.AppToken;

@Mapper
public interface AppTokenMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppToken record);

    int insertSelective(AppToken record);

    AppToken selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppToken record);

    int updateByPrimaryKey(AppToken record);
    
    AppToken selectByUserId(Integer userId);
}