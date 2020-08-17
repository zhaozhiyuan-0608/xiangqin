package cn.kgc.xiangqin.controller;

import cn.kgc.crowd.constant.CrowdConstant;
import cn.kgc.crowd.util.CrowdUtil;
import cn.kgc.xiangqin.entity.UserPass;
import cn.kgc.xiangqin.service.UserPassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * @Author: ZZY
 * @Date: 2020/8/8 16:08
 */
@Controller
public class BackUserController {

@Autowired
 private UserPassService userPassService;
   /* @ResponseBody
@RequestMapping("/loogin")
    public UserPass backLogin(UserPass userPass){

    return   userPassService.Login(userPass);
}


   @ResponseBody
    @RequestMapping("/del")
    public Boolean delete(@RequestParam("id") int id){
    return userPassService.delete(id)==1;
    }
*/



    /*登录*/
    @ResponseBody
    @RequestMapping(value = "/login")
    public String doLogin(@RequestParam(value = "uname", required = false) String uname,
                          @RequestParam(value = "upassword", required = false) String upassword,
                          HttpSession httpSession) {

        System.out.println("loginAcct:" + uname);
        System.out.println("userPswd:" + upassword);
        UserPass userPass = userPassService.getNameAndPassword(uname, upassword);

        httpSession.setAttribute(CrowdConstant.ATTR_NAME_LOGIN_ADMIN, userPass);


        return "success";
    }

    /*注册*/
    @RequestMapping(value = "/implAdd", method = RequestMethod.POST)
    @ResponseBody
    public int add(String uname, String upassword){
        String pwd = CrowdUtil.md5(upassword);
        int userByLgName = userPassService.findUserByLgName(uname);
        int message;
        if(uname.length()==0 || upassword.length()==0){
            message=-1;
        }else if(userByLgName==0){
            userPassService.register(uname, pwd);
            message=1;

        }else {
            message=0;
        }
        return message;
    }






}
