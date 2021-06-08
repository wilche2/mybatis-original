import com.kuang.dao.StudentMapper;
import com.kuang.dao.UserMapper;
import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.List;

/**
 * @author caoweiquan
 * @date 2021/3/12
 */
public class MyTest {

    @Test
    public void test1() {
        LocalDateTime now = this.getTimeMills1();
        LocalDateTime of1 = LocalDateTime.of(2021, 6, 8, 18, 46);
        if (now.isEqual(of1) || now.isBefore(of1)) {
            System.out.println(true);
        }
    }
    private static LocalDateTime getTimeMills1() {
        return LocalDateTime.now().withSecond(0).withNano(0);
    }

    @Test
    public void testGetStudents2(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents2();

        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void testGetStudents1(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);

        List<Student> students = mapper.getStudents();

        for (Student student : students){
            System.out.println(student);
        }
    }

    @Test
    public void selectUser() {
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();

        for (User user : users) {
            System.out.println(user);
        }
        session.close();
    }

}
