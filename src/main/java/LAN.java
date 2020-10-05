/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karla
 */
public abstract class LAN extends Node{
	String netName = "";
	String sopTransm, controlAccess, standars;
	int vTransm;
	Node head = null, last = null, receptor;
	int size=0;

	public LAN(String sopTransm, String controlAccess, String standars, int vTransm, Node receptor,
									String name, String type, String mssg, Node head, Node last, Node next){
		super(name, type, mssg, next);
		this.sopTransm = sopTransm;
		this.controlAccess = controlAccess;
		this.standars = standars;
		this.vTransm = vTransm;
		this.receptor = receptor;
		this.head = head;
		this.last = last;
	}

	public String getNetName() {
		return netName;
	}

	public void setNetName(String netName) {
		this.netName = netName;
	}

	public String getSopTransm() {
		return sopTransm;
	}

	public void setSopTransm(String sopTransm) {
		this.sopTransm = sopTransm;
	}

	public String getControlAccess() {
		return controlAccess;
	}

	public void setControlAccess(String controlAccess) {
		this.controlAccess = controlAccess;
	}

	public String getStandars() {
		return standars;
	}

	public void setStandars(String standars) {
		this.standars = standars;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setNext(Node next) {
		super.setNext(next);
	}

	@Override
	public Node getNext() {
		return super.getNext();
	}

	@Override
	protected void finalize() throws Throwable {
		super.finalize(); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public String toString() {
		return super.toString(); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	public int hashCode() {
		return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
	}

	
	
	public int getvTransm() {
		return vTransm;
	}

	public void setvTransm(int vTransm) {
		this.vTransm = vTransm;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}

	public Node getReceptor() {
		return receptor;
	}

	public void setReceptor(Node receptor) {
		this.receptor = receptor;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String getMssg() {
		return mssg;
	}

	@Override
	public void setMssg(String mssg) {
		this.mssg = mssg;
	}

	/**
	 *
	 * @return
	 */
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 *
	 * @return
	 */
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

	
	abstract int enumerate();
	abstract boolean search(String name);
	abstract void removePosition(int index);
	abstract void add(String name, String type);
	abstract void delete();
	abstract boolean sendPack(String mssg, Node rec);
	abstract boolean difundPack(String mssg);
	abstract boolean config(String sopTransm, String controlAccess, String standars, int vTransm);
	
}
