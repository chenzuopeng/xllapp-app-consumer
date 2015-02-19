package org.xllapp.consumer.useraction.dao;

import java.util.List;

import com.ffcs.icity.mybatis.MyBatisRepository;

@MyBatisRepository
public interface UserActionLogDao {

	void batchInsert(List<Object> list);

}