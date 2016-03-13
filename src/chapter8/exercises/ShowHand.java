package chapter8.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 实现控制台梭哈游戏
 */

public class ShowHand {
	private final int MAX_NUM = 5;
	
	String[] types = {"黑桃", "红桃", "梅花", "方块"};
	
	String[] digits = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	String[] players = new String[MAX_NUM];
	
    List<String>[] playerCards = new LinkedList[MAX_NUM];
	
	List<String> cards = new ArrayList<String>();
	/**
	 * 初始化游戏者
	 */
	public void initPlayers(String...names){
		if (names.length<2 || names.length>5){
			System.out.println("参加的人数不符合要求[要求2-5人]");
			return; //TODO:修改为抛出异常
		}
		for(int i=0; i<names.length; i++){
			players[i] = names[i];
		}
		System.out.print("参加者是: ");
		for(int i=0; i<names.length; i++){
			System.out.print(names[i] + " ");
		}
		System.out.println();
	}
	/**
	 * 初始化每个游戏者的手中的牌
	 */
	public void initPlayerCards(){
		for(int i=0; i<MAX_NUM; i++){
			if(players[i]!=null && !players[i].equals("")){
				playerCards[i] = new LinkedList();
			}
		}
	}
	/*	
	 * 洗牌
	 */
	public void initCards(){
		for(int i=0; i<types.length; i++){
			for(int j=0; j<digits.length; j++){
				cards.add(types[i]+digits[j]);
			}
		}
		Collections.shuffle(cards);
	}
	/**
	 * 测试方法, 输出全部牌
	 */
	public void showCards(){
		System.out.print("洗完的牌如下: ");
		for(Object obj:cards){
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	/**
	 * 发牌
	 */
	public void delivery(String name){//暂时不考虑这个因素
		for(int i=0; i<MAX_NUM; i++){
			if(players[i]!=null && !players[i].equals("")){
				playerCards[i].add(cards.get(0));
				cards.remove(0);
			}
		}
	}
	/**
	 * main方法测试
	 */
	public static void main(String[] args){
		ShowHand sh = new ShowHand();
		sh.initPlayers("炎龙侠", "孙悟空");
		sh.initCards();
		sh.showCards();
		sh.initPlayerCards();
		sh.delivery("TODO");
		sh.delivery("TODO");

		System.out.print("炎龙侠的牌是: ");
		for(String s:sh.playerCards[0])
			System.out.print(s + " ");
		System.out.println();

		System.out.print("孙悟空的牌是: ");
		for(String s:sh.playerCards[1])
			System.out.print(s + " ");
	}
}
