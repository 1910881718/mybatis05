package Test;

import com.dao.ProviderMapper;
import com.dao.RoleMapper;
import com.dao.UserMapper;
import com.pojo.Permission;
import com.pojo.Role;
import com.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AMTest {


//    查询所有用户对应角色
    @Test
    public void UserManyToRoleManyList(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper=(UserMapper)ac.getBean("userMapper");
        List<User> users = userMapper.findByPage();
        for (User user : users) {
            System.out.println(user.getUsername());
            List<Role> roles = user.getRoleList();
            for (Role role : roles) {
                System.out.println(role);
            }
        }

    }

    //    查询所有用户对应的权限
    @Test
    public void UserManyToRPManyList(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper=(UserMapper)ac.getBean("userMapper");
        List<User> users = userMapper.findByPage3();
        for (User user : users) {
            System.out.println(user.getUsername());
            List<Role> roles = user.getRoleList();
            for (Role role : roles) {
                System.out.println("\t"+role.getRoleName());
                for (Permission p : role.getPermissionList()) {
                    System.out.println("\t\t"+p.getPermissionName());
                }
            }
        }

    }

    //    查询某个用户对应的角色
    @Test
    public void UserManyToRoleMany() {

        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper = (UserMapper) ac.getBean("userMapper");
        List<User> users = userMapper.findByPage4(1);
        for (User user : users) {
            System.out.println(user.getUsername());
            List<Role> roles = user.getRoleList();
            for (Role role : roles) {
                System.out.println("\t" + role.getRoleName());
                for (Permission p : role.getPermissionList()) {
                    System.out.println("\t\t" + p.getPermissionName());
                }
            }
        }
    }
    //    查询某个用户对应的权限
    @Test
    public void UserManyToRPMany(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper=(UserMapper)ac.getBean("userMapper");
        List<User> users = userMapper.findByPage5(1);
        for (User user : users) {
            System.out.println(user.getUsername());
            System.out.println(user.getUserId());
            List<Role> roles = user.getRoleList();
            for (Role role : roles) {
                System.out.println("\t"+role.getRoleName());
                System.out.println(role.getRoleId());
                for (Permission p : role.getPermissionList()) {
                    System.out.println("\t\t"+p.getPermissionName());
                }
            }
        }

    }

    //    .给某用户分配角色
    @Test
    public void UserManyToRoleManyfp(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserMapper userMapper=(UserMapper)ac.getBean("userMapper");
      List<User> users = userMapper.findByPage4(2);
      Role r=new Role();
     


    }


}
