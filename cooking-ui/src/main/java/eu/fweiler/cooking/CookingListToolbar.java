package eu.fweiler.cooking;


/**
 * @author weiler
 * @since 03.11.2017
 */
public class CookingListToolbar extends AbstractCookingToolbar{

	/**  */
	private static final long serialVersionUID = -5139790444758273795L;
	
	
	/**
	 * 
	 */
	public CookingListToolbar() {
		addComponent(new AddReceipeBtn());
		addComponent(new SearchText());
		addComponent(new SearchReceipeBtn());
	}

}
