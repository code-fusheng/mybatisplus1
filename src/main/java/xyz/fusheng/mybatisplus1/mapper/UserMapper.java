package xyz.fusheng.mybatisplus1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import xyz.fusheng.mybatisplus1.entity.ProductVO;
import xyz.fusheng.mybatisplus1.entity.User;

import java.util.List;

/**
 * @FileName: UserMapper
 * @Author: code-fusheng
 * @Date: 2020/5/29 15:17
 * @version: 1.0
 * Description: 用户Mapper
 */

public interface UserMapper extends BaseMapper<User> {
    @Select("select p.*,u.name userName from product p,user u where p.user_id = u.id and u.id = #{id}")
    List<ProductVO> productList(Integer id);
}
