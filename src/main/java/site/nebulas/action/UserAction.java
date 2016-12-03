package site.nebulas.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import site.nebulas.bean.User;
import site.nebulas.service.UserService;

/**
 * Created by Administrator on 2016/12/3.
 */
@ParentPackage("struts-default")
@Namespace("/")
public class UserAction extends ActionSupport implements ModelDriven<User>{
    //模型驱动获取参数
    private User user = new User();
    public User getModel() {
        return user;
    }
    //日志
    private Logger log = LoggerFactory.getLogger(UserAction.class);
    @Autowired
    private UserService userService;

    @Action(value = "login", results = { @Result(name = "success", location = "/jsp/main.jsp") })
    public String login(){
        log.info("login user");
        user.setName("hhhhh");
        userService.saveUser(user);
        return SUCCESS;
    }


}
