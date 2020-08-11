package cn.kgc.xiangqin.controller;

import cn.kgc.xiangqin.entity.UserPass;
import cn.kgc.xiangqin.service.UserPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ZZY
 * @Date: 2020/8/8 16:08
 */
@RestController
public class BackUserController {

@Autowired
 private UserPassService userPassService;

@RequestMapping("/loogin")
    public UserPass backLogin(UserPass userPass){

    return   userPassService.Login(userPass);
}


    @RequestMapping("/del")
    public Boolean delete(@RequestParam("id") int id){
    return userPassService.delete(id)==1;
    }


}
