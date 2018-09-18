package figures;

import org.eclipse.draw2d.ImageFigure;

import MDEProject.figures.activator.PluginActivator;

public class ForkFigure extends ImageFigure {

	public ForkFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/fork.png").createImage(), 0);
	}

}