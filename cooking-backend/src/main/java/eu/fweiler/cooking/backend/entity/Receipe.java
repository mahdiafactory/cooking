package eu.fweiler.cooking.backend.entity;

import java.util.List;

/**
 * @author weiler
 * @since 03.11.2017
 */
public class Receipe extends CookingEntity {

	private String title;
	
	private List<Ingredient> ingredients;
	
	private List<Image> images;

	/**
	 * @param value
	 */
	public Receipe(String title) {
		setTitle(title);
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	/**
	 * @return the images
	 */
	public List<Image> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(List<Image> images) {
		this.images = images;
	}
}
