package Macy_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Macy_Utility.Macy_Base;

public class Macy_SearchPageLocator extends Macy_Base {

	
	public Macy_SearchPageLocator() {
		
		PageFactory.initElements(driver, this);	
			
		}
		
		
	
		@FindBy(xpath ="//h1[@class='result-category-name h3']")
		public WebElement verify;
		
	
}
