package cn.lcdiao.springbootdatajpa.entity;

import javax.persistence.*;

/**
配置JPA注解配置映射关系
 */
//告诉jpa这是一个实体类(和数据表映射的类)
@Entity
//指定和哪个表对应；如果省略，默认表名就是user
@Table(name = "tb_user")
public class User {

    //主键
    @Id
    //自增主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "last_name",length = 50)
    private String lastName;
    //省略默认列名就是属性名
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
