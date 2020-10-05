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

	public Ring(String sopTransm, String controlAccess, String standars, int vTransm, Node receptor, 
					String name, String type, String mssg, Node head, Node next, Node last) {
		super(sopTransm, controlAccess, standars, vTransm, receptor, name, type, mssg, head, next, last);
	}

	@Override
	public String getNetName() {
		return netName;
	}

	@Override
	public void setNetName(String netName) {
		this.netName = netName;
	}

	@Override
	public String getSopTransm() {
		return sopTransm;
	}

	@Override
	public void setSopTransm(String sopTransm) {
		this.sopTransm = sopTransm;
	}

	@Override
	public String getControlAccess() {
		return controlAccess;
	}

	@Override
	public void setControlAccess(String controlAccess) {
		this.controlAccess = controlAccess;
	}

	@Override
	public String getStandars() {
		return standars;
	}

	@Override
	public void setStandars(String standars) {
		this.standars = standars;
	}

	@Override
	public int getvTransm() {
		return vTransm;
	}

	@Override
	public void setvTransm(int vTransm) {
		this.vTransm = vTransm;
	}

	@Override
	public Node getHead() {
		return head;
	}

	@Override
	public void setHead(Node head) {
		this.head = head;
	}

	@Override
	public Node getNext() {
		return next;
	}

	@Override
	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public Node getLast() {
		return last;
	}

	@Override
	public void setLast(Node last) {
		this.last = last;
	}

	@Override
	public Node getReceptor() {
		return receptor;
	}

	@Override
	public void setReceptor(Node receptor) {
		this.receptor = receptor;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
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
	public void setType(String type) {
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

	@Override
	int enumerate() {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	void add(String name, String type) {
		Node newN = new Node(name, type, "", null);
		if (head == null){
			head = newN;
			last = newN;
			last.setNext(head);
		}else{
//			newN = last;
			last.setNext(newN);
			newN.setNext(head);
			last = newN;
			
		}
		size++;
	}

	@Override
	void delete() {
		head = null;
		last = null;
		size = 0;
	}

	@Override
	boolean sendPack(String mssg, Node rec) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	boolean difundPack(String mssg) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	boolean search(String name) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	void removePosition(int index) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	@Override
	boolean config(String sopTransm, String controlAccess, String standars, int vTransm) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	
	
}
