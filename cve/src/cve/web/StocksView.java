package cve.web;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ManagedBean
@SessionScoped
public class StocksView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 444800819325471815L;
	private static final Logger logger = Logger.getLogger("politse.web.StocksView");
	private Integer bidAmount;
	private Double bidPrice;
	private Integer askAmount;
	private Double askPrice;
	private String userId;

	@PostConstruct
    public void postInit() {
    
    }
	
	@PreDestroy
	public void preInit(){
		logger.log(Level.INFO,"StocksView PreDestroy - Session ended");
	}
	
	public Integer getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Integer bidAmount) {
		this.bidAmount = bidAmount;		
		logger.log(Level.INFO, "StocksView.setBidAmount: {0}", new Object[]{this.bidAmount}); 
	}
	
	public Integer getAskAmount() {
		logger.log(Level.INFO, "StocksView.getAskAmount:  {0}",  
        		new Object[]{this.askAmount});
		return askAmount;
	}

	public void setAskAmount(Integer askAmount) {
		this.askAmount = askAmount;
	}
	
	public Double getBidPrice() {
		logger.log(Level.INFO, "StocksView.getBidPrice:  {0}",  
        		new Object[]{this.bidPrice});
		return bidPrice;
	}

	public void setBidPrice(Double bidPrice) {
		this.bidPrice = bidPrice;
		logger.log(Level.INFO, "StocksView.setBidPrice:  {0}",  
        		new Object[]{this.bidPrice});
	}

	public Double getAskPrice() {
		logger.log(Level.INFO, "StocksView.getAskPrice:  {0}",  
        		new Object[]{this.askPrice});
		return askPrice;
	}

	public void setAskPrice(Double askPrice) {
		this.askPrice = askPrice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
