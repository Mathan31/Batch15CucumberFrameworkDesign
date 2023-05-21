package base;

import pages.PageObjectManager;
public class PicoTestContext {
	
	// POJO Class --> Plain Old Java Object
	
	private BrowserFactory testBase;
	private PageObjectManager pageObjectManager;
	
	public PicoTestContext() {
		testBase = new BrowserFactory();
		pageObjectManager = new PageObjectManager(testBase.browserInvoke());
	}

	public BrowserFactory getTestBase() {
		return testBase;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
