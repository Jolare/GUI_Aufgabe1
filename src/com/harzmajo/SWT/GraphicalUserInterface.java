package com.harzmajo.SWT;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.CTabFolder;

public class GraphicalUserInterface {
	// Menuleiste
	private Menu menuBar;
	// Filemenu und Name des Menus
	private MenuItem fileTitle;
	private Menu fileMenu;
	// Editmenu und Name des Menus
	private MenuItem editTitle;
	private Menu editMenu;
	// Einzelne Menuitems
	private MenuItem newFile;
	private MenuItem openFile;
	private MenuItem saveFile;
	private MenuItem quitFile;
	private MenuItem textcolorEdit;
	
	private Shell shell;
	private Display display;
	
	private void createDisplay() {
		display = new Display();
	}

	private void createShell() {
		shell = new Shell(display);
		shell.setLayout(new GridLayout(1,true));
	}
	
	private void createMenu() {
		menuBar = new Menu(shell,SWT.BAR);
		shell.setMenuBar(menuBar);
		fileTitle = new MenuItem
	}
}
