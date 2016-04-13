package com.example.macair.drawviewdemo.com.hzb.view.adapter;

import java.util.HashMap;
import java.util.List;

public interface DragGridBaseAdapter {
	/**
	 * 重新排列数据
	 * @param oldPosition
	 * @param newPosition
	 */
	public void reorderItems(int oldPosition, int newPosition);
	
	
	/**
	 * 设置某个item隐藏
	 * @param hidePosition
	 */
	public void setHideItem(int hidePosition);


	public void removeItem(int mDragPosition);
	public List<HashMap<String, Object>> getList();

}
