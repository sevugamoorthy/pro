package com.mindgate.main.repository;

import java.util.List;

import com.mindgate.main.domain.Agents;

public interface AgentRepositoryInterface {
	
	
	public boolean addNewAgent(Agents agent);
	public Agents updateAgent(Agents agent);
	public boolean deleteAgent(int AgentId);
	public Agents getAgentByAgentId(int AgentID);
	public List<Agents>getAllAgent();
	
}
