package eu.fweiler.cooking;

import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.VerticalLayout;

import eu.fweiler.cooking.components.ReceipesGrid;


/**
 * @author weiler
 * @since 03.11.2017
 */
public class CookingListViewImpl extends CustomComponent implements CookingListView {

	/**  */
	private static final long serialVersionUID = -5524249479939342999L;
	private CookingListPresenter presenter;
	
	
	/**
	 * 
	 */
	public CookingListViewImpl() {
		CookingListToolbar toolbar = new CookingListToolbar();
		ReceipesGrid list = new ReceipesGrid();
		
		VerticalLayout root = new VerticalLayout();		
		root.addComponent(toolbar);		 
		root.addComponentsAndExpand(list);
		setCompositionRoot(root);
	}
	
	/* (non-Javadoc)
	 * @see com.vaadin.navigator.View#enter(com.vaadin.navigator.ViewChangeListener.ViewChangeEvent)
	 */
	@Override
	public void enter(ViewChangeEvent event) {
		presenter.onEnterView(event);
	}

	/* (non-Javadoc)
	 * @see eu.fweiler.cooking.CookingView#setPresenter(eu.fweiler.cooking.CookingPresenter)
	 */
	@Override
	public void setPresenter(CookingListPresenter presenter) {
		this.presenter = presenter;		
	}

	/* (non-Javadoc)
	 * @see eu.fweiler.cooking.CookingListView#getPresenter()
	 */
	@Override
	public CookingListPresenter getPresenter() {
		return presenter;
	}

}
