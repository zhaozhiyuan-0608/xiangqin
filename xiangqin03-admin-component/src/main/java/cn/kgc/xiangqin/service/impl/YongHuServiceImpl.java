package cn.kgc.xiangqin.service.impl;

import cn.kgc.xiangqin.entity.YongHu;
import cn.kgc.xiangqin.mapper.YongHuMapper;
import cn.kgc.xiangqin.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZZY
 * @Date: 2020/8/10 13:51
 */
@Service
public class YongHuServiceImpl implements YongHuService {
    @Autowired
     private YongHuMapper yongHuMapper;


    @Override
    public List<YongHu> queryAll(int id) {
        return yongHuMapper.queryAll(id);
    }





    @Override
    public List<YongHu> getAll() {
        return yongHuMapper.getAll();
    }
}
