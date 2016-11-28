package site.nebulas.service;

import site.nebulas.dao.ProductDao;

/**
 * Created by Administrator on 2016/11/11.
 */
public class ProductService {
    //业务层注入DAO类
    private ProductDao productDao;

    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void save(){
        System.out.println("Server中的save方法执行了...");
        productDao.save();
    }
}
