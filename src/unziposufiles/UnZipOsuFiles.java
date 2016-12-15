/*
    [Osu!unZip]
    Copyright (C) 2016  NewKey

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package unziposufiles;

import java.io.File;
import java.util.List;
import net.lingala.zip4j.core.ZipFile;
import org.apache.commons.io.FileUtils;

public class UnZipOsuFiles{

    private static File T_CompressedFolder;
    private static File T_FolderToExtract;
    private static File T_ProcessedFolder;
    private static boolean C_DeleteAfter;
    private static boolean C_Replace;
    List<String> fileList;
    static List<String> WRONGfiles;
    public static Thread Thread= new Thread();
    public static boolean pause=false;
    static int replace = 0;
    static int success= 0;
    static int delete = 0;
    static int moved=0;
    static int wrong=0;
   
          



    public static void Run() {
	Runnable runnable = new Runnable() {
            private boolean wronng;
	    public void run() {
		do{
		try {
                    for (File file : T_CompressedFolder.listFiles()) {
                        if (file.isFile()  && 
                                file.toString().substring(file.toString().length()-3).equals("osz") &&
                                pause==false) {
                            File Folder = new File(String.valueOf(T_FolderToExtract) + "\\" + file.getName().substring(0, file.getName().length() - 4));
                            String fl = String.valueOf(Folder);
                            while(fl.charAt(fl.length()-1) == '.'){
                                fl = fl.substring(0, fl.length()-1);
                            }
                            while(fl.charAt(fl.length()-1) == ' '){
                                fl = fl.substring(0, fl.length()-1);
                            }
                            System.out.print(wronng);
                            if (!Folder.exists()) {
                                Folder.mkdir();
                                ZipFile zipFile = new ZipFile(file.getAbsolutePath());
                                try{
                                    zipFile.extractAll(fl);
                                }catch(Exception ex){
                                    wronng=true;
                                }
                            }else{
                                if(C_Replace){
                                    ZipFile zipFile = new ZipFile(file.getAbsolutePath());
                                    zipFile.extractAll(fl);
                                    replace++;
                                    unzip.L_replace.setText(String.valueOf(replace));
                                }
                            }
                            System.out.print(wronng);
                            if(wronng){
                                wrong++;
                                WRONGfiles.add(String.valueOf(file));
                                System.out.println(WRONGfiles);
                                unzip.b_wrong.setEnabled(true);
                                unzip.L_wrong.setText(String.valueOf(wrong));
                            }
                            if(C_DeleteAfter){
                                file.delete();
                                delete++;
                                unzip.L_delete.setText(String.valueOf(delete));
                            }
                            else{
                                File fileTwo = new File(T_ProcessedFolder+File.separator+file.toString().substring(file.toString().lastIndexOf("\\")));
                                if(!fileTwo.exists()){
                                    FileUtils.moveFileToDirectory(file, T_ProcessedFolder,false);
                                    moved++;
                                    unzip.L_moved.setText(String.valueOf(moved));
                                }
                            }
                            success++;
                        unzip.ProcessBar.setValue(success);
                        unzip.l_count.setText(String.valueOf(success));
                        }
                    }
                    Thread.stop();
                } catch (Exception ex) {}
                }while(pause);
	    }
	};
	Thread = new Thread(runnable);
        Thread.start();
    }
    
    public static void Pause(){
	pause=true;
    }
     
     public static void Resume(){
	pause=false;
    }
    
    public static void preRun(){
        String state = unzip.b_UnZip.getText();
        if(unzip.T_CompressedFolder.getText().isEmpty())
            T_CompressedFolder = null;
        else
            T_CompressedFolder = new File(unzip.T_CompressedFolder.getText());
        
        if(unzip.T_FolderToExtract.getText().isEmpty())
            T_FolderToExtract = null;
        else
            T_FolderToExtract = new File(unzip.T_FolderToExtract.getText());
        
        if(unzip.T_ProcessedFolder.getText().isEmpty())
            T_ProcessedFolder = null;
        else
            T_ProcessedFolder = new File(unzip.T_ProcessedFolder.getText());
        C_DeleteAfter = unzip.C_DeleteAfter.isSelected();
        C_Replace = unzip.C_Replace.isSelected();
        if(index()!=0){
            if(state.equals(">")){
               Resume();
                if(!T_CompressedFolder.equals("") || 
                        !T_FolderToExtract.equals("") || 
                        !T_ProcessedFolder.equals("")){
                    disAble();
                    unzip.b_UnZip.setText("||");
                    Run();
                }
            }else{
                Pause();
                unzip.b_UnZip.setText(">");
            }
        }
    }
    
    static int c=0;
    public static int index(){
        for (File file : T_CompressedFolder.listFiles()) {
            String ext = file.toString().substring(file.toString().length()-3);
            if(ext.equals("osz")){ 
                c++;
            }
        }
        unzip.ProcessBar.setMaximum(c);
        unzip.ProcessBar.setMinimum(0);
        unzip.l_maximus.setText(String.valueOf(c));
        return c;
    }
    
    public static void Stop(){
        Able();
        T_CompressedFolder = new File("");
        T_FolderToExtract = new File("");
        T_ProcessedFolder = new File("");
        unzip.C_DeleteAfter.setSelected(false);
        unzip.C_Replace.setSelected(false);
        unzip.b_UnZip.setText(">");
        unzip.l_maximus.setText("0");
        unzip.l_count.setText("0");
        unzip.L_moved.setText("0");
        unzip.L_delete.setText("0");
        unzip.L_replace.setText("0");
        unzip.L_wrong.setText("0");
        unzip.ProcessBar.setMaximum(0);
        unzip.ProcessBar.setMinimum(0);
        unzip.b_wrong.setEnabled(false);
        WRONGfiles.clear();
        replace = 0;
        success= 0;
        delete = 0;
        moved=0;
        c=0;
        wrong=0;
        Thread.stop();
    }

    private static void disAble(){
	unzip.T_CompressedFolder.setEnabled(false);
	unzip.T_FolderToExtract.setEnabled(false);
	unzip.T_ProcessedFolder.setEnabled(false);
        unzip.C_DeleteAfter.setEnabled(false);
        unzip.C_Replace.setEnabled(false);
    }
    
    private static void Able(){
	unzip.T_CompressedFolder.setEnabled(true);
	unzip.T_FolderToExtract.setEnabled(true);
	unzip.T_ProcessedFolder.setEnabled(true);
        unzip.C_DeleteAfter.setEnabled(true);
        unzip.C_Replace.setEnabled(true);
    }
}
    
    