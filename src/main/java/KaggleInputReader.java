package main.java;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: mneedham
 * Date: 25/11/2012
 * Time: 20:22
 * To change this template use File | Settings | File Templates.
 */
public class KaggleInputReader {
    public static String[] fileAsStringArray(String file) {
        ArrayList<String> list = new ArrayList<String>();

        try {
            DataInputStream in = new DataInputStream(new FileInputStream(file));
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;
            br.readLine(); // discard top one
            while ((strLine = br.readLine()) != null) {
                list.add(strLine);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }
        return list.toArray(new String[list.size()]);
    }

}
