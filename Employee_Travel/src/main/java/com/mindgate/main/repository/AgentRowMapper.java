package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.Agents;

public class AgentRowMapper implements RowMapper<Agents> {

	@Override
	public Agents mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		
		int AgentId = rs.getInt("agent_id");
		String AgentName = rs.getString("agent_name");
		String AgentEmail=rs.getString("email");
        String AgentPassword=rs.getString("agent_password");
        String LoginStatus=rs.getString("login_status");
        String AgentLogincount=rs.getString("count");
        
		Agents agents=new Agents(AgentId, AgentName, AgentEmail, AgentPassword, LoginStatus, AgentId);
		
		return agents;
		
		
		
		
	
	}
	
	
	

}
