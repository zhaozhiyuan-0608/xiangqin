package cn.kgc.xiangqin.service.impl;

import cn.kgc.crowd.constant.CrowdConstant;

import cn.kgc.crowd.exception.LoginFailedException;
import cn.kgc.crowd.util.CrowdUtil;
import cn.kgc.xiangqin.entity.UserPass;
import cn.kgc.xiangqin.entity.UserPassExample;
import cn.kgc.xiangqin.mapper.UserPassMapper;
import cn.kgc.xiangqin.service.UserPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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






    @Override
    /*登录*/
    public UserPass getNameAndPassword(String uname, String upassword) {
        // 1.根据登录账号查询User对象
        // ①创建UserExample对象
        UserPassExample userPassExample = new UserPassExample();
        // ②创建Criteria对象
        UserPassExample.Criteria criteria = userPassExample.createCriteria();
        // ③在Criteria对象中封装查询条件
        criteria.andUnameEqualTo(uname);
        // ④调用AdminMapper的方法执行查询
        List<UserPass> list = userPassMapper.selectByExample(userPassExample);
        // 2.判断Admin对象是否为null
        if(list == null || list.size() == 0) {
            throw new LoginFailedException(CrowdConstant.MESSAGE_LOGIN_FAILED);
        }

        if(list.size() > 1) {
            throw new RuntimeException(CrowdConstant.MESSAGE_SYSTEM_ERROR_LOGIN_NOT_UNIQUE);
        }

        UserPass userPass = list.get(0);

        // 3.如果Admin对象为null则抛出异常
        if(userPass == null) {
            throw new LoginFailedException(CrowdConstant.MESSAGE_LOGIN_FAILED);
        }

        // 4.如果Admin对象不为null则将数据库密码从Admin对象中取出
        String userPswdDB = userPass.getUpassword();

        // 5.将表单提交的明文密码进行加密
        String userPswdForm = CrowdUtil.md5(upassword);

        // 6.对密码进行比较
        if(!Objects.equals(userPswdDB, userPswdForm)) {
            // 7.如果比较结果是不一致则抛出异常
            throw new LoginFailedException(CrowdConstant.MESSAGE_LOGIN_FAILED);
        }

        // 8.如果一致则返回Admin对象
        return userPass;

    }

    @Override
    public boolean register(String uname, String upassword) {
        return userPassMapper.register(uname,upassword);
    }

    @Override
    public int findUserByLgName(String uname) {
        return 0;
    }
}
