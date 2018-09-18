package figures;

import org.eclipse.draw2d.ImageFigure;

import MDEProject.figures.activator.PluginActivator;

public class FinalNodeFigure extends ImageFigure {

	public FinalNodeFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/EstadoFinalNovo.png").createImage(), 0);
	}

}