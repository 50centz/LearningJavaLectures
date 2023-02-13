package Lectures.Lecture2;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        var s = System.currentTimeMillis();
        //String a = "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            //a = a + "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);

        String[] name = {"С", "е", "р", "г", "е", "й"};
        //String sk = "СЕРГЕЙ КА.";
        System.out.println(String.join("", name));
        System.out.println(String.join("", "С", "е", "р", "г", "е", "й"));
        System.out.println(String.join(",", "С", "е", "р", "г", "е", "й"));
        System.out.println(System.currentTimeMillis() - s);

        // Много изменений – String
        // Много преобразований – StringBuilder


        // Работа с файловой системой. Файлы
        
        // File <имя> = new File(<полный путь к файлу>);

        // File f1 = new File("file.txt");
        // File f2 = new File("/Users/sk/vscode/java_projects/file.txt");





        // import java.io.File;
        // public class fileSystemDemo {
        // public static void main(String[] args) {
        // String pathProject = System.getProperty("user.dir");
        // String pathFile = pathProject.concat("/file.txt");
        // File f3 = new File(pathFile);
        // System.out.println(f3.getAbsolutePath ());
        // /Users/sk/vscode/java_projects/file.txt
        // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt



        // Работа с файловой системой. Файлы. Ошибки

        // try {
        //     Код, в котором может появиться ошибка
        //    } catch (Exception e) {
        //     Обработка, если ошибка случилась
        //    }
        //    finally {
        //     Код, который выполнится в любом случае
        //    }
           

 }

}


   
