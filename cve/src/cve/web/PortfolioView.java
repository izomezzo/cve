package cve.web;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class PortfolioView implements Serializable {

	private static final long serialVersionUID = -576366089588731944L;
	private static final Logger logger = Logger.getLogger("politse.web.PortfolioView");
}
