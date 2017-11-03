package eu.fweiler.cooking;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Button;


/**
 * @author weiler
 * @since 03.11.2017
 */
public class SearchReceipeBtn extends Button {

	/**  */
	private static final long serialVersionUID = -7618772385687375685L;
	
	
	/**
	 * 
	 */
	public SearchReceipeBtn() {
		super();
		setCaption("Suche");
		setIcon(VaadinIcons.SEARCH);
	}

}
