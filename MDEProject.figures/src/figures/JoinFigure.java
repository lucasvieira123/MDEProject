package figures;

import org.eclipse.draw2d.ImageFigure;

import MDEProject.figures.activator.PluginActivator;

public class JoinFigure extends ImageFigure {

	public JoinFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/join.png").createImage(), 0);
	}

}