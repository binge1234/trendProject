package cn.how2j.trend.controller;

import cn.how2j.trend.pojo.IndexData;
import cn.how2j.trend.service.IndexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexDataController {
    @Autowired
    private IndexDataService indexDataService;

    @GetMapping("/freshIndexData/{code}")
    public String fresh(@PathVariable("code") String code){
        try{
            indexDataService.fresh(code);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return "fail";
        }
    }

    @GetMapping("/getIndexData/{code}")
    public List<IndexData> get(@PathVariable("code")String code){
        try{
            return indexDataService.get(code);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping("/removeIndexData/{code}")
    public String remove(@PathVariable("code") String code){
        try{
            indexDataService.remove(code);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }


    }

}
