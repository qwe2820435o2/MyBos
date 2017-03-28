package com.kris.mapper;

import com.kris.pojo.UserP;
import com.kris.pojo.UserPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPMapper {
    int countByExample(UserPExample example);

    int deleteByExample(UserPExample example);

    int deleteByPrimaryKey(String userId);

    int insert(UserP record);

    int insertSelective(UserP record);

    List<UserP> selectByExample(UserPExample example);

    UserP selectByPrimaryKey(String userId);

    int updateByExampleSelective(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByExample(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByPrimaryKeySelective(UserP record);

    int updateByPrimaryKey(UserP record);
}