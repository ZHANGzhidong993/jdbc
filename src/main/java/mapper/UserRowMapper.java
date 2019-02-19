package mapper;

import org.springframework.jdbc.core.RowMapper;
import pojo.User;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author zhangzhidong
 * @create: 2019-02-17 22:16
 */
public class UserRowMapper implements RowMapper {


    public Object mapRow(ResultSet set, int index) throws SQLException {
        User user = new User(set.getInt("id"), set.getString("name"), set.getInt("age"), set.getString("sex"));
        return user;
    }
}
