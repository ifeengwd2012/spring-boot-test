package fn.wd.controller;

import fn.wd.domain.Goods;
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

    @RequestMapping("goodsList")
    public String goodsList(Model model){
        ArrayList<Goods> goodses = new ArrayList<Goods>();
        goodses.add(new Goods(100,"iphone 7",5800d));
        goodses.add(new Goods(101,"meizu mx6",3000d));
        goodses.add(new Goods(102,"xiaomi note2",4000d));
        goodses.add(new Goods(103,"huawei meta9",8000d));

        model.addAttribute("goodsList",goodses);
        return "goods/goodsList";
    }

}
