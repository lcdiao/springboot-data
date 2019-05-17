package cn.lcdiao.springbootdatamybatis.mapper;

import cn.lcdiao.springbootdatamybatis.bean.User;
import org.apache.ibatis.annotations.*;

//注解版
//指定这是一个操作数据库的mapper
//已在启动类使用MapperScan批量扫描所有的mapper
//@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    public User getUserById(Integer id);

    @Delete("delete from user where id=#{id}")
    public int deleteUserById(Integer id);

    //是否使用自动生成的主键           哪个属性用来封装主键
    @Options(useGeneratedKeys =  true,keyProperty = "id")
    @Insert("insert into user(user_name) values(#{userName})")
    public int insertUser(User user);

    @Update("update user set name=#{user_name} where id=#{id}")
    public int updateUser(User user);
}
