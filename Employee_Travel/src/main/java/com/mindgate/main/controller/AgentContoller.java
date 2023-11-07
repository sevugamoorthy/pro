package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.Agents;
import com.mindgate.main.service.AgentServiceInterface;

@RestController
@RequestMapping("agentapi")
public class AgentContoller {
	
	@Autowired
	private AgentServiceInterface agentServiceInterface;
	
	
	@RequestMapping(value="agent",method = RequestMethod.GET)
	public List<Agents>getAllAgent(){
	return agentServiceInterface.getAllAgent();
	}
	
	@RequestMapping(value = "agents/agent",method = RequestMethod.POST)
	public boolean addNewAgent(@RequestBody Agents agents) {
		
	  return agentServiceInterface.addNewAgent(agents);	
	}
	
	
	@RequestMapping(value = "agents/{agentId}",method = RequestMethod.GET)
	public Agents getAgent(@PathVariable int agentId) {
		return agentServiceInterface.getAgentByAgentId(agentId);
		
	}
	
	@RequestMapping(value = "agents/{agentId}",method = RequestMethod.DELETE)
	public boolean deleteAgent(@PathVariable int agentId) {
		return agentServiceInterface.deleteAgent(agentId);
		
	}
	
	@RequestMapping(value = "agents/agents",method = RequestMethod.PUT)
	public Agents updateAgent(@RequestBody Agents agents) {
		return agentServiceInterface.updateAgent(agents);
	}
	
}












