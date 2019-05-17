package cn.lcdiao.springbootdatamybatis.bean;

/**
 * @Author: diao
 * @Description:
 * @Date: 2019/5/17 10:58
 */
public class User {
    private Integer id;
    private String userName;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + userName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
