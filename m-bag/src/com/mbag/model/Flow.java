package com.mbag.model;

import java.util.ArrayList;
import java.util.List;

import com.mbag.data.FlowConstant;

public class Flow {
	/**������*/
	private String tradeCode;
	/**��������*/
	private String name;
	/**�Ƿ����*/
	private boolean isUse;
	/**�Ƿ���Ĭ�Ͻڵ�*/
	private boolean isGoDefaultNode;
	/**�ڵ㼯��*/
	private List<Node> flow = new ArrayList<Node>();
	
	private FlowConstant flowConstant;
	
	public String getTradeCode() {
		return tradeCode;
	}
	public void setTradeCode(String tradeCode) {
		this.tradeCode = tradeCode;
	}
	public boolean isUse() {
		return isUse;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	public boolean isGoDefaultNode() {
		return isGoDefaultNode;
	}
	public void setGoDefaultNode(boolean isGoDefaultNode) {
		this.isGoDefaultNode = isGoDefaultNode;
	}
	
	public boolean addNode(Node node){
		return flow.add(node);
	}
	
	public List<Node> getNodes(){
		return flow;
	}
	
	public boolean removeNode(Node node){
		 return flow.remove(node);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FlowConstant getFlowConstant() {
		return flowConstant;
	}
	public void setFlowConstants(FlowConstant flowConstant) {
		this.flowConstant = flowConstant;
	}
	@Override
	public String toString() {
		return "tradeCode:"+tradeCode+">>>"+flow.toString();
	}
	
}
