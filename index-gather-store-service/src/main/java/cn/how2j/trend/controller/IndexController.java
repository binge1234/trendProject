package cn.how2j.trend.controller;

import cn.how2j.trend.pojo.Index;
import cn.how2j.trend.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {
    @Autowired
    private IndexService indexService;

    @GetMapping("/getCodes")
    public List<Index> get() {
        try {
            return indexService.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping("/freshCodes")
    public List<Index> fresh() {
        try{
            return indexService.fresh();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }
    @GetMapping("/removeCodes")
    public String remove() {
        try{
            indexService.remove();
            return "remove codes successfully";
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;

    }
}
