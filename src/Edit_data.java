import java.util.*;
import java.io.*;

public class Edit_data {
    Scanner sc;

    //Default constructor
    public Edit_data() {

    }

    public void editData(String file, String editID, String new_name, String new_price) {
        String old_id = "";
        String old_name = "";
        String old_price = "";
        String tempFile = "temp.txt";
        File oldFile = new File(file);
        File newFile = new File(tempFile);

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            sc = new Scanner(new File(file));
            sc.useDelimiter("[,\n]");

            while (sc.hasNext()) {
                old_id = sc.next();
                old_name = sc.next();
                old_price = sc.next();

                if (old_id.equals(editID)) {
                    pw.println(old_id +","+new_name +","+ new_price);
                } else {
                    pw.print(old_id +","+ old_name +","+ old_price);
                }
            }
            sc.close();
            pw.flush();
            pw.close();

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
