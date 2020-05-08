package net.togogo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;

@Controller
public class FileUploadController {

    @RequestMapping(value = "getfileupload",method = RequestMethod.GET)
    public String getFileLoad(){
        return "fileupload";
    }

    @RequestMapping(value = "fileupload",method = RequestMethod.POST)
    public String uploadFile(HttpServletRequest request, HttpSession session, String username,
                             @RequestParam("file")MultipartFile upLoadFile) throws IOException {
        System.out.println("username = " + username);
//        System.out.println("作者：" + request.getParameter("username"));
        String filename = upLoadFile.getOriginalFilename();
        System.out.println("获取到的文件名： " + filename);
        String realPath = session.getServletContext().getRealPath("/img");
        File file =new File(realPath,filename);
        System.out.println(file.getPath());
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdir();
            System.out.println("file = " + file);
        }
        upLoadFile.transferTo(file);
        return "success";
    }

//    http://localhost:8080/test/download?filePath=/img/Surface Book.jpg
    @RequestMapping(value = "download",method = RequestMethod.GET)
    public void download(String filePath,HttpServletRequest request,HttpServletResponse response) throws IOException {
        String realPath = request.getSession().getServletContext().getRealPath(filePath);
        System.out.println("获取到的目标文件路径 = " + realPath);
        String newFileName = "新文件.jpg";
//        告诉浏览器以此种编码来解析URLEncoder.encode(realPath, "utf-8"))// 告诉浏览器以此种编码来解析URLEncoder.encode(realPath, "utf-8"))
        response.setHeader("content-disposition", "attachment; filename=" + URLEncoder.encode(newFileName, "utf-8"));
        FileInputStream fileInputStream = new FileInputStream(realPath);
        int length = 0;
//        1M
        byte[] buf= new byte[1024*1024];
        while((length=fileInputStream.read(buf))!=-1){
            System.out.println("1");    //执行了两次
            response.getOutputStream().write(buf,0,length);
        }
    }

}
