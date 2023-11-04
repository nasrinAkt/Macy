package Macy_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Macy_Utility.Macy_Base;

public class Macy_HomePageLocator extends Macy_Base{

	
	public Macy_HomePageLocator() {
		
	PageFactory.initElements(driver, this);	
		
	}
	@FindBy()
	public WebElement m;
	
	@FindBy()
	public WebElement n;
	
}
