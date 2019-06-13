package main;
public class Item{
    public String itemNa;
    public int mrp;
    public  void addItem(String itemName,int mrpItem){
       this.itemNa=itemNa;
       this.mrp=mrpItem;

    }
	public String getItemNa() {
		return itemNa;
	}
	public void setItemName(String itemNa) {
		this.itemNa = itemNa;
	}
	public int getMrp() {
		return mrp;
	}
	public void setMrp(int mrp) {
		this.mrp = mrp;
	}
    
}