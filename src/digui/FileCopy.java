package digui;

import java.io.*;

/**
 * 需求：将指定目录（包含内容）复制到另一个目录中
 * 源目录  目标目录
 * 分析：
 *      首先我们要获取源目录下所有文件和子目录
 *      把源目录封装成一个File对象，调用File的listFile方法，就可以获得源目录下所有文件和子目录对应的File对象
 *
 *      如果获取的是文件：现在目标目录中创建该文件所对应的目录，进行文件的复制
 *      如果获取的是子目录，看看子目录下面是否还有其他的文件或者更深层的子目录
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        //源目录
        File src = new File("D:\\book\\a");
        //目标目录
        File dest = new File("D:\\book\\copy");
        dest.mkdir();
        copyDir(src,dest);
    }
    public static void copyDir(File src,File dest) throws IOException {
        //为了严谨，首先对源目录和目标目录进行判断。是不是目录
        if (src.isDirectory()&&dest.isDirectory()){
            File newDir = new File(dest,src.getName());
            if (!newDir.exists()){
                newDir.mkdir();
            }
            //先获取源目录下的文件和子目录
            File [] files = src.listFiles();
            for (File file:files
                 ) {
                if (file.isFile()){
                    //如果是文件，就进行复制
                    //创建输入流对象
                    FileInputStream fis = new FileInputStream(file);
                    //创建输出流对象
                    FileOutputStream fos = new FileOutputStream(new File(newDir,file.getName()));
                    byte[] bys = new byte[1024];
                    int len;
                    while ((len=fis.read(bys))!=-1){
                        fos.write(bys,0,len);
                    }
                }
                else if (file.isDirectory()){
                    //如过是子目录，递归
                    copyDir(file,newDir);
                }
            }
        }
    }

}
