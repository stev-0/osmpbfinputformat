package io.github.gballet.osmpbf;

import java.util.List;
import java.util.Map;

public class OsmPrimitive {
	public boolean isNode;
	public boolean isWay;
	public double lon;
	public double lat;
	public long id;
	public Map<String,String> nodeTags;
	public Map<String, String> wayTags;
	
	public List<Long> wayNodeList;
	
	public boolean isNode()
	{
		return isNode;
	}
	
	public boolean isWay()
	{
		return isWay;
	}
	
	// node constructor
	public OsmPrimitive(long id_, double lon_, double lat_, Map<String,String> tags_)
	{
		id = id_;
		lon = lon_;
		lat = lat_;
		nodeTags = tags_;
		
		isNode = true;
		isWay = false;
	}
	
	//way constructor	
	public OsmPrimitive(long id_, List<Long> nodeIDList, Map<String,String> tags) {
		id = id_;
		wayNodeList = nodeIDList;
		wayTags = tags;
		
		isNode = false;
		isWay = true;
	}
	
	public OsmPrimitive() {
		isNode = false;
	}


}
