package com.khachsan.dao;

import java.util.List;

public abstract class KhachSanDAO<E,K> {
    abstract public void insert (E entity);
    abstract public void update (E entity);
    abstract public void delete (K key);
    abstract public List<E> selectAll();
    abstract public E selectById(K key);
    abstract protected List<E> selectBySql(String sql, Object...args);
}
