package cn.kgc.xiangqin.controller;

import cn.kgc.xiangqin.entity.YongHu;
import cn.kgc.xiangqin.service.YongHuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

/**
 * @Author: ZZY
 * @Date: 2020/8/10 14:02
 */
@RestController
public class BackYongHuController {

@Autowired
    private YongHuService yongHuService;

@RequestMapping("/queryAll")
    public List<YongHu>  queyAll(@RequestParam("id") int id){

    return  yongHuService.queryAll(id);
}


    /*查询所有*/
    @RequestMapping("/List")
    public List<YongHu> queryAll(){
        return yongHuService.getAll();
    }




}
