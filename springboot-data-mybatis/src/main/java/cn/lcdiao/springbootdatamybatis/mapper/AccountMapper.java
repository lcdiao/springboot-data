package cn.lcdiao.springbootdatamybatis.mapper;

import cn.lcdiao.springbootdatamybatis.bean.Account;
import org.apache.ibatis.annotations.Mapper;


public interface AccountMapper {

    public Account getAccountById(Integer id);

    public int insertAccount(Account account);

}
