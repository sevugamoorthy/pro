package com.mindgate.main.domain;

public class Agents {

	private int AgentId;
	private String AgentName;
	private String AgentEmail;
	private String AgentPassword;
	private String LoginStatus;
	private int AgentLogincount;
	
	public Agents() {
		// TODO Auto-generated constructor stub
	}
	

	

	public Agents(int agentId, String agentName, String agentEmail, String agentPassword, String loginStatus,
			int agentLogincount) {
		super();
		AgentId = agentId;
		AgentName = agentName;
		AgentEmail = agentEmail;
		AgentPassword = agentPassword;
		LoginStatus = loginStatus;
		AgentLogincount = agentLogincount;
	}




	public int getAgentId() {
		return AgentId;
	}




	public void setAgentId(int agentId) {
		AgentId = agentId;
	}




	public String getAgentName() {
		return AgentName;
	}




	public void setAgentName(String agentName) {
		AgentName = agentName;
	}




	public String getAgentEmail() {
		return AgentEmail;
	}




	public void setAgentEmail(String agentEmail) {
		AgentEmail = agentEmail;
	}




	public String getAgentPassword() {
		return AgentPassword;
	}




	public void setAgentPassword(String agentPassword) {
		AgentPassword = agentPassword;
	}




	public String getLoginStatus() {
		return LoginStatus;
	}




	public void setLoginStatus(String loginStatus) {
		LoginStatus = loginStatus;
	}




	public int getAgentLogincount() {
		return AgentLogincount;
	}




	public void setAgentLogincount(int agentLogincount) {
		AgentLogincount = agentLogincount;
	}




	@Override
	public String toString() {
		return "agents [AgentId=" + AgentId + ", AgentName=" + AgentName + ", AgentEmail=" + AgentEmail
				+ ", AgentPassword=" + AgentPassword + ", LoginStatus=" + LoginStatus + ", AgentLogincount="
				+ AgentLogincount + "]";
	}
	
}
