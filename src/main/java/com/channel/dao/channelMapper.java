package com.channel.dao;

import com.channel.pojo.channel;

public interface channelMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(channel record);

    int insertSelective(channel record);

    channel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(channel record);

    int updateByPrimaryKey(channel record);
}