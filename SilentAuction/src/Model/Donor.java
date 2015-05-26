package Model;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;

public class Donor extends User {

	String company;
	Image logo;
	ArrayList<ItemModel> itemList = new ArrayList<ItemModel>();
	
	public Donor(String company, Image logo){
		
		this.company = company;
		this.logo = logo;
	}
	
	public void donate(ItemModel item) {
		itemList.add(item);
	}
	
	public String getCompany() {
		return company;
	}
	
	public Image getLogo() {
		return logo;
	}
}
