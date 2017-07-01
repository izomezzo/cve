package cve.web;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MenuView implements Serializable {
	
	private static final long serialVersionUID = -1015364935820045523L;
	private String view;

	public void selectStock() {
	    setView("stocks.xhtml");
	}
	
	public void selectPortfolio() {
		setView("portfolio.xhtml");
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}
	
}
