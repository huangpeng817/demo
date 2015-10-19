package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class JsonStr2JavaObject {
	public static void main(String[] args) {
		String json = "{" + "'PriceProductType': '1'," + "'PriceRouteType': 'OW'," + "'PriceList': [{"
				+ "'PassengerType': 'ADT'," + "'FareBasis': 'Y93'," + "'TourCode': 'EH'," + "'Discount': '93',"
				+ "'EI': '免费更改'," + "'Comment': 'null'," + "'Baggage': '20KG'," + "'ValidityPeriod': 'null',"
				+ "'MinStay': 'null'," + "'PriceValue': 1760," + "'RSP': 1890," + "'RefundedFlag': true,"
				+ "'RefundedComment': '航班起飞前2小时（含），免费退票；航班起飞前2小时内及航班起飞后，收取10%的退票手续费（退票手续费不得低于50元）。',"
				+ "'ChangedComment': '免费改期；允许签转；'," + "'RescheduledFlag': true," + "'FreeChangeTimes': 99,"
				+ "'UpgradeFlag': true," + "'ChangeAirLineFlag': true," + "'YPrice': 1890," + "'FareID': '17292',"
				+ "'YQTax': 100," + "'CNTax': 50," + "'CombineRuleInfo': 'null',"
				+ "'FareSign': 'AD489916A9561C9757E00F2475E60CDBDD5E66C2'" + "}]" + "}";
		json = json.replace("null", "1111");
		System.out.println(json);
		Map<String, Object> classMap = new HashMap<String, Object>();
		classMap.put("PriceList", HOPrice.class);

		HOProductPrice bean = (HOProductPrice) JSONObject.toBean(JSONObject.fromObject(json), HOProductPrice.class,
				classMap);
		System.out.println(bean);

	}

	public class HOProductPrice {
		public HOProductPrice() {
			super();
		}

		private String PriceProductType = "";
		private String PriceRouteType = "";
		private List<HOPrice> PriceList;
		// set,get

	}

	public class HOPrice {
		public HOPrice() {
			super();
		}

		private String PassengerType = "";
		private String FareBasis = "";
		private String TourCode = "";
		private String Discount = "";
		private String EI = ""; //
		private String Comment = "";
		private String Baggage = "";
		private String ValidityPeriod = "";
		private String MinStay = "";
		private double PriceValue = 0.0;
		private double RSP = 0.0; //
		private boolean RefundedFlag;
		private String RefundedComment = "";
		private String ChangedComment = "";
		private boolean RescheduledFlag;
		private int FreeChangeTimes = 0;
		private boolean ChangeAirLineFlag;
		private boolean UpgradeFlag;
		private double YPrice = 0.0; //
		private String FareID = "";
		private double YQTax = 0.0; //
		private double CNTax = 0.0; //
		private String FareSign = "";
		private String CombineRuleInfo = "";
		// set,get
	}

}
