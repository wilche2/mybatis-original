import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author caoweiquan
 * @date 2021/3/6
 */
public class MyTest {

    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        //方法一:
        // List<User> users = session.selectList("com.kuang.dao.UserMapper.selectUser");
        //方法二:
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

    @Test
    public void getUserById() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println("user = " + user);

        session.close();
    }

    /**
     * 增删改需要提交事务
     */
    @Test
    public void addUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(4);
        user.setName("哈哈");
        user.setPwd("123456");
        int i = mapper.addUser(user);
        session.commit();
        System.out.println("i = " + i);

        session.close();
    }

    /**
     * 增删改需要提交事务
     */
    @Test
    public void updateUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setName("哈哈");
        user.setPwd("123456");
        int i = mapper.updateUser(user);
        session.commit();
        System.out.println("i = " + i);

        session.close();
    }

    /**
     * 增删改需要提交事务
     */
    @Test
    public void deleteUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteUser(4);
        session.commit();
        System.out.println("i = " + i);

        session.close();
    }

    /**
     * 增删改需要提交事务
     */
    @Test
    public void addUser2() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userId", 4);
        map.put("userName", "哈哈");
        map.put("userPwd", "1223");

        int i = mapper.addUser2(map);
        session.commit();
        System.out.println("i = " + i);

        session.close();
    }

    @Test
    public void getUserById2() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 4);
        map.put("name", "哈哈");

        User user = mapper.getUserById2(map);
        System.out.println("user = " + user);

        session.close();
    }

    @Test
    public void getUserLikeName() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);

        List<User> users = mapper.getUserLikeName("李");
        for (User user : users) {
            System.out.println("user = " + user);
        }

        session.close();
    }


}
