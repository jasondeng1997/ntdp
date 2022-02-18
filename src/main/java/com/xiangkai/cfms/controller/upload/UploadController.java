package com.xiangkai.cfms.controller.upload;


import com.xiangkai.cfms.util.ResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

@RestController
@RequestMapping("/upload")
public class UploadController {
    private final Logger logger = LoggerFactory.getLogger(UploadController.class);

    @Value("${upload.root-path}")
    private String rootPath;

//    @Resource
//    UploadService uploadService;



//    @PostMapping("/create")
//    public BaseResponseDTO create(@RequestParam("file") MultipartFile file,
//                                  @RequestParam("customerId") Integer customerId) {
//        logger.info("UploadController create begin, fileName = {}, customerId = {}", file.getOriginalFilename(), customerId);
//        try {
//            String imageName = uploadService.store(file, customerId);
//
//            return ResponseUtil.ok(imageName);
//        }catch(Exception ex) {
//            logger.error("UploadController create exception, {}", ex);
//            return ResponseUtil.fail("文件上传异常：" + ex.getLocalizedMessage());
//        }
//    }

//    @ApiOperation("文件删除")
//    @PostMapping("/delete")
//    public BaseResponseDTO delete(@RequestParam("customerId") Integer customerId) {
//        try {
//            logger.info("UploadController delete, customerId =  {}", customerId);
//
//            int executeResult = uploadService.delete(customerId);
//
//            return ResponseUtil.ok(executeResult);
//        }catch(Exception ex) {
//            logger.error("UploadController create exception, {}", ex);
//            return ResponseUtil.fail("文件删除异常：" + ex.getLocalizedMessage());
//        }
//    }

//    /**
//     * 访问头像图片
//     *
//     * @param fileName 头像图片名称
//     * @return
//     */
//    @GetMapping("/fetch/{fileName:.+}")
//    public ResponseEntity<org.springframework.core.io.Resource> fetch(@PathVariable String fileName) {
//        logger.info("UploadController fetch begin, fileName = {}", fileName);
//
//        MediaType mediaType = MediaType.parseMediaType("image/png");
//
//        org.springframework.core.io.Resource file = uploadService.loadAsResource(fileName);
//        if (file == null) {
//            return ResponseEntity.notFound().build();
//        }
//        return ResponseEntity.ok().contentType(mediaType).body(file);
//    }

//    @ApiOperation("文件下载")
//    @PostMapping(value = "/download")
//    public void download(HttpServletResponse res, @RequestParam("customerId") Integer customerId) {
//        logger.info("UploadController download, customerId =  {}", customerId);
//
//        BufferedInputStream bis = null;
//        OutputStream os = null;
//        try {
//            Customer customer = customerService.get(customerId);
//
//            res.setHeader("content-type", "application/octet-stream");
//            res.setContentType("application/octet-stream");
//            res.setHeader("Content-Disposition", "attachment;filename=" + customer.getImageName());
//            byte[] buff = new byte[1024];
//
//            os = res.getOutputStream();
//            bis = new BufferedInputStream(new FileInputStream(new File(rootPath + File.separator
//                    + customer.getImageName())));
//            int len = 0;
//            while ((len = bis.read(buff)) > 0) {
//                os.write(buff, 0, len);
//                os.flush();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            if (bis != null) {
//                try {
//                    bis.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        logger.info("UploadController download success");
//    }
}
