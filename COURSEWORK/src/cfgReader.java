import java.io.*;
import java.io.FileNotFoundException;
public class cfgReader {

    FileReader input;
    BufferedReader bufRead = new BufferedReader(input);
    String myLine = null;

    public cfgReader() {
        input = new FileReader("src//houseConfig");
    }
    else
        throw java.io.FileNotFoundException;
}



        public String[] getWordArray() {
            String[] aux;
            aux = words.split(" ");
            System.out.println(aux);
            return aux;
        }
}
