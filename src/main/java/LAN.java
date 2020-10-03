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
	boolean sopTransm, controlAccess, standars;
	int vTransm;
	Node head = null, next = null, last = null, receptor;
	int size=0;

	public LAN(boolean sopTransm, boolean controlAccess, boolean standars, int vTransm, Node receptor,
									String name, String type, String mssg){
		super(name, type, mssg);
		this.sopTransm = sopTransm;
		this.controlAccess = controlAccess;
		this.standars = standars;
		this.vTransm = vTransm;
		this.receptor = receptor;
	}

	public String getNetName() {
		return netName;
	}

	public void setNetName(String netName) {
		this.netName = netName;
	}

	public boolean isSopTransm() {
		return sopTransm;
	}

	public void setSopTransm(boolean sopTransm) {
		this.sopTransm = sopTransm;
	}

	public boolean isControlAccess() {
		return controlAccess;
	}

	public void setControlAccess(boolean controlAccess) {
		this.controlAccess = controlAccess;
	}

	public boolean isStandars() {
		return standars;
	}

	public void setStandars(boolean standars) {
		this.standars = standars;
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

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
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
	abstract void add(String name);
	abstract void delete(Node  nodo);
	abstract boolean sendPack(String mssg, Node rec);
	abstract boolean difundPack(String mssg);
	
}
