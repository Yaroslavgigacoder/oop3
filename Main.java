import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main { 

    public static void main(String[] args) {
        Comparator<Notebook> Ram = new Comporator();
        Comparator<Notebook> Core = new ComporatorCore();
        List<Notebook> NotebookS = new ArrayList<>();
        Notebook notebook1 = new Notebook(100000, 4000,6);
        Notebook notebook2 = new Notebook(10000, 8000,2);
        Notebook notebook3 = new Notebook(140000, 5000,4);        
        Notebook notebook4 = new Notebook(200000, 32000,16);
        NotebookS.add(notebook1);
        NotebookS.add(notebook2);  
        NotebookS.add(notebook3);  
        NotebookS.add(notebook4);
        System.out.println(NotebookS);
        Collections.sort(NotebookS);
        System.out.println(NotebookS);
        NotebookS.sort(Ram);
        System.out.println(NotebookS);
        NotebookS.sort(Core);
        System.out.println(NotebookS);
       

    }   
    
}

