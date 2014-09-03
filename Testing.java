import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.emc.emf.EmfModelFactory;
import org.eclipse.emf.ecore.EcorePackage;
import java.io.PrintWriter;


class Testing {
    public static void main (String[] args) throws Exception{
        
        String result = "";
        //EglTemplate template;
        EglTemplateFactory factory = new EglTemplateFactory();

        IModel model = EmfModelFactory.getInstance().loadEmfModel("MyModel", new File("./tmp/comicBooks.model"), new File("./tmp/comicBooks.ecore"));
        factory.getContext().getModelRepository().addModel(model);
        
        File templateFile = new File("./egl/artists2.egl");

       // EglTemplate template = factory.load(templateFile);
        
        //for (ParseProblem i : template.getParseProblems()){
       //     System.out.println(i);
        //}
        
        
        //template.populate("argument", model.getAllOfKind("Artist").iterator().next());
        

        //String result = template.process();
        
        
        //PrintWriter writer = new PrintWriter("./compare/egl.txt", "UTF-8");
        //writer.println(result);
        //writer.close();
        //System.out.println(result);
        
        

        for (Object artist : model.getAllOfKind("Artist")) {
            EglTemplate template = factory.load(templateFile);
        
        
            for (ParseProblem i : template.getParseProblems()){
                System.out.println(i);
            }
        
            template.populate("argument", artist);
            
            result += template.process();
            //System.out.println(result);
        
        }
        PrintWriter writer = new PrintWriter("./compare/egl.txt", "UTF-8");
        writer.println(result);
        writer.close();
        System.out.println(result);
        }
}
