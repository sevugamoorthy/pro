package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.Agents;
@Repository
public class AgentRepository implements AgentRepositoryInterface {
	
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	private final static String INSERT_NEW_AGENT= "insert into agents values( agent_id_squence.nextVal,?,?,?,?,?)";
	                                                                         
	private final static String UPDATE_EXISTING_AGENT = "update agents set agent_name=?, email=?, agent_password=?,login_status=?, count =?  where agent_id=?";
	private final static String DELETE_EXISTING_AGENT = "delete from agents where agent_id=?";
	private final static String SELECT_ALL_AGENT = "select * from agents";
	private final static String SELECT_ONE_AGENT = "select * from agents where agent_id=?";

//( agent_id,agent_name,email,agent_password,login_status,count)

	@Override
	public boolean addNewAgent(Agents agent) {


		
		Object[] parameters = {
				agent.getAgentName(),
				agent.getAgentEmail(),
				agent.getAgentPassword(),
				agent.getLoginStatus(), 
				agent.getAgentLogincount() };

		int rowCount = jdbcTemplate.update(INSERT_NEW_AGENT, parameters);
		if (rowCount > 0) {
			return true;
		} else {

		}
		return false;
	}

	@Override      
	public Agents updateAgent(Agents agent) {
		
		Object[] parameters = {
			
				agent.getAgentName(),
				agent.getAgentEmail(),
				agent.getAgentPassword(),
				agent.getLoginStatus(),
				agent.getAgentLogincount() ,
				agent.getAgentId()
				

				 };//,agent.setAgentLogincount(0)
		int rowCount = jdbcTemplate.update(UPDATE_EXISTING_AGENT, parameters);
		if (rowCount > 0) {
			return getAgentByAgentId(agent.getAgentId());
		}
		return null;
	}
		
		
	
	@Override
	public boolean deleteAgent(int AgentId) {
		
		
		int rowCount = jdbcTemplate.update(DELETE_EXISTING_AGENT,AgentId );
		if (rowCount > 0) {
			return true;
		} else {

		}
		return false;
	
	}

	@Override
	public Agents getAgentByAgentId(int AgentID) {
		AgentRowMapper agentRowMapper=new AgentRowMapper();
		
		
		return jdbcTemplate.queryForObject(SELECT_ONE_AGENT,agentRowMapper, AgentID );
	}

	@Override
	public List<Agents> getAllAgent() {
		
		AgentRowMapper agentRowMapper=new AgentRowMapper();
		
		return jdbcTemplate.query(SELECT_ALL_AGENT, agentRowMapper);
		
		
	}
//	{
//		   
//	    "agentName": "hi",
//	    "agentEmail": "hi@gmail.com",
//	    "agentPassword": "hipass",
//	    "loginStatus": "inactive",
//	    "agentLogincount": 2,
//	     "agentId": 1
//	}
	

}
