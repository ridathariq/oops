
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

class Files {

public static void main (String[]args) throws IOException {

int ch;

FileReader fr=new FileReader("sample.txt");
FileWriter fw=new FileWriter("copy.txt");

while((ch=fr.read())!=-1)  {

System.out.println((char)ch);
fw.write((char)ch);
}

fw.close();
fr.close();


}
}