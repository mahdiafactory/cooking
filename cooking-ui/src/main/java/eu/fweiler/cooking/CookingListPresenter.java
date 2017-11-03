package eu.fweiler.cooking;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;

/**
 * @author weiler
 * @since 03.11.2017
 */
public interface CookingListPresenter  {

	/**
	 * @param event
	 */
	void onEnterView(ViewChangeEvent event);
	
	void setView(CookingListView view);

}
