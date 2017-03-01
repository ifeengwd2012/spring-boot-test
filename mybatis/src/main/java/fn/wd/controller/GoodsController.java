package fn.wd.controller;

import fn.wd.domain.Goods;
import fn.wd.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * Create Time: 2017-02-24 17:26
 * Created by fengweidong.
 */
@Controller
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    @RequestMapping("goodsList")
    public String goodsList(Model model){
        model.addAttribute("goodsList",goodsService.goodsList());
        return "goods/goodsList";
    }

}
