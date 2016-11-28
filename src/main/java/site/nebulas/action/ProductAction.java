package site.nebulas.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import site.nebulas.bean.Product;
import site.nebulas.service.ProductService;

/**
 * Created by Administrator on 2016/11/11.
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
    //模型驱动使用的类
    private Product product = new Product();
    @Override
    public Product getModel() {
        return null;
    }
    //struts2金额spring整合过程中按名称注入的业务层类
    private ProductService productService;

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public void save(){
        System.out.println("Action中的save方法执行了...");
        productService.save();
    }
}
