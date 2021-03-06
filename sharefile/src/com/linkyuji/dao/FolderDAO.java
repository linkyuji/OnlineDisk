package com.linkyuji.dao;

import java.util.List;

import com.linkyuji.bean.FolderBean;

public interface FolderDAO {
	public void insertFolder(FolderBean fb);
	public List<FolderBean> loadFolderbyid(FolderBean fb);
	public FolderBean getFolderinfo(int id);
	public void deleteFolder(int id);
}
