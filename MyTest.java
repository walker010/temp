package tempPrectice;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.fastjson.JSONObject;
public class MyTest {

	private static List<List<Object>> list = new ArrayList<List<Object>>();

	public static void main(String[] args) {

		List<Object> init = new ArrayList<Object>();
		init.add("����ID1");
		init.add("");
		init.add("����1");
		init.add(1);
		init.add(2);
		init.add(3);
		list.add(init);

		init = new ArrayList<Object>();

		init.add("����ID2");
		init.add("");
		init.add("����2");
		init.add(4);
		init.add(5);
		init.add(6);
		list.add(init);	

		init = new ArrayList<Object>();
		init.add("����ID11");
		init.add("����ID1");
		init.add("����3");
		init.add(7);
		init.add(8);
		init.add(9);
		list.add(init);

		init = new ArrayList<Object>();
		init.add("����ID21");
		init.add("����ID2");
		init.add("����4");
		init.add(10);
		init.add(11);
		init.add(12);
		list.add(init);

		init = new ArrayList<Object>();
		init.add("����ID22");
		init.add("����ID2");
		init.add("����5");
		init.add(13);
		init.add(14);
		init.add(15);
		list.add(init);

		init = new ArrayList<Object>();
		init.add("����ID111");
		init.add("����ID11");
		init.add("����6");
		init.add(16);
		init.add(17);
		init.add(18);
		list.add(init);

		init = new ArrayList<Object>();
		init.add("����ID211");
		init.add("����ID21");
		init.add("����7");
		init.add(19);
		init.add(20);
		init.add(21);
		list.add(init);

		init = new ArrayList<Object>();
		init.add("����ID2111");
		init.add("����ID211");
		init.add("����8");
		init.add(22);
		init.add(23);
		init.add(24);
		list.add(init);
		System.out.println(JSONObject.toJSONString(getChildren("")));
	}	

	public static List<Node> getChildren(String key){
		List<Node> nodeList = new ArrayList<Node>();
		for(List<Object> listOne : list){
			if(key.equalsIgnoreCase(listOne.get(1).toString())){
				Node n = new Node();
				n.setMainData(listOne.subList(2, 6));
				n.setSubData(getChildren(listOne.get(0).toString()));
				nodeList.add(n);
			}else{
				continue;
			}
		}
		return nodeList;
	}

}
