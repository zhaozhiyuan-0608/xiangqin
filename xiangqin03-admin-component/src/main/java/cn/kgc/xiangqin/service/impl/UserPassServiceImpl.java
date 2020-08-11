package cn.kgc.xiangqin.service.impl;

import cn.kgc.xiangqin.entity.UserPass;
import cn.kgc.xiangqin.entity.UserPassExample;
import cn.kgc.xiangqin.mapper.UserPassMapper;
import cn.kgc.xiangqin.service.UserPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZZY
 * @Date: 2020/8/8 16:14
 */
@Service
public class UserPassServiceImpl implements UserPassService {
    @Autowired
      private UserPassMapper userPassMapper;


    @Override
    public Integer delete(int uid) {
        return userPassMapper.delete(uid);
    }

    @Override
    public UserPass Login(UserPass userPass) {
        return userPassMapper.Login(userPass) ;
    }

    @Override
    public List<UserPass> queryAll(int uid) {
        return userPassMapper.queryAll(uid);
    }

    @Override
    public long countByExample(UserPassExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(UserPassExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String uname) {
        return 0;
    }

    @Override
    public int insert(UserPass record) {
        return 0;
    }

    @Override
    public int insertSelective(UserPass record) {
        return 0;
    }

    @Override
    public List<UserPass> selectByExample(UserPassExample example) {
        return null;
    }

    @Override
    public UserPass selectByPrimaryKey(String uname) {
        return null;
    }

    @Override
    public int updateByExampleSelective(UserPass record, UserPassExample example) {
        return 0;
    }

    @Override
    public int updateByExample(UserPass record, UserPassExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserPass record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(UserPass record) {
        return 0;
    }
}
