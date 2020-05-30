package xyz.fusheng.mybatisplus1.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import xyz.fusheng.mybatisplus1.entity.User;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    void test() {
        userMapper.selectList(null).forEach(System.out::println);
    }

    @Test
    void save() {
        User user = new User();
        user.setName("张三");
        user.setAge(21);
        userMapper.insert(user);
    }

    @Test
    void update() {
        User user = userMapper.selectById(1);
        user.setName("修改");
        userMapper.updateById(user);
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("age",22);
        userMapper.update(user,wrapper);
    }

    @Test
    void deleted() {
        userMapper.deleteById(1);
    }

    /***************** 查询 *************************/

    @Test
    void select() {

        // 1、不加任何条件的全部查询
        // userMapper.selectList(null);

        // 2.1、条件构造查询所有
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.eq("name", "张三");
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // 2.2、多条件构造查询所有
        // QueryWrapper wrapper = new QueryWrapper();
        // Map<String, Object> map = new HashMap<>();
        // map.put("name", "张三");
        // map.put("age", 21);
        // wrapper.allEq(map);
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // 2.3、查询所有年龄大于两十岁的 (gt:大于 lt:小于 ne:不等于)
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.gt("age", 20);
        // wrapper.lt("age", 20);
        // wrapper.ne("age", 21);
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // 2.4、模糊查询
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.like("name","张");
        // wrapper.likeLeft("name","张");
        // wrapper.likeRight("name","张");
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // 2.5、联合查询
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.inSql("id","select id from user where id < 10");
        // wrapper.inSql("age","select age from user where age > 21");
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // 2.6、条件排序 （Desc 降序 Asc 升序）
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.orderByDesc("age");
        // wrapper.orderByAsc("age");
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // having
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.having("id = 21");
        // userMapper.selectList(wrapper).forEach(System.out::println);

        // 2.7、单一/批量查询
        // System.out.println(userMapper.selectById(1));
        // userMapper.selectBatchIds(Arrays.asList(1,2,3)).forEach(System.out::println);
        // QueryWrapper wrapper = new QueryWrapper();
        // wrapper.eq("id",1);
        // System.out.println(userMapper.selectOne(wrapper));
        // 2.8、Map条件查询 Map 只能做等值判断，逻辑判断需要使用 Wrapper 来处理
        // QueryWrapper wrapper = new QueryWrapper();
        // Map<String,Object> map = new HashMap<>();
        // map.put("id",1);
        // selectByMap 返回实体对象 （封装条件）
        // userMapper.selectByMap(map).forEach(System.out::println);
        // wrapper.eq("id",1);
        // selectMaps 返回Map结果集 （封装结果）
        // userMapper.selectMaps(wrapper).forEach(System.out::println);

        // 2.9、分页查询
        // Page<User> page = new Page<User>(1,2);
        // Page<User> result = userMapper.selectPage(page, null);
        // System.out.println(result.getSize());
        // System.out.println(result.getTotal());
        // result.getRecords().forEach(System.out::println);
        // Map封装结果
        // Page<Map<String,Object>> page = new Page<>(1,2);
        // userMapper.selectMapsPage(page,null).getRecords().forEach(System.out::println);
        // 返回主键
        // userMapper.selectObjs(null).forEach(System.out::println);
    }

    @Test
    void product() {
        userMapper.productList(1).forEach(System.out::println);
    }








}
