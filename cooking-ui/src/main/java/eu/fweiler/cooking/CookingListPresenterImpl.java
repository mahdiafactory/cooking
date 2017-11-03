package eu.fweiler.cooking;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;


/**
 * @author weiler
 * @since 03.11.2017
 */
public class CookingListPresenterImpl implements CookingListPresenter {

	private CookingListView view;
	/*
	 * (non-Javadoc)
	 * @see eu.fweiler.cooking.CookingListPresenter#onEnterView(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent)
	 */
	@Override
	public void onEnterView(ViewChangeEvent event) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see eu.fweiler.cooking.CookingListPresenter#setView(eu.fweiler.cooking.CookingListView)
	 */
	@Override
	public void setView(CookingListView view) {
		this.view = view;		
	}

}
