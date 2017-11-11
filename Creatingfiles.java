
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;



public class Creatingfiles {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		String folderpath=System.getenv("FOL_PATH");
		String filetype=System.getenv("FILE_TYPE");
		String newfilename=null;
		String newfilepath=null;
		File file_new=null;
		InputStream inStream = null;
		OutputStream outStream = null;
		
		
		if(filetype.equalsIgnoreCase("text")){
		newfilepath= folderpath + "\\"+"TextFiles";
		File[] fileList = getFileList(folderpath);
		File dir = new File(newfilepath);
		dir.mkdir();
		
		
		for(File file : fileList) {
            System.out.println("Source is" +  file.getName());
            newfilename=newfilepath+"\\"+file.getName();
           
            String sourcefile=folderpath+"\\"+file.getName();
            try{
            	File afile = new File(sourcefile);
            	File bfile = new File(newfilename);
            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);
            byte[] buffer = new byte[1024];
            
    	    int length;
    	    //copy the file content in bytes 
    	    while ((length = inStream.read(buffer)) > 0){
 
    	    	outStream.write(buffer, 0, length);
 
    	    }
    	    inStream.close();
    	    outStream.close();
    	    afile.delete();
    	    
    	    System.out.println("File is moved successfully!");
 
            }catch(IOException e){
            	System.out.println(e);
            }
           
		}	
        }
		
		if(filetype.equalsIgnoreCase("jpg")){
			newfilepath= folderpath + "\\"+"PhotoFiles";
			File[] photofileList=getPhotoFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : photofileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	    afile.delete();
	    	    
	    	    System.out.println("File is moved successfully!");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
			
		}
		if(filetype.equalsIgnoreCase("pdf")){
			newfilepath= folderpath + "\\"+"PDFFiles";
			File[] pdffileList=getPdfFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : pdffileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	          
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("doc")){
			newfilepath= folderpath + "\\"+"DOCFiles";
			File[] docfileList=getDocFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : docfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("docx")){
			newfilepath= folderpath + "\\"+"DOCXFiles";
			File[] docxfileList=getDocxFileList(folderpath); 
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : docxfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("xlsx")){
			newfilepath= folderpath + "\\"+"ExcelFiles";
			File[] excelfileList=getExcelFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : excelfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is copied successful!");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("jsp")){
			newfilepath= folderpath + "\\"+"JSPFiles";
			File[] jspfileList=getjspFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : jspfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	           
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully!");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("xps")){
			newfilepath= folderpath + "\\"+"XPSPrintFiles";
			File[] xpsfileList=getxpsFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : xpsfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	          
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("gif")){
			newfilepath= folderpath + "\\"+"GIFFiles";
			File[] giffileList=getgifFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : giffileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	           
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("rtf")){
			newfilepath= folderpath + "\\"+"RTFFiles";
			File[] rtffileList=getrtfFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : rtffileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("JPEG")){
			newfilepath= folderpath + "\\"+"JPGFiles";
			File[] JPGfileList=getJPGFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : JPGfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	           
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("mp4")){
			newfilepath= folderpath + "\\"+"videoFiles";
			File[] mp4fileList=getmp4FileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : mp4fileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		if(filetype.equalsIgnoreCase("bmp")){
			newfilepath= folderpath + "\\"+"bmpFiles";
			File[] bmpfileList=getbmpFileList(folderpath);
			File dir = new File(newfilepath);
			dir.mkdir();
			
			
			for(File file : bmpfileList) {
	            System.out.println("Source is" +  file.getName());
	            newfilename=newfilepath+"\\"+file.getName();
	            
	            String sourcefile=folderpath+"\\"+file.getName();
	            try{
	            	File afile = new File(sourcefile);
	            	File bfile = new File(newfilename);
	            inStream = new FileInputStream(afile);
	            outStream = new FileOutputStream(bfile);
	            byte[] buffer = new byte[1024];
	            
	    	    int length;
	    	    //copy the file content in bytes 
	    	    while ((length = inStream.read(buffer)) > 0){
	 
	    	    	outStream.write(buffer, 0, length);
	 
	    	    }
	    	    inStream.close();
	    	    outStream.close();
	    	   afile.delete();
	    	    
	    	    System.out.println("File is moved successfully");
	 
	            }catch(IOException e){
	            	System.out.println(e);
	            }
	           
			}	
	        }
		
	}

	private static File[] getFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        });
        return fileList;
    }
	private static File[] getPhotoFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        return fileList;
    }
	private static File[] getPdfFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".pdf");
            }
        });
        return fileList;
    }
	private static File[] getDocFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".doc");
            }
        });
        return fileList;
    }
	private static File[] getDocxFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".docx");
            }
        });
        return fileList;
    }
	private static File[] getExcelFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".xlsx");
            }
        });
        return fileList;
    }
	private static File[] getjspFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".jsp");
            }
        });
        return fileList;
    }
	private static File[] getxpsFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".xps");
            }
        });
        return fileList;
    }
	private static File[] getgifFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".gif");
            }
        });
        return fileList;
    }
	private static File[] getrtfFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".rtf");
            }
        });
        return fileList;
    }
	private static File[] getJPGFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".JPG");
            }
        });
        return fileList;
    }
	private static File[] getmp4FileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".mp4");
            }
        });
        return fileList;
    }
	private static File[] getbmpFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".bmp");
            }
        });
        return fileList;
    }
	
}
