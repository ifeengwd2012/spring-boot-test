package fn.wd.service.impl;

import fn.wd.domain.Goods;
import fn.wd.mapper.GoodsMapper;
import fn.wd.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create Time: 2017-03-01 13:29
 * Created by fengweidong.
 */
@Service
public class GoodsService implements IGoodsService{

    @Autowired
    private GoodsMapper goodsMapper;


    public List<Goods> goodsList() {
        return goodsMapper.goodsList();
    }
}
