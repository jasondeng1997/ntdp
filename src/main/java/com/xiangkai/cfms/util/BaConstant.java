package com.xiangkai.cfms.util;

public class BaConstant {
	public static final String WMS_CENTER_DEPT = "3"; //物流中心机构
	
	public static final int WMS_EXTERNAL_CUSTOMER = 2; //外协厂商
	
	public static final String ZPL_PRINT_BAR = "^FO80,50^BQN,2,10^FDM,${data}^FS";//二维码样式模板
	// 打印初始化单位
	public static class INIT_PRINTER{
		// lable的x轴
		public static final int kx = 330;
		// value的x轴
		public static final int vx = 450;
		// y轴
		public static final int fh = 60;
		// y轴的纵间距
		public static final int fs = 60;
		// 英文字体高度,宽度,间距
		public static final int eh = 30;
		public static final int ew = 30;
		public static final int es = 30;
		// 中文x轴字体图形放大倍率。范围1-10，默认1
		public static final int mx = 1;
		// 中文y轴字体图形放大倍率。范围1-10，默认1
		public static final int my = 1;
		// 中文字体间距
		public static final int ms = 24;
	}
	
	public static final String USE_FLAG_0 = "0"; //作废
	public static final String USE_FLAG_1 = "1"; //使用中
	
	public static final String STOCK_FLAG_RK = "RK"; //入库
	public static final String STOCK_FLAG_CK = "CK"; //出库
	public static final String STOCK_FLAG_PK = "PK"; //盘点库
	
	// 入库申请单状态
	public static class STOCK_IN_STATUS{
		public static final String DRAFT = "0"; // 草稿
		public static final String AUDIT_IN = "1"; // 待审批
		public static final String AUDIT_FA = "2"; // 审批退回
		public static final String AUDIT_SU = "3"; // 审批完成
		public static final String CHECK_IN = "4"; // 检验中
		public static final String CHECK_DONE = "5"; // 检验完成
		public static final String UP_IN = "6"; // 上架中
		public static final String DONE = "7"; // 完成
		public static final String UP_DONE = "8"; // 上架完成
		public static final String CHECK_SURE = "9"; // 安检确认
	}

	// 出库申请单状态
	public static class STOCK_OUT_STATUS{
		public static final String DRAFT = "0"; // 草稿
		public static final String AUDIT_IN = "1"; // 待审批
		public static final String AUDIT_FA = "2"; // 审批退回
		public static final String AUDIT_SU = "3"; // 审批完成
		public static final String CHECK_IN = "4"; // 检验中
		public static final String CHECK_DONE = "5"; // 检验完成
		public static final String DOWN_IN = "6"; // 下架中
		public static final String DONE = "7"; // 完成
		public static final String DOWN_DONE = "8"; // 下架完成
	}
	
	// 待办项
	public static class READY_MENU{
		public static final String WMS_STOCK_IN = "wmsStockIn"; // 入库申请
		public static final String WMS_STOCK_IN_AUDIT = "wmsStockInAudit"; // 入库审批
		public static final String WMS_STOCK_OUT = "wmsStockOut"; // 出库申请
		public static final String WMS_STOCK_OUT_AUDIT = "wmsStockOutAudit"; // 出库审批
	}
	
	
}
