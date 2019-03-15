package team.abc.ssm.modules.sys.dao;

import org.apache.ibatis.annotations.Param;
import team.abc.ssm.common.persistence.Page;
import team.abc.ssm.modules.sys.entity.User;

import java.util.List;

public interface UserDao {

    // 通过用户名获取用户信息
    User selectByUsername(String username);

    // 模糊搜索结果总数
    int selectSearchCount(@Param("searchKey") String searchKey);

    // 获取所有用户列表
    List<User> selectAll();

    // 分页 + 搜索(模糊匹配用户名)获取用户列表（无角色信息）
    List<User> selectByPage(Page<User> page);

    // 根据ids获取用户列表（有角色信息）
    List<User> selectByIds(@Param("userList") List<User> userList);

    // 添加一名新用户
    int insert(User user);

    // 更新用户信息
    int update(User user);

    // 删除指定id的用户
    int deleteByIds(List<User> userList);
}