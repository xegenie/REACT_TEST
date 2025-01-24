package com.aloha.board.service;

import com.aloha.board.domain.Todos;
import com.github.pagehelper.PageInfo;

public interface TodoService extends BaseService<Todos> {
    public PageInfo<Todos> list(int page, int size);

    public boolean deleteAll();
    public boolean updateAll();
}