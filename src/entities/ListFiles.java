/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.File;
import parser.FileException;


/**
 *
 * @author mpurita
 */
public class ListFiles {
    private String[] files;
    private File dir;

    public ListFiles(String dirName, String extension) throws FileException {
        dir = new File(dirName);

        files = dir.list();
        files = boardsFiles(files, extension);
        if (files == null) {
            throw new FileException("Invalid Dir");
        };
    }

    public String[] getFiles() {
        return files;
    }

    private String[] boardsFiles(String[] aux, String extension) {
        int k = 0;
        String[] auxFiles = new String[aux.length];
        String[] finalFiles;

        for(int i = 0; i < aux.length; i++) {
            if(aux[i].substring(aux[i].lastIndexOf("."),
                    aux[i].length()).compareTo(extension) == 0){
                auxFiles[k++] = aux[i];
            }
        }
        return copyFilesToAux(auxFiles, k);
    }

    private String[] copyFilesToAux(String[] aux, int size) {
        String[] finalFiles = new String[size];

        for(int i = 0; i < size; i++) {
            finalFiles[i] = aux[i];
        }
        return finalFiles;

    }
}