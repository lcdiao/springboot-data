package cn.lcdiao.springbootdatamybatis;

import cn.lcdiao.springbootdatamybatis.bean.Account;
import cn.lcdiao.springbootdatamybatis.bean.User;
import cn.lcdiao.springbootdatamybatis.mapper.AccountMapper;
import cn.lcdiao.springbootdatamybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    UserMapper userMapper;

    @Autowired
    AccountMapper accountMapper;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        return userMapper.getUserById(id);
    }

    @GetMapping("/user")
    public User getUser(User user){
        userMapper.insertUser(user);
        return user;
    }

    @GetMapping("/account/{id}")
    public Account getAccount(@PathVariable("id") Integer id) {
        return accountMapper.getAccountById(id);
    }

    @GetMapping("/account")
    public Account insertAccount(Account account) {
        System.out.println(account);
        System.out.println(accountMapper.insertAccount(account));
        return account;
    }

}
