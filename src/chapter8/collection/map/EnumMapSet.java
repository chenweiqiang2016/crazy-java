package chapter8.collection.map;

import java.util.EnumMap;

enum Litb{
	AIMS, PROCUREMENT, WMS, PC, MC;
}

public class EnumMapSet {
	public static void main(String args[]){
	   EnumMap em = new EnumMap(Litb.class);
	   em.put(Litb.AIMS, "抓取系统");
	   em.put(Litb.MC, "商户中心");
	   em.put(Litb.WMS, "仓储系统");
	   
	   System.out.println(em);
	}
}
