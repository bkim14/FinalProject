package com.scsa.ImageTest;

import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageTest {
	public static void main(String[] args) {

		try {
			// 사용법
			// 이미지 파일의 이름과 확장자를 입력
			String title = "draw";
			String comm = "jpg";
			BufferedImage samplez_y_x = ImageIO.read(
					new File("C:\\SCSA\\local_Final\\Test_naver_web\\WebContent\\imgs\\" + title + "0_0_0" + "." + comm));
			int width = samplez_y_x.getWidth();
			int height = samplez_y_x.getHeight();
			int type = samplez_y_x.getType();
			BufferedImage newImage = new BufferedImage(width, height, type);

			int i = 0;
			int j = 0;

			for (int z = 1; z <4; z++) {
				int d = (int) Math.pow(2, z-1);
				for (i = 0; i < d; i++) {
					for (j = 0; j < d; j++) {

						System.out.println(z-1  + " " + i + " " + j);
						samplez_y_x = ImageIO.read(new File("C:\\SCSA\\local_Final\\Test_naver_web\\WebContent\\imgs\\"
								+ title + (z-1 ) + "_" + i + "_" + j + "." + comm));

						for (int y = 2 * i; y <= 2 * i + 1; y++) {
							for (int x = 2 * j; x <= 2 * j + 1; x++) {
								System.out.println("타일 값 :" + x + " " + y);
								if (y == 2 * i) {
									if (x == 2 * j) {
										newImage.createGraphics().drawImage(samplez_y_x, 0, 0, width, height, 0, 0,
												width / 2, height / 2, null);
										ImageIO.write(newImage, comm,
												new File("C:\\SCSA\\local_Final\\Test_naver_web\\WebContent\\imgs\\" + title
														+ z + "_" + y + "_" + x + "." + comm));
									} else {
										newImage.createGraphics().drawImage(samplez_y_x, 0, 0, width, height, width / 2,
												0, width, height / 2, null);
										ImageIO.write(newImage, comm,
												new File("C:\\SCSA\\local_Final\\Test_naver_web\\WebContent\\imgs\\" + title
														+ z + "_" + y + "_" + x + "." + comm));
									}
								} else {
									if (x == 2 * j) {
										newImage.createGraphics().drawImage(samplez_y_x, 0, 0, width, height, 0,
												height / 2, width / 2, height, null);
										ImageIO.write(newImage, comm,
												new File("C:\\SCSA\\local_Final\\Test_naver_web\\WebContent\\imgs\\" + title
														+ z + "_" + y + "_" + x + "." + comm));
									} else {
										newImage.createGraphics().drawImage(samplez_y_x, 0, 0, width, height, width / 2,
												height / 2, width, height, null);
										ImageIO.write(newImage, comm,
												new File("C:\\SCSA\\local_Final\\Test_naver_web\\WebContent\\imgs\\" + title
														+ z + "_" + y + "_" + x + "." + comm));
									}
								}
							}
						}
					}
				}
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}