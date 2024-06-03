import java.io.File;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception
    {
        File file = new File(".");
        URL[] urls = {file.toURI().toURL()};
        Set<Object> objects = new HashSet<>();
        for (int i = 0; i < 10; i++)
        {
            URLClassLoader loader = new URLClassLoader(urls,null);
            Class<?> c = Class.forName("Test", true, loader);
            Field field = c.getField("object");
            Object o = field.get(null);
            objects.add(o);
        }
        System.out.println(objects);
    }
}