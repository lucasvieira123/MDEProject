package figures;

import org.eclipse.draw2d.ImageFigure;

import MDEProject.figures.activator.PluginActivator;

public class InitialNodeFigure extends ImageFigure {

	public InitialNodeFigure() {
		super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/EstadoInicialNovo.png").createImage(), 0);
	}

}