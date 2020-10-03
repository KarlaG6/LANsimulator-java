/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author karla
 */
public class Ring extends LAN{

	public Ring(boolean sopTransm, boolean controlAccess, boolean standars, int vTransm, Node receptor,
												String name, String type, String mssg) {
		super(sopTransm, controlAccess, standars, vTransm, receptor, name, type, mssg);
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

	public String getMssg() {
		return mssg;
	}

	public void setMssg(String mssg) {
		this.mssg = mssg;
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

	@Override
	int enumerate() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	void add(String name) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	void delete(Node nodo) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	boolean sendPack(String mssg, Node rec) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	boolean difundPack(String mssg) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	
	
}
