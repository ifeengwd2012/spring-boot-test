package fn.wd.domain;

/**
 * Create Time: 2017-02-24 17:30
 * Created by fengweidong.
 */
public class Goods {

    private Integer id;
    private String type;
    private Double price;

    public Integer getId() {
        return id;
    }

    public Goods(Integer id, String type, Double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Goods() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
