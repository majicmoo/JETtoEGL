import comicbook.*;

import java.io.File;

import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.epsilon.eol.models.IModel;

import comicBooks.ComicBooksPackage;
import java.io.PrintWriter;

public class JetTest{

	public static void main(String[] args) throws Exception {
		Artists2 artists2 = new Artists2();
		
		File modelFile = new File("./tmp/comicBooks.model");
		IModel model = EmfModelFactory.getInstance().loadEmfModel("OurModel", modelFile, ComicBooksPackage.eINSTANCE);
		
		
		PrintWriter writer = new PrintWriter("./compare/jet.txt", "UTF-8");

		
		for (Object component : model.getAllOfKind("Artist")) {
			System.out.println(artists2.generate(component));
			writer.println(artists2.generate(component));
		}
		writer.close();
	}
}
