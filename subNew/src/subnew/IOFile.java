/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subnew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class IOFile {

    public static <T> List<T> read(String fname) throws Exception {
        ArrayList<T> list = new ArrayList<T>();
        ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
        list = (ArrayList<T>) o.readObject();
        o.close();
        return list;

    }

    public static <T> void write(String fname, ArrayList<T> list) throws Exception {
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
        o.writeObject(list);
        o.close();
    }

}
