﻿package SharedUI.Shared;

public __partial class AppDelegate
{
	public MainWindowController mainWindowController { __get; private __set;  }

	public void start()
	{
		//
		//  this is the cross-platform entry point for the app
		//

		mainWindowController = new MainWindowController();
		mainWindowController.showWindow(null);

		//
		// Add Shared code here
		//
	}
}