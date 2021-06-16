package it.luzzetti.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class LandingPage extends Composite {
	private static LandingPageBinder uiBinder = GWT.create(LandingPageBinder.class);
	
	private Logger logger = Logger.getLogger(getClass().getName());

	@UiField
    ListBox listBox;
	
	public LandingPage() {
		logger.warning("Costruttore");
		initWidget(uiBinder.createAndBindUi(this));
		
		for(int i=0; i<10;i++) {
		listBox.addItem("elemento "+i);
		}
	}

	interface LandingPageBinder extends UiBinder<Widget, LandingPage> {
	}

}
