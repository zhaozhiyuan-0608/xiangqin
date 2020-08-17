package cn.kgc.xiangqin.service;

import cn.kgc.xiangqin.entity.YongHu;

import java.awt.print.Book;
import java.util.List;

/**
 * @Author: ZZY
 * @Date: 2020/8/10 13:50
 */

public interface YongHuService {
    List<YongHu> queryAll(int id);


    /*查询所有*/
    List<YongHu> getAll();
}
