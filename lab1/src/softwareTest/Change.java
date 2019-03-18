package softwareTest;

public class Change {
	/*5个参数分别是
	 * 50元纸币的张数、20元纸币的张数、5元纸币的张数、1元硬币的枚数、给定想要匹配数字
	 */
  public boolean changeTest(int numberOfFif, int numberOfTw, int numberOfFi,int numberOfOn, int cash) {
	  //所需50元的张数
	  int orderFif = cash/50;
	  //若所需50元张数大于给定张数，则减去给定张数的钱，否则减去所需张数的钱
	  cash = orderFif > numberOfFif ? cash-numberOfFif*50 : cash-orderFif*50;
	  //以此类推
	  int orderTw = cash/20;
	  cash = orderTw > numberOfTw ? cash-numberOfTw*20 : cash-orderTw*20;
	  int orderFi = cash/5;
	  cash = orderFi > numberOfFi ? cash-numberOfFi*5 : cash-orderFi*5;
	  cash = cash > numberOfOn ? cash-numberOfOn*1 : 0;
	  if(cash==0) return true;
	  return false;
  }
}
