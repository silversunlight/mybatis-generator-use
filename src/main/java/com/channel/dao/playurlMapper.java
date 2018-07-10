package com.channel.dao;

import com.channel.pojo.playurl;

public interface playurlMapper {
    int insert(playurl record);

    int insertSelective(playurl record);
}