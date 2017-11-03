package eu.fweiler.cooking;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

/**
 *
 */
@Theme("cookingtheme")
public class CookingUI extends UI {

    /**  */
	private static final long serialVersionUID = 1158248253836049809L;
	private Navigator navigator;
    private CookingListView listView;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
		//
		listView = new CookingListViewImpl();
		listView.setPresenter(new CookingListPresenterImpl());
		listView.getPresenter().setView(listView);
		//
    	navigator = new Navigator(this, this);
    	navigator.addView("", listView);
        setContent(listView);
    }

    @WebServlet(urlPatterns = "/*", name = "CookingUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = CookingUI.class, productionMode = false)
    public static class CookingUIServlet extends VaadinServlet {

		/**  */
		private static final long serialVersionUID = -6703324635460789037L;
    }
}
