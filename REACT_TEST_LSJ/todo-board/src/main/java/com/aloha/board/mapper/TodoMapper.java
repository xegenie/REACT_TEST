package com.aloha.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.aloha.board.domain.Todos;

@Mapper
public interface TodoMapper extends BaseMapper<Todos> {
    
}
