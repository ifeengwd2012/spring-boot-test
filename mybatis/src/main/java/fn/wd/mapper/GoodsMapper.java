package fn.wd.mapper;

import fn.wd.domain.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Create Time: 2017-03-01 13:30
 * Created by fengweidong.
 */
@Repository
@Mapper
public interface GoodsMapper {

    public List<Goods> goodsList();
}
