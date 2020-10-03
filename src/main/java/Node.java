/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
abstract public class Node extends Device{
	
	String mssg = "";

	public Node(String name, String type, String mssg) {
		super(name, type);
		this.mssg = mssg;
	}
	

	public String getMssg() {
		return mssg;
	}

	public void setMssg(String mssg) {
		this.mssg = mssg;
	}


	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setType(String selected) {
		this.type = type;
	}

	@Override
	public boolean isCel() {
		return cel;
	}

	@Override
	public void setCel(boolean cel) {
		this.cel = cel;
	}

	@Override
	public boolean isComputer() {
		return computer;
	}

	@Override
	public void setComputer(boolean computer) {
		this.computer = computer;
	}

	@Override
	public boolean isFax() {
		return fax;
	}

	@Override
	public void setFax(boolean fax) {
		this.fax = fax;
	}

	@Override
	public boolean isWorkStation() {
		return workStation;
	}

	@Override
	public void setWorkStation(boolean workStation) {
		this.workStation = workStation;
	}

	
	
}
