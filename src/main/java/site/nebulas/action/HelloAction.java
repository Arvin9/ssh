package site.nebulas.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2016/12/1.
 */
public class HelloAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        System.out.println("hahah");
        return SUCCESS;
    }
}
