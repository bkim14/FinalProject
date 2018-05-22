package com.scsa.java.car4;

public class CarManager implements ICarMgr {
		
		private Car[] cars=new Car[100];
		private int index=0;
		
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#add(com.scsa.java.car4.Car)
		 */
		@Override
		public void add(Car c) {
			cars[index++]=c;
		}
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#size()
		 */
		@Override
		public int size() {
			return index;
		}
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#search()
		 */
		@Override
		public Car[] search() {
			Car[] result=new Car[index];
			for (int i=0;i<index;i++) {
				result[i]=cars[i];
			}
			return result;
		}
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#search(java.lang.String)
		 */
		@Override
		public Car search(String num) {
			for (int i=0;i<index;i++) {
				if (num.equals(cars[i].getNum())) {
					return cars[i];
				}
			}
			return null;
		}
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#update(java.lang.String, int)
		 */
		@Override
		public Boolean update(String num, int price) {
			boolean flag=false;
			for (int i=0;i<index;i++) {
				if(num.equals(cars[i].getNum())) {
					cars[i].setPrice(price);
					flag=true;
					break;
				}
			}
			return flag;
		}
		
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#getTotalPrice()
		 */
		@Override
		public int getTotalPrice() {
			int total=0;
			for (int i=0;i<index;i++) {
				total=total+cars[i].getPrice();
			}
			return total;
		}
		/* (non-Javadoc)
		 * @see com.scsa.java.car4.ICarMgr#getTotalSeat()
		 */
		@Override
		public int getTotalSeat() {
			int total=0;
			for (int i=0;i<index;i++) {
				if(cars[i] instanceof Bus) {
					Bus b=(Bus)cars[i];
					total=total+b.getSeat();
				}
				
			}
			return total;
		} 
		
}
