package com.bn.data;

import java.util.ArrayList;

/**
 * 游戏数据类
 * @author dell
 *
 */
public class GameData 
{
    /**
     * 客户端的 ip地址
     */
    public static ArrayList<String> clientList=new ArrayList<String>();     //三个客户端的 ip地址

    /** 记录当前连接的客户端数量 */
    public static int connectCount=0;               // 记录当前连接的客户端数量
    /**
     * 记录客户端准备的数量
     */
    public static int prepareCount=0;               //记录客户端准备的数量
    /**
     * 记录准备的状态
     */
    public static ArrayList<Integer> prepareState=new ArrayList<Integer>(); //记录准备的状态
    
    public static int client;
    
    //发牌  0~53
    public static int client1[];        
    public static int client2[];
    public static int client3[];
    /**
     * 底牌
     */
    public static int endCard[];    //底牌
    public static int endIndex[];
    
    /**
     * 玩家出的牌的类型  100为空，没有牌
     */
    public static int card1Sort=100;
    /**
     * 玩家出的牌的类型  100为空，没有牌
     */
    public static int card2Sort=100;
    /**
     * 玩家出的牌的类型  100为空，没有牌
     */
    public static int card3Sort=100;
    /**
     * 玩家出的牌的索引
     */
    public static int cardId1[];
    /**
     * 玩家出的牌的索引
     */
    public static int cardId2[];
    /**
     * 玩家出的牌的索引
     */
    public static int cardId3[];
    //进行了多少回合
    public static int round=1;      //当前为一轮的开始 ，不可以不出牌      1不出，0必须出
    /**
     * 拥有牌权的ID
     */
    public static int ownCard=-1;   //
    /**
     * 当前玩家的能否出牌     1为可以出牌，0不可以出牌
     */
    public static int ownState=0;   //当前玩家的能否出牌     1为可以出牌，0不可以出牌
    public static int noCount=0;
    
    /**
     * 当前牌权
     */
    public static int landlord;     //
    /**
     * 叫地主的列表
     */
    public static ArrayList<Integer> landlordList=new ArrayList<Integer>(); //
    /**
     * 地主次数
     */
    public static int landlordCount=0;  //
    /**
     * 用户叫地主的转态,1叫地主,0不叫
     */
    public static int landlordState[];
    
    /**
     * 游戏倍数
     */
    public static  int multiple=15; //
    
    public static int num=0;
    //音效
    public static int effect_Row=-1;
    public static int effect_Col=-1;
    
    
    
}
