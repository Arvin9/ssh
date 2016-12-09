package site.nebulas.bean;

import javax.persistence.*;

/**
 * Created by Administrator on 2016/12/3.
 */
@Entity(name = "user")
public class User {
    /**
     * 1.共有的类
     * 2.提供共有的不带参数的默认构造方法
     * 3.属性私有
     * 4.属性设置setter/getter封装
     * */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;//用户id
    @Column(length = 20)
    private String name;//用户名
    @Column(length = 32)
    private String password;//密码
    @Column(length = 20)
    private String createTime;//用户创建时间
    @Column(length = 32)
    private String department;//所属部门
    @Column(length = 32)
    private String duty;//职务
    @Column(length = 1)
    private Integer sex;//性别
    @Column(length = 32)
    private String nativePlace;//籍贯
    @Column(length = 11)
    private String phoneNumber;//电话号码
    @Column(length = 32)
    private String email;//邮箱

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
