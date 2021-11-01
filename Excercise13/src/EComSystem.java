import com.Dinesh.csc106.ex13.*;
import java.util.List;

public class EComSystem {
	

	private String currency;
	private List<Brand> listofBrands;
	private List<Category> listofCategories;
	private List<Product> listofProducts;
	
	public EComSystem(String currency, List<Brand> listofBrands, List<Category> listofCategories,
			List<Product> listofProducts) {
		super();
		this.currency = currency;
		this.listofBrands = listofBrands;
		this.listofCategories = listofCategories;
		this.listofProducts = listofProducts;
	}
	
	public void SearchProduct(Boolean isBrand,List<Brand> searchBrand,Boolean category, List<Category> searchCategories) {
		if(searchBrand.addAll(listofBrands)) {
			isBrand=isBrand.TRUE;
			category=category.FALSE;
		}
		
		if(searchCategories.addAll(listofCategories)) {
			category=category.TRUE;
			isBrand=isBrand.FALSE;
		}
		
		if(searchBrand.addAll(listofBrands)&&searchCategories.addAll(getListofCategories())) {
			category=category.TRUE;
			isBrand=isBrand.TRUE;
		}
		
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public List<Brand> getListofBrands() {
		return listofBrands;
	}

	public void setListofBrands(List<Brand> listofBrands) {
		this.listofBrands = listofBrands;
	}

	public List<Category> getListofCategories() {
		return listofCategories;
	}

	public void setListofCategories(List<Category> listofCategories) {
		this.listofCategories = listofCategories;
	}

	public List<Product> getListofProducts() {
		return listofProducts;
	}

	public void setListofProducts(List<Product> listofProducts) {
		this.listofProducts = listofProducts;
	}

}
