package org.xllapp.consumer.useraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.xllapp.consumer.useraction.dao.UserActionLogDao;

import com.ffcs.icity.app.consumer.support.ApiMessageConsumerTask.ApiMessage;
import com.ffcs.icity.app.consumer.support.SimpleBatchApiMessageConsumerTask;


/**
 * UserAction消息的Consumer.
 *
 * @Copyright: Copyright (c) 2014 FFCS All Rights Reserved 
 * @Company: 北京福富软件有限公司 
 * @author 陈作朋 Nov 16, 2014
 * @version 1.00.00
 * @history:
 * 
 */
@Service
public class UserActionConsumerTask extends SimpleBatchApiMessageConsumerTask {
	
	private String brokerUrl;

	private String userName;

	private String password;
	
	private UserActionLogDao userActionLogDao;

	@Override
	public void executeSql(List<Object> batch) {
		userActionLogDao.batchInsert(batch);
	}

	@SuppressWarnings("unchecked")
	public List<Object> resolveSqlParams(ApiMessage message) throws Exception {
		List<Object> sqlParamsList = new ArrayList<Object>();
		Map<String, Object> systemArguments = getRequestSystemArguments(message);
		List<Map<String, Object>> actions = (List<Map<String, Object>>) message.getArgument("actions");
		for (Map<String, Object> action : actions) {
			Map<String, Object> sqlParams = new HashMap<String, Object>();
			sqlParams.putAll(systemArguments);
			sqlParams.putAll(action);
			sqlParamsList.add(sqlParams);
		}
		return sqlParamsList;
	}

	private Map<String, Object> getRequestSystemArguments(ApiMessage message) {
		Map<String, Object> map = new HashMap<String, Object>(message.getArguments());
		map.remove("actions");
		map.put("ip", message.getIp());
		return map;
	}

	public String getBrokerUrl() {
		return this.brokerUrl;
	}

	@Value("${brokerUrl}")
	public void setBrokerUrl(String brokerUrl) {
		this.brokerUrl = brokerUrl;
	}

	public String getUserName() {
		return this.userName;
	}

	@Value("${userName}")
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	@Value("${password}")
	public void setPassword(String password) {
		this.password = password;
	}

	public String getQueue() {
		return "XLLAPP_USER_ACTION_LOG";
	}
	
	@Autowired
	public void setUserActionLogDao(UserActionLogDao userActionLogDao) {
		this.userActionLogDao = userActionLogDao;
	}

}
