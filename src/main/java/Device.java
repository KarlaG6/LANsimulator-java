/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */ 
public abstract class Device {
	String name = "",type = "";
	boolean cel = false, computer = false, fax = false, workStation = false;

	public Device(String name, String type ) {
		this.name = name;
		this.type = type;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isCel() {
		return cel;
	}

	public void setCel(boolean cel) {
		this.cel = cel;
	}

	public boolean isComputer() {
		return computer;
	}

	public void setComputer(boolean computer) {
		this.computer = computer;
	}

	public boolean isFax() {
		return fax;
	}

	public void setFax(boolean fax) {
		this.fax = fax;
	}

	public boolean isWorkStation() {
		return workStation;
	}

	public void setWorkStation(boolean workStation) {
		this.workStation = workStation;
	}


}
