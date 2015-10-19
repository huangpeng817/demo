package nestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class Test {
	public static void main(String[] args) {
		String json="{"+
			            "'PriceProductType': '1',"+
			            "'PriceRouteType': 'OW',"+
			            "'PriceList': [{"+
			                "'PassengerType': 'ADT',"+
			                "'FareBasis': 'Y93',"+
			                "'TourCode': 'EH',"+
			                "'Discount': '93',"+
			                "'EI': '免费更改',"+
			                "'Comment': 'null',"+
			                "'Baggage': '20KG',"+
			                "'ValidityPeriod': 'null',"+
			                "'MinStay': 'null',"+
			                "'PriceValue': 1760,"+
			                "'RSP': 1890,"+
			                "'RefundedFlag': true,"+
			                "'RefundedComment': '航班起飞前2小时（含），免费退票；航班起飞前2小时内及航班起飞后，收取10%的退票手续费（退票手续费不得低于50元）。',"+
			                "'ChangedComment': '免费改期；允许签转；',"+
			                "'RescheduledFlag': true,"+
			                "'FreeChangeTimes': 99,"+
			                "'UpgradeFlag': true,"+
			                "'ChangeAirLineFlag': true,"+
			                "'YPrice': 1890,"+
			                "'FareID': '17292',"+
			                "'YQTax': 100,"+
			                "'CNTax': 50,"+
			                "'CombineRuleInfo': 'null',"+
			                "'FareSign': 'AD489916A9561C9757E00F2475E60CDBDD5E66C2'" +
			            "}]" +
			        "}";
		json = json.replace("null", "1111");
		System.out.println(json);
		Map<String, Object> classMap = new HashMap<String, Object> ();
		classMap.put( "PriceList", HOPrice.class );
		
		
		HOProductPrice bean = (HOProductPrice)JSONObject.toBean( JSONObject.fromObject(json), HOProductPrice.class, classMap);
		System.out.println(bean);
		
	}

public class HOProductPrice {
	public HOProductPrice() {
		super();
	}

	private String PriceProductType = "";
	private String PriceRouteType = "";
	private List<HOPrice> PriceList;
//set,get
	public String getPriceProductType() {
		return PriceProductType;
	}
	public void setPriceProductType(String priceProductType) {
		PriceProductType = priceProductType;
	}
	public String getPriceRouteType() {
		return PriceRouteType;
	}
	public void setPriceRouteType(String priceRouteType) {
		PriceRouteType = priceRouteType;
	}
	public List<HOPrice> getPriceList() {
		return PriceList;
	}
	public void setPriceList(List<HOPrice> priceList) {
		PriceList = priceList;
	}
	@Override
	public String toString() {
		return "HOProductPrice [PriceProductType=" + PriceProductType + ", PriceRouteType=" + PriceRouteType
				+ ", PriceList=" + PriceList + "]";
	}
	

}
public class HOPrice {
	public HOPrice() {
		super();
	}

	private String PassengerType = "";
	private String FareBasis = "";
	private String TourCode = "";
	private String Discount = "";
	private String EI = "";    //
	private String Comment = "";
	private String Baggage = "";
	private String ValidityPeriod = "";
	private String MinStay = "";
	private double PriceValue = 0.0 ;
	private double RSP = 0.0 ;    //
	private boolean  RefundedFlag;
	private String RefundedComment = "";
	private String ChangedComment = "";
	private boolean  RescheduledFlag;
	private int FreeChangeTimes = 0 ;
	private boolean ChangeAirLineFlag;
	private boolean UpgradeFlag ;
	private double YPrice = 0.0  ;  //
	private String FareID = "";
	private double YQTax = 0.0;     //
	private double CNTax = 0.0;     //
	private String FareSign = "";
	private String CombineRuleInfo="";
//set,get
	public String getPassengerType() {
		return PassengerType;
	}
	public void setPassengerType(String passengerType) {
		PassengerType = passengerType;
	}
	public String getFareBasis() {
		return FareBasis;
	}
	public void setFareBasis(String fareBasis) {
		FareBasis = fareBasis;
	}
	public String getTourCode() {
		return TourCode;
	}
	public void setTourCode(String tourCode) {
		TourCode = tourCode;
	}
	public String getDiscount() {
		return Discount;
	}
	public void setDiscount(String discount) {
		Discount = discount;
	}
	public String getEI() {
		return EI;
	}
	public void setEI(String eI) {
		EI = eI;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public String getBaggage() {
		return Baggage;
	}
	public void setBaggage(String baggage) {
		Baggage = baggage;
	}
	public String getValidityPeriod() {
		return ValidityPeriod;
	}
	public void setValidityPeriod(String validityPeriod) {
		ValidityPeriod = validityPeriod;
	}
	public String getMinStay() {
		return MinStay;
	}
	public void setMinStay(String minStay) {
		MinStay = minStay;
	}
	public double getPriceValue() {
		return PriceValue;
	}
	public void setPriceValue(double priceValue) {
		PriceValue = priceValue;
	}
	public double getRSP() {
		return RSP;
	}
	public void setRSP(double rSP) {
		RSP = rSP;
	}
	public boolean isRefundedFlag() {
		return RefundedFlag;
	}
	public void setRefundedFlag(boolean refundedFlag) {
		RefundedFlag = refundedFlag;
	}
	public String getRefundedComment() {
		return RefundedComment;
	}
	public void setRefundedComment(String refundedComment) {
		RefundedComment = refundedComment;
	}
	public String getChangedComment() {
		return ChangedComment;
	}
	public void setChangedComment(String changedComment) {
		ChangedComment = changedComment;
	}
	public boolean isRescheduledFlag() {
		return RescheduledFlag;
	}
	public void setRescheduledFlag(boolean rescheduledFlag) {
		RescheduledFlag = rescheduledFlag;
	}
	public int getFreeChangeTimes() {
		return FreeChangeTimes;
	}
	public void setFreeChangeTimes(int freeChangeTimes) {
		FreeChangeTimes = freeChangeTimes;
	}
	public boolean isChangeAirLineFlag() {
		return ChangeAirLineFlag;
	}
	public void setChangeAirLineFlag(boolean changeAirLineFlag) {
		ChangeAirLineFlag = changeAirLineFlag;
	}
	public boolean isUpgradeFlag() {
		return UpgradeFlag;
	}
	public void setUpgradeFlag(boolean upgradeFlag) {
		UpgradeFlag = upgradeFlag;
	}
	public double getYPrice() {
		return YPrice;
	}
	public void setYPrice(double yPrice) {
		YPrice = yPrice;
	}
	public String getFareID() {
		return FareID;
	}
	public void setFareID(String fareID) {
		FareID = fareID;
	}
	public double getYQTax() {
		return YQTax;
	}
	public void setYQTax(double yQTax) {
		YQTax = yQTax;
	}
	public double getCNTax() {
		return CNTax;
	}
	public void setCNTax(double cNTax) {
		CNTax = cNTax;
	}
	public String getFareSign() {
		return FareSign;
	}
	public void setFareSign(String fareSign) {
		FareSign = fareSign;
	}
	public String getCombineRuleInfo() {
		return CombineRuleInfo;
	}
	public void setCombineRuleInfo(String combineRuleInfo) {
		CombineRuleInfo = combineRuleInfo;
	}
	@Override
	public String toString() {
		return "HOPrice [PassengerType=" + PassengerType + ", FareBasis=" + FareBasis + ", TourCode=" + TourCode
				+ ", Discount=" + Discount + ", EI=" + EI + ", Comment=" + Comment + ", Baggage=" + Baggage
				+ ", ValidityPeriod=" + ValidityPeriod + ", MinStay=" + MinStay + ", PriceValue=" + PriceValue
				+ ", RSP=" + RSP + ", RefundedFlag=" + RefundedFlag + ", RefundedComment=" + RefundedComment
				+ ", ChangedComment=" + ChangedComment + ", RescheduledFlag=" + RescheduledFlag + ", FreeChangeTimes="
				+ FreeChangeTimes + ", ChangeAirLineFlag=" + ChangeAirLineFlag + ", UpgradeFlag=" + UpgradeFlag
				+ ", YPrice=" + YPrice + ", FareID=" + FareID + ", YQTax=" + YQTax + ", CNTax=" + CNTax + ", FareSign="
				+ FareSign + ", CombineRuleInfo=" + CombineRuleInfo + "]";
	}
	
}

}
