package plugins.laoc.helloworldplugin;

import icy.gui.dialog.MessageDialog;
import icy.plugin.abstract_.PluginActionable;

public class HelloWorldPlugin extends PluginActionable {

	@Override
	public void run() {
		// TODO Auto-generated by Icy4Eclipse
		MessageDialog.showDialog("HelloWorldPlugin is working fine !");
	}

}
