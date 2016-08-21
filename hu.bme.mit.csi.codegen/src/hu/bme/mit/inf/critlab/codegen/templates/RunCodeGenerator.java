package hu.bme.mit.inf.critlab.codegen.templates;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import hu.bme.mit.inf.critlab.codegen.dfd.generator.GeneratorPackage;
import hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator;
import hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram;
import hu.bme.mit.inf.critlab.codegen.dfd.pid.PidPackage;

public class RunCodeGenerator {
	public static void main(String[] args) {
		PidPackage.eINSTANCE.getClass();
		GeneratorPackage.eINSTANCE.getClass();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		ResourceSet set = new ResourceSetImpl();
		Resource res = set.getResource(URI.createFileURI("instance/PIDGenerator.xmi"), true);
		Resource model = set.getResource(URI.createFileURI("instance/DataflowDiagram.xmi"), true);
		EcoreUtil.resolveAll(res);
		PIDGenerator generator = (PIDGenerator) res.getContents().get(0);
		DataflowDiagram dfd = (DataflowDiagram) model.getContents().get(0);
		
		//System.out.println(generator);
		
		DataflowNetworkTemplate template = new DataflowNetworkTemplate();
		try {
			template.transform(dfd,generator);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
