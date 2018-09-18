package figures;

import org.eclipse.draw2d.ImageFigure;

import MDEProject.figures.activator.PluginActivator;

public class DecisionNodeFigure extends ImageFigure {

	public DecisionNodeFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/Decisao.png").createImage(), 0);
	}

}