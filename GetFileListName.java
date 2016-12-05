import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Get the index of .html files in the current directory
 * 
 * @author Lianxin
 *
 */
public class GetFileListName {

    public static void main(String[] args) throws IOException {
        File file = new File("./");
        File[] files = file.listFiles();
        File list = new File("index.html");
        list.createNewFile();
        FileWriter fw = new FileWriter(list);
        for (File f : files) {
            if (f.getName().endsWith(".html") && !f.getName().equals("index.html")) {
//                System.out.println(f.getName());
//                <a href=""></a>
                fw.append("<a href='./" + f.getName() + "\'>" + f.getName() + "</a><br>\n");
            }
        }
        fw.close();
    }

}
