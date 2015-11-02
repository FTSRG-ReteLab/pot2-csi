package hu.bme.mit.inf.critlab.codegen.templates

import hu.bme.mit.inf.critlab.codegen.dfd.generator.PIDGenerator
import hu.bme.mit.inf.critlab.codegen.dfd.pid.Node
import hu.bme.mit.inf.critlab.codegen.util.CodeGenerationUtil
import org.eclipse.emf.ecore.util.EcoreUtil
import hu.bme.mit.inf.critlab.codegen.dfd.pid.DataflowDiagram

class DataflowNetworkTemplate {
	protected val extension CodeGenerationUtil util = new CodeGenerationUtil
	public def transform(DataflowDiagram diagram, PIDGenerator generator) {
		EcoreUtil.resolveAll(diagram)
		for(node : diagram.nodes) {
			println(node.transform(generator));
		}
	}
	
	def transform(Node node, PIDGenerator generator) '''
	package «generator.targetPackage»;
	
	class Node_«node.name» {
		
		// Implementation of the node goes here.
		
	}
	'''
	
	
}