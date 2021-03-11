import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author caoweiquan
 * @date 2021/3/6
 */
public class MyTest {

    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();

        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserByID() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserByID(1);
        System.out.println(user);
        session.close();
    }

    @Test
    public void addUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        int i = mapper.addUser(new User(6, "hello", "dsasdas"));
        System.out.println(i);
        session.close();
    }

    @Test
    public void updateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        int i = mapper.updateUser(new User(6, "hello", "11111"));
        System.out.println(i);
        session.close();
    }

    @Test
    public void deleteUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        int i = mapper.deleteUser(6);
        System.out.println(i);
        session.close();
    }

}
