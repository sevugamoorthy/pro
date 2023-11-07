package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.Agents;
import com.mindgate.main.repository.AgentRepository;

@Service
public class AgentService implements AgentServiceInterface {
	
	@Autowired
	private AgentRepository agentRepositoryInterface;

	@Override
	public boolean addNewAgent(Agents agent) {

		
		
		return  agentRepositoryInterface.addNewAgent(agent);
	}

	@Override
	public Agents updateAgent(Agents agent) {
		// TODO Auto-generated method stub
		return  agentRepositoryInterface.updateAgent(agent);
		
	}

	@Override
	public boolean deleteAgent(int AgentId) {
		// TODO Auto-generated method stub
		return agentRepositoryInterface.deleteAgent(AgentId);
	}

	@Override
	public Agents getAgentByAgentId(int AgentID) {
		// TODO Auto-generated method stub
		return  agentRepositoryInterface.getAgentByAgentId(AgentID);
	}

	@Override
	public List<Agents> getAllAgent() {
		// TODO Auto-generated method stub
	return  agentRepositoryInterface.getAllAgent();
	

}
	}
