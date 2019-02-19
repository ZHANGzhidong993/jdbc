package service;

import mapper.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.User;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @author zhangzhidong
 * @create: 2019-02-17 23:21
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void save(User user) {
        jdbcTemplate.update("insert into user(name,age,sex)values(?,?,?)", new Object[]{user.getName(), user.getAge(),
                user.getSex()});
    }

    public List<User> getUsers() {
        List list = jdbcTemplate.query("select * from user", new UserRowMapper());
        return list;
    }
}
