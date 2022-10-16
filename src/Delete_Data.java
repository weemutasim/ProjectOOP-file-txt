import java.io.*;

public class Delete_Data {

    //Default constructor
    public Delete_Data() {

    }

    public void removeData(String file, int deleteLine) {
        int line = 0;
        String currentLint;

        String tempFile = "temp.txt";
        File oldFile = new File(file);
        File newFile = new File(tempFile);

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLint = br.readLine()) != null) {
                line++;
                if (deleteLine != line) {
                    pw.println(currentLint);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
