package site.nebulas.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Administrator on 2016/12/1.
 */
@ParentPackage("struts-default")
@Namespace("/")
@Results( { @Result(name = "success", location = "/jsp/main.jsp"),
            @Result(name = "error", location = "/error.jsp") })
@ExceptionMappings( {@ExceptionMapping(exception = "Java.lange.RuntimeException", result = "error") })
public class HelloAction extends ActionSupport{
    private Logger log = LoggerFactory.getLogger(HelloAction.class);
    @Override
    public String execute() throws Exception {
        System.out.println("hahah");
        return SUCCESS;
    }
    @Action(value = "login", results = { @Result(name = "success", location = "/jsp/main.jsp") })
    public String login() throws Exception {

        log.info("login");
        return SUCCESS;
    }
}
