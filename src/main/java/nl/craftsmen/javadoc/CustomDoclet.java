package nl.craftsmen.javadoc;

import com.sun.javadoc.ClassDoc;
import com.sun.javadoc.RootDoc;
import jdk.javadoc.doclet.Reporter;
import jdk.javadoc.internal.doclets.toolkit.AbstractDoclet;
import jdk.javadoc.internal.doclets.toolkit.BaseConfiguration;
import jdk.javadoc.internal.doclets.toolkit.DocletException;
import jdk.javadoc.internal.doclets.toolkit.util.ClassTree;

import javax.lang.model.element.TypeElement;
import java.util.Locale;
import java.util.Set;
import java.util.SortedSet;

public class CustomDoclet extends AbstractDoclet {


    public static boolean start(RootDoc root) {
        ClassDoc[] classes = root.classes();
        for (int i = 0; i < classes.length; ++i) {
            System.out.println(classes[i]);
        }
        return true;
    }

    public BaseConfiguration getConfiguration() {
        return null;
    }

    protected void generateModuleFiles() throws DocletException {

    }

    protected void generatePackageFiles(ClassTree classtree) throws DocletException {

    }

    protected void generateClassFiles(SortedSet<TypeElement> arr, ClassTree classtree) throws DocletException {

    }

    public void init(Locale locale, Reporter reporter) {

    }

    public String getName() {
        return null;
    }

    public Set<? extends Option> getSupportedOptions() {
        return null;
    }
}
