package by.academy.homework.homework3;

import java.util.Scanner;

public class Camera extends Product {
		public static final double CAMERA_DISCOUNT = 0.5;
		private int megapx;
		private boolean digital;

		public Camera() {
			super();
		}
		
		public Camera(String title, double price, int quantity, int megapx, boolean digital) {
			super(title, price, quantity);
			this.megapx = megapx;
			this.digital = digital;
		}

		public int getMegapix() {
			return megapx;
		}

		public void setMegapix(int megapix) {
			this.megapx = megapx;
		}

		public boolean getDigital() {
			return digital;
		}

		public void setDigital(boolean digital) {
			this.digital = digital;
		}

		@Override
		public double discount() {
			if ((!digital) && (quantity % 2 == 0)) {
				return CAMERA_DISCOUNT;
			}
			return 1;
		}
	}