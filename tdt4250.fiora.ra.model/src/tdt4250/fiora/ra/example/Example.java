package tdt4250.fiora.ra.example;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tdt4250.fiora.ra.Course;
import tdt4250.fiora.ra.Department;
import tdt4250.fiora.ra.RaPackage;

public class Example {

	public static void main(String[] args) {
		// container of resources
		// resource is a container of instances corresponding to a file
		ResourceSet resSet = new ResourceSetImpl();
		
		// tells the system that packages/ reference in xmi file by given URI are instances of the model 
		// identified by Java by ra package instance
		// URI maps to package object
		resSet.getPackageRegistry().put(RaPackage.eNS_URI, RaPackage.eINSTANCE);
		
		// if want to load an xmi file, use a certain resource factory to create resources
		// parse using XMI parse.
		// Use that parser to map to instances of our model
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		Resource resource = resSet.getResource(URI.createURI(Example.class.getResource("Department.xmi").toString()), true);
//		TreeIterator<EObject> allContents = resource.getAllContents();
		
		Department department = (Department) resource.getContents().get(0);
		for(Course course : department.getCourses()) {
			System.out.println(course);
		}
//		while(allContents.hasNext()) {
//			EObject eObject = allContents.next();
//			System.out.print(eObject);
//			System.out.print("\n");
//		}
	}	
	
	
}
