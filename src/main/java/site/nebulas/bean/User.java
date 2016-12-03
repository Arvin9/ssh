package site.nebulas.bean;

/**
 * Created by Administrator on 2016/12/3.
 */
public class User {
    /**
     * 1.共有的类
     * 2.提供共有的不带参数的默认构造方法
     * 3.属性私有
     * 4.属性设置setter/getter封装
     * */

    private Integer id;//用户id
    private String name;//用户名
    private String password;//密码
    private String createTime;//用户创建时间

    public User() {
    }

    public User(Integer id, String name, String password, String createTime) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
