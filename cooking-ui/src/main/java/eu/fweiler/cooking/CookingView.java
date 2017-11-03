package eu.fweiler.cooking;

import com.vaadin.navigator.View;
import com.vaadin.ui.Component;

/**
 * @author weiler
 * @since 03.11.2017
 */
public interface CookingView extends View, Component {

	void setPresenter(CookingListPresenter presenter);
}
