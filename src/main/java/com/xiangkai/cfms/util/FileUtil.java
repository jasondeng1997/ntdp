package com.xiangkai.cfms.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;
import java.time.LocalDate;

/**
 * 文件工具类
 * 
 * @author kaiqin.xu
 *
 */
public class FileUtil {

	public static String saveFile(MultipartFile file, String pathname) {
		try {
			File targetFile = new File(pathname);
			if (targetFile.exists()) {
				return pathname;
			}

			if (!targetFile.getParentFile().exists()) {
				targetFile.getParentFile().mkdirs();
			}
			file.transferTo(targetFile);

			return pathname;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static boolean deleteFile(String pathname) {
		File file = new File(pathname);
		if (file.exists()) {
			boolean flag = file.delete();

			if (flag) {
				File[] files = file.getParentFile().listFiles();
				if (files == null || files.length == 0) {
					file.getParentFile().delete();
				}
			}

			return flag;
		}

		return false;
	}

	public static String fileMd5(InputStream inputStream) {
		try {
			return DigestUtils.md5Hex(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String getPath() {
		return "/" + LocalDate.now().toString().replace("-", "/") + "/";
	}

	/**
	 * 将文本写入文件
	 * 
	 * @param value
	 * @param path
	 */
	public static void saveTextFile(String value, String path) {
		FileWriter writer = null;
		try {
			File file = new File(path);
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}

			writer = new FileWriter(file);
			writer.write(value);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static String getText(String path) {
		File file = new File(path);
		if (!file.exists()) {
			return null;
		}

		try {
			return getText(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String getText(InputStream inputStream) {
		InputStreamReader isr = null;
		BufferedReader bufferedReader = null;
		try {
			isr = new InputStreamReader(inputStream, "utf-8");
			bufferedReader = new BufferedReader(isr);
			StringBuilder builder = new StringBuilder();
			String string;
			while ((string = bufferedReader.readLine()) != null) {
				string = string + "\n";
				builder.append(string);
			}

			return builder.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	/**
	 * 图片到byte数组
	 */
	public static byte[] image2byte(String path) throws Exception {
		byte[] data = null;
		FileImageInputStream input = null;
		try {
			input = new FileImageInputStream(new File(path));
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			byte[] buf = new byte[1024];
			int numBytesRead = 0;
			while ((numBytesRead = input.read(buf)) != -1) {
				output.write(buf, 0, numBytesRead);
			}
			data = output.toByteArray();
			output.close();
			input.close();
		}
		catch (Exception ex) {
			// ex.printStackTrace();
			throw new Exception("图片获取异常,path="+path);
		}
		return data;
	}
}
