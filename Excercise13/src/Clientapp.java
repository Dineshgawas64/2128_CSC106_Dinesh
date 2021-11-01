import java.util.ArrayList;
import java.util.List;

import com.Dinesh.csc106.ex13.Brand;
import com.Dinesh.csc106.ex13.Category;
import com.Dinesh.csc106.ex13.Product;

public class Clientapp {

	public static void main(String[] args) {
		

		List<Brand> listofBrands = new ArrayList<>();
		listofBrands.add(new Brand("nokia", "korea"));
		listofBrands.add(new Brand("Sony", "Japan"));
		listofBrands.add(new Brand("Apple", "United States"));

		

		List<Category> listofCategories = new ArrayList<>()
				{
					{
						add(new Category("Mobiles"));
						add(new Category("Laptops"));
						add(new Category("Electronic Accessories"));
					}
				};
	
				List<Product> listofProducts = new ArrayList<>();
				listofProducts.add(new Product(listofBrands.get(1),
						"iPhone13",
						799.0,
						new ArrayList<Category>() {{//arraylist of category
							//create obj for a list bt nt fr categ
							//3 categories are there so the will be 3 obj
							add(listofCategories.get(0));
					}}
				));
				
				listofProducts.add(new Product(listofBrands.get(0),
						"Fast Charger",
						15.0,
						new ArrayList<Category>() {{//arraylist of category
							//create obj for a list bt nt fr categ
							//3 categories are there so the will be 3 obj
							add(listofCategories.get(0));
							add(listofCategories.get(2));//here we have 2 prod mob & elec Ascces
					}}
				));
				
				
				
	}

}
