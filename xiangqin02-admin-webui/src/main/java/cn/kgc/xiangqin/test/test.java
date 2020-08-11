package cn.kgc.xiangqin.test;

import cn.kgc.xiangqin.entity.UserPass;
import cn.kgc.xiangqin.entity.YongHu;
import cn.kgc.xiangqin.service.UserPassService;
import cn.kgc.xiangqin.service.YongHuService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

/**
 * @Author: ZZY
 * @Date: 2020/8/8 16:30
 */

public class test {
@Test
public void test01() throws Exception{
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-persist-mybatis.xml");



    DataSource dataSource = (DataSource) ctx.getBean("dataSource");
    Connection connection = dataSource.getConnection();
    System.out.println(connection);

}


    @Test
    public void test02() throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-persist-mybatis.xml");

        UserPassService bean = ctx.getBean(UserPassService.class);
      UserPass userPass =new UserPass();
        userPass.setUname("zhangsan");
        userPass.setUpassword("1234567");

        UserPass login = bean.Login(userPass);

        System.out.println(login);

   /*     List<UserPass> userPasses = bean.queryAll(0);

        for (UserPass userPass : userPasses) {
            System.out.println(userPass);
        }*/
    }
    @Test
    public void test03() throws Exception{
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-persist-mybatis.xml");

        YongHuService bean = ctx.getBean(YongHuService.class);
        List<YongHu> yongHus = bean.queryAll(0);
        for (YongHu hus : yongHus) {

            System.out.println(hus.getUserPass1().getAdmin());
        }



    }



}
