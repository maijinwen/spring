package net.togogo.impl;

import net.togogo.bean.User;
import net.togogo.dao.UserDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserImpl extends JdbcDaoSupport implements UserDao {

    @Override
    public void save(User user) {
        String sql = "insert into USER (name,sex) values(?,?)";
        this.getJdbcTemplate().update(sql,user.getName(),user.getSex());
    }
}
