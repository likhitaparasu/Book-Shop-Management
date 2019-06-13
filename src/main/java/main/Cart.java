package main;
import java.util.ArrayList;
import java.util.List;

import main.Bill;
import main.Item;

public class Cart extends Bill{
    //one cart one bill
    public List<Item> inCart = new ArrayList<Item>();
    public List<Integer> quant = new ArrayList<Integer>();
    public int noOfIte=0;
    public void updateCart(Item a,int q ){
    	noOfIte++;
    	inCart.add(a);
    	quant.add(q);
   

    }
    public int totalAmt=0;
    public void finalizeCart(String name){
        super.getBill(name);//make it outside
        for(int i=0;i<noOfIte;i++){
            System.out.println("|  "+ inCart.get(i).itemNa + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
        }
        totalAmt = calcBill();
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
    }
    public int calcBill() {
    	int total=0;
    for(int i=0;i<noOfIte;i++)
    {
    	total=total+(inCart.get(i).mrp * quant.get(i));
    }
    	return total;
    	
    }
}