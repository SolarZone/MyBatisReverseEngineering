package org.wcy.gen.mapper;

import org.wcy.gen.model.Userprize;
import org.wcy.gen.model.UserprizeExample;

public interface UserprizeMapper {
    int countByExample(UserprizeExample example);

    int deleteByPrimaryKey(String id);

    int insert(Userprize record);

    int insertSelective(Userprize record);

    Userprize selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Userprize record);

    int updateByPrimaryKey(Userprize record);
}